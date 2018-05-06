package controller;

import entity.Articles;
import javax.inject.Named;

@Named
public class MainController
{
    private Articles articles = new Articles();

    /**
     * Получить статьи
     */
    public Articles getArticles()
    {
        return articles;
    }
}
