package pl.szymonwrobel.module.order;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OrderController {
    @RequestMapping("/order")
    public String getOrder(Model model) {
        model.addAttribute("pageTitle", "isp.pl - Zamów");
        model.addAttribute("h1", "Zamów");
        return "order";
    }
}
