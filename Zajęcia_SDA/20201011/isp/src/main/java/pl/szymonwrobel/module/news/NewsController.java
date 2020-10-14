package pl.szymonwrobel.module.news;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.szymonwrobel.module.news.service.ArticleService;
import pl.szymonwrobel.module.news.service.MenuService;

@Controller
public class NewsController {

    private ArticleService articleService;
    private MenuService menuService;

    @Autowired
    public NewsController(ArticleService articleService, MenuService menuService) {
        this.articleService = articleService;
        this.menuService = menuService;
    }

    @RequestMapping("/news")
    public String getNews(Model model) {
        model.addAttribute("pageTitle", "isp.pl - Nowości");
        model.addAttribute("h1", "Nowości");
        model.addAttribute("navA", "Nowości");
        model.addAttribute("newsMenu", menuService.getMenu());
        model.addAttribute("article", articleService.getArticle());
        model.addAttribute("activePage", "news");
        return "news";
    }

}
