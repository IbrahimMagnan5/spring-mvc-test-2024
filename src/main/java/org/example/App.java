package org.example;

import org.example.entities.Article;
import org.example.repositories.ArticleRepository;
import org.example.repositories.Impl.ArticleRepositoryListImpl;
import org.example.services.CommandeService;
import org.example.services.impl.CommandeServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    //Beans

    public static void main( String[] args )

    {
        ApplicationContext context=
                new ClassPathXmlApplicationContext("ApplicationContext.xml");
        //ArticleRepository articleRepository=( ArticleRepository ) context.getBean("repoArticleBD");
            //articleRepository.getArticles();
        CommandeService commandeService=( CommandeService ) context.getBean("service");
        commandeService.listeArticles();
    }
}
