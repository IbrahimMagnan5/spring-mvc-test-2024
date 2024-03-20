package org.example;

import org.example.repositories.ArticleRepository;
import org.example.repositories.Impl.ArticleRepositoryListImpl;
import org.example.services.impl.CommandeServiceImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    private static ArticleRepository articleRepository =new ArticleRepositoryListImpl();
    private static CommandeServiceImpl commandeService =new CommandeServiceImpl(articleRepository);
    public static void main( String[] args )

    {
        commandeService.listeArticles();
    }
}
