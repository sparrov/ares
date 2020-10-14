package pl.szymonwrobel.module.news.service;

import org.springframework.stereotype.Service;
import pl.szymonwrobel.module.news.dto.ArticleDto;
import pl.szymonwrobel.module.news.dto.CommentDto;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ArticleService {
    public ArticleDto getArticle() {
        return new ArticleDto()
                .setTitle("Jak sprawdzić prędkość internetu?")
                .setDateTimeOfArticle(LocalDateTime.of(2017, 1, 23, 12, 34))
                .setTeaser("Zajawka artykułu")
                .setContentOfArticle("Pełna treść artykułu...")
                .setComments(
                        List.of(
                                new CommentDto("Admin", LocalDateTime.now(), "super!!!"),
                                new CommentDto("user1", LocalDateTime.now(), "extra!!!"),
                                new CommentDto("root", LocalDateTime.now(), "lux!!!")
                        )
                );
    }
}
