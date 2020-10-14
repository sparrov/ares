package pl.szymonwrobel.module.contact;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ContactController {
    @RequestMapping("/contact")
    public String getContact(Model model){
        model.addAttribute("pageTitle", "isp.pl - Kontakt");
        model.addAttribute("h1", "Kontakt");
        return "contact";
    }
}
