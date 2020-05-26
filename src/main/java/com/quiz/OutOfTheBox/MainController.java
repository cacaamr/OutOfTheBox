package com.quiz.OutOfTheBox;

import com.quiz.OutOfTheBox.model.Pemain;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import java.util.List;
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
        model.addAttribute("user", new Pemain());
        return "form-username";
    }

    /*
     * @PostMapping("/hasil-form-username") public String
     * hasilFormUser(@ModelAttribute User user) { return "hasil-form-username"; }
     */

    @GetMapping("/leaderboard")
    public String leaderboard(Model model) {
        return "leaderboard";
    }

    @GetMapping("/gameover")
    public String gameover(Model model) {
        return "gameover";
    }
}