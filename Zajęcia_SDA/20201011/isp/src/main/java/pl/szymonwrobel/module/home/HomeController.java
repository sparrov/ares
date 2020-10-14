package pl.szymonwrobel.module.home;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String getHome(Model model) {
        model.addAttribute("pageTitle", "isp.pl - Strona główna");
        model.addAttribute("h1", "Strona główna");

        return "index";
    }

}
