package com.szymonwrobel.module.home;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String getHome(Model model){

        PersonDto person1 = new PersonDto("Szymon", "Wróbel", 35);
        PersonDto person2 = new PersonDto("Ilona", "Wróbel", 30);
        PersonDto person3 = new PersonDto("Tymon", "Wróbel", 2);

        List<PersonDto> persons = List.of(person1, person2, person3);

        model.addAttribute("persons", persons);
        return "home";
    }
}
