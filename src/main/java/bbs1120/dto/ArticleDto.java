package bbs1120.dto;

import bbs1120.entity.Article;
import lombok.*;

@Getter
@ToString
public class ArticleDto {

    private Long id;
    private String title;
    private String content;


    public ArticleDto(Long id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }

    public Article toEntity() {
        return new Article(title, content);
    }
}
