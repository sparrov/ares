package com.szymonwrobel.module.news.gdansk;

import com.szymonwrobel.module.news.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GdanskNewsController {
    @Autowired
    @Qualifier("gdanskNewsService")
    private NewsService newsService;
    @RequestMapping("/news/gdansk")
    public String getPosts(Model model) {
        model.addAttribute("news", newsService.getLastNews());
        return "news";
    }
}
