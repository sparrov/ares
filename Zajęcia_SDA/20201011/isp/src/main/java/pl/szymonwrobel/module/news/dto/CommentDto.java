package pl.szymonwrobel.module.news.dto;

import java.time.LocalDateTime;

public class CommentDto {
    private String author;
    private LocalDateTime dateTimeOfComment;
    private String contentOfComment;

    public CommentDto(String author, LocalDateTime dateTimeOfComment, String contentOfComment) {
        this.author = author;
        this.dateTimeOfComment = dateTimeOfComment;
        this.contentOfComment = contentOfComment;
    }

    public String getAuthor() {
        return author;
    }

    public CommentDto setAuthor(String author) {
        this.author = author;
        return this;
    }

    public LocalDateTime getDateTimeOfComment() {
        return dateTimeOfComment;
    }

    public CommentDto setDateTimeOfComment(LocalDateTime dateTimeOfComment) {
        this.dateTimeOfComment = dateTimeOfComment;
        return this;
    }

    public String getContentOfComment() {
        return contentOfComment;
    }

    public CommentDto setContentOfComment(String contentOfComment) {
        this.contentOfComment = contentOfComment;
        return this;
    }
}
