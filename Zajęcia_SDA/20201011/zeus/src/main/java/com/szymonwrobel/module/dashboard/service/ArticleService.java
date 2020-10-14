package com.szymonwrobel.module.dashboard.service;

import com.szymonwrobel.module.dashboard.dto.ArticleDto;
import com.szymonwrobel.module.dashboard.dto.CommentDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleService {

    public ArticleDto getArticle() {
        return new ArticleDto()
                .setTitle("AWS Certified...")
                .setText("Lorem ipsum")
                .setComments(
                        List.of(
                                new CommentDto("admin1", "text1"),
                                new CommentDto("admin2", "text2"),
                                new CommentDto("admin3", "text3")
                        )
                );
    }
}
