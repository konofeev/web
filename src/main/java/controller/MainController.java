package controller;

import entity.MockArticle;
import javax.inject.Named;

@Named
public class MainController
{
    private MockArticle articles = new MockArticle();

    /**
     * Получить статьи
     */
    public MockArticle getArticles()
    {
        return articles;
    }
}
