package com.szymonwrobel.module.news.sopot;

import com.szymonwrobel.module.news.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SopotNewsController {
    @Autowired
    @Qualifier("sopotNewsService")
    private NewsService newsService;
    @RequestMapping("/news/sopot")
    public String getPosts(Model model) {
        model.addAttribute("news", newsService.getLastNews());
        return "news";
    }
}
