package pl.szymonwrobel.module.news.dto;

import java.time.LocalDateTime;
import java.util.List;

public class ArticleDto {
    private String title;
    private LocalDateTime dateTimeOfArticle;
    private String teaser;
    private String contentOfArticle;
    private List<CommentDto> comments;

    public String getTitle() {
        return title;
    }

    public ArticleDto setTitle(String title) {
        this.title = title;
        return this;
    }

    public LocalDateTime getDateTimeOfArticle() {
        return dateTimeOfArticle;
    }

    public ArticleDto setDateTimeOfArticle(LocalDateTime dateTimeOfArticle) {
        this.dateTimeOfArticle = dateTimeOfArticle;
        return this;
    }

    public String getTeaser() {
        return teaser;
    }

    public ArticleDto setTeaser(String teaser) {
        this.teaser = teaser;
        return this;
    }

    public String getContentOfArticle() {
        return contentOfArticle;
    }

    public ArticleDto setContentOfArticle(String contentOfArticle) {
        this.contentOfArticle = contentOfArticle;
        return this;
    }

    public List<CommentDto> getComments() {
        return comments;
    }

    public ArticleDto setComments(List<CommentDto> comments) {
        this.comments = comments;
        return this;
    }
}
