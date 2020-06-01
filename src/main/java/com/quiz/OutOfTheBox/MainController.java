package com.quiz.OutOfTheBox;

import java.util.*;
import com.quiz.OutOfTheBox.model.Answer;
import com.quiz.OutOfTheBox.model.Pemain;
import com.quiz.OutOfTheBox.model.QnA;
import com.quiz.OutOfTheBox.model.Quiz;
import com.quiz.OutOfTheBox.model.SortByScore;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {
    Pemain player;
    QnA qna = new QnA();
    String pertanyaan;
    String jawaban;
    int index;

    @GetMapping("/")
    public String index(Model model) {
        return "index";
    }

    @GetMapping("/form-username")
    public String formUser(Model model) {
        model.addAttribute("pemain", new Pemain());
        return "form-username";
    }

    @PostMapping("/hasil-form-username")
    public String hasilFormUser(@ModelAttribute Pemain pemain) {
        player = pemain;
        Pemain.addPemain(pemain);
        return "hasil-form-username";
    }

    @GetMapping("/main")
    public String Main(@ModelAttribute Quiz quiz, Model model) {
        pertanyaan = quiz.getRandomQuestion();
        index = quiz.getIndex();
        model.addAttribute("randomQuestion", pertanyaan);
        model.addAttribute("jawaban", new Answer());
        model.addAttribute("player", player);
        jawaban = quiz.getAnswerbyIndex(index);
        return "main";
    }

    @PostMapping("/main2")
    public String menjawab(@ModelAttribute Pemain pemain, @ModelAttribute Answer answer, @ModelAttribute Quiz quiz,
            Model model) {
        model.addAttribute("player", player);
        if (!jawaban.equals(answer.getAnswer())) {
            player.kurangiNyawa();
            if (player.getNyawa() <= 0) {
                return "gameover";
            }
            model.addAttribute("poin", "Jawaban anda salah. Coba lagi");

        } else {
            player.tambahSkor();
            model.addAttribute("poin", "Jawaban anda Benar");
            model.addAttribute("skor", pemain.getSkor());
        }
        model.addAttribute("skor", player.getSkor());
        model.addAttribute("nyawa", player.getNyawa());

        return "main2";
    }

    @GetMapping("/leaderboard")
    public String leaderboard(Model model) {
        ArrayList<Pemain> daftarPemain = Pemain.getDaftarPemain();
        Collections.sort(daftarPemain, new SortByScore());
        model.addAttribute("daftarPemain", daftarPemain);
        return "leaderboard";
    }

    @GetMapping("/gameover")
    public String gameover(Model model) {
        return "gameover";
    }
}