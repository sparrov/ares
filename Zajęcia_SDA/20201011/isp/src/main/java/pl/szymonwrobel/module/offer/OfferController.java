package pl.szymonwrobel.module.offer;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OfferController {
    @RequestMapping("/offer")
    public String getOffer(Model model) {
        model.addAttribute("pageTitle", "isp.pl - Oferta");
        model.addAttribute("h1", "Oferta");
        return "offer";
    }
}
