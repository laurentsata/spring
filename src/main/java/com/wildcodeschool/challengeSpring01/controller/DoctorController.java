package com.wildcodeschool.challengeSpring01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class DoctorController {

    @GetMapping("/doc1")
    @ResponseBody
    public String index() {
        return "William Hartnell <a href='https://fr.wikipedia.org/wiki/William_Hartnell'>Doctor who</a>";
        //return "Greetings from Spring Boot!";
    }

    @GetMapping("/doc2")
    @ResponseBody
    public String index2() {
        return "David Tennant <a href='https://fr.wikipedia.org/wiki/David_Tennant'>Doctor who</a>";
    }

    @GetMapping("/doc3")
    @ResponseBody
    public String index3() {
        return "Jodie Whittaker <a href='https://fr.wikipedia.org/wiki/Jodie_Whittaker'>Doctor who</a>";
    }

    @GetMapping("/doc4")
    @ResponseBody
    public String index4() {
        return "Matt Smith <a href='https://fr.wikipedia.org/wiki/Matt_Smith_(acteur)'>Doctor who</a>";
    }

    @GetMapping("/doc5")
    @ResponseBody
    public String index5() {
        return "Petet Capaldi <a href='https://fr.wikipedia.org/wiki/Peter_Capaldi'>Doctor who</a>";
    }
    
}