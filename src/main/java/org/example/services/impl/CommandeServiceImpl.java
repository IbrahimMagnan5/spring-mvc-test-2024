package org.example.services.impl;

import org.example.entities.Article;
import org.example.repositories.ArticleRepository;
import org.example.repositories.Impl.ArticleRepositoryBDImpl;
import org.example.repositories.Impl.ArticleRepositoryListImpl;
import org.example.services.CommandeService;
import java.util.List;

public class CommandeServiceImpl implements CommandeService {
  //couplage fort
   private ArticleRepository articleRepository;

    public CommandeServiceImpl(ArticleRepository articleRepository) {

        this.articleRepository = articleRepository;
    }

    public void setArticleRepository(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    @Override
    public List<Article> listeArticles() {
        return articleRepository.getArticles();
    }
}
