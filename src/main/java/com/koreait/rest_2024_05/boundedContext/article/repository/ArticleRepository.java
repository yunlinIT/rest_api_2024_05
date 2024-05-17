package com.koreait.rest_2024_05.boundedContext.article.repository;

import com.koreait.rest_2024_05.boundedContext.article.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ArticleRepository extends JpaRepository<Article, Long> {
    List<Article> findAllByOrderByIdDesc();
}
