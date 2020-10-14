package pl.szymonwrobel.module.about;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class AboutController {
    @RequestMapping("/about")
    public String getAbout(Model model){

        WorkerDto worker1 = new WorkerDto("Ilona", "Wróbel", 30, Position.HR_MANAGER, "gfx/iw.jpg");
        WorkerDto worker2 = new WorkerDto("Szymon", "Wróbel", 35, Position.CEO, "gfx/sw.jpg");
        WorkerDto worker3 = new WorkerDto("Tymon", "Wróbel", 2, Position.SECURITY_SPECIALIST, "gfx/tw.jpg");

        List<WorkerDto> workers = List.of(worker1, worker2, worker3);

        model.addAttribute("pageTitle", "isp.pl - O nas");
        model.addAttribute("h1", "O nas");
        model.addAttribute("workers", workers);

        return "about";
    }
}
