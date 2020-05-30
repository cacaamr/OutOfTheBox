package com.quiz.OutOfTheBox;

import com.quiz.OutOfTheBox.model.Answer;
import com.quiz.OutOfTheBox.model.Pemain;
import com.quiz.OutOfTheBox.model.QnA;
import com.quiz.OutOfTheBox.model.Quiz;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {
    QnA qna = new QnA();
    String jawaban;

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
        Pemain.addPemain(pemain);
        return "hasil-form-username";
    }

    @GetMapping("/main")
    public String Main(@ModelAttribute Quiz quiz, Model model) {
        Quiz newquiz = new Quiz();
        String pertanyaan = quiz.getRandomQuestion();
        int index = quiz.getIndex();
        model.addAttribute("randomQuestion", pertanyaan);
        model.addAttribute("jawaban", new Answer());
        jawaban = newquiz.getAnswerbyIndex(index);
        return "main";
    }

    @PostMapping("/main2")
    public String menjawab(@ModelAttribute Pemain pemain, @ModelAttribute Answer answer, @ModelAttribute Quiz quiz,
            Model model) {
        if (!jawaban.equals(answer.getAnswer())) {
            pemain.kurangiNyawa();
            if (pemain.getNyawa() < 0) {
                return "gameover";
            }
            model.addAttribute("poin", "Jawaban anda salah. Coba lagi");
            model.addAttribute("jawab", jawaban);
            model.addAttribute("j", answer.getAnswer());
        } else {
            pemain.tambahSkor();
            model.addAttribute("poin", "Jawaban anda Benar");
        }
        return "main2";
    }

    @GetMapping("/leaderboard")
    public String leaderboard(Model model) {
        return "leaderboard";
    }

    @GetMapping("/gameover")
    public String gameover(Model model) {
        return "gameover";
    }
}