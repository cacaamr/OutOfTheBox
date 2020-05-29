package com.quiz.OutOfTheBox;

import com.quiz.OutOfTheBox.model.Pemain;
import com.quiz.OutOfTheBox.model.Quiz;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String index(Model model) {
        return "index";
    }

    @GetMapping("/form-username")
    public String formUser(Model model) {
        // model.addAttribute("pemain", new Pemain());
        return "form-username";
    }

    @PostMapping("/hasil-form-username")
    public String hasilFormUser(@ModelAttribute Pemain pemain) {
        Pemain.addPemain(pemain);
        return "hasil-form-username";
    }

    @GetMapping("/main")
    public String Main(@ModelAttribute Quiz quiz) {
        return "main";
    }

    @PostMapping("/main2")
    public String menjawab(@ModelAttribute Pemain pemain) {
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