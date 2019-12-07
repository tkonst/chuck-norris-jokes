package guru.springframework.chucknorriswebapp.controller;

import guru.springframework.chucknorriswebapp.service.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ChuckNorrisMVCController {
    private JokeService jokeService;

    public ChuckNorrisMVCController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({",", ""})
    public String getRandomJoke(Model model) {
        model.addAttribute("joke", jokeService.getNextRandomJoke());
        return "chuck_norris";
    }
}
