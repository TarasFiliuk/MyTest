package test.my.test.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import test.my.test.entity.Article;
import test.my.test.entity.Color;

import java.util.List;

public interface ArticleDAO extends JpaRepository<Article,Integer> {
    List<Article> findByColor(Color color);
}
