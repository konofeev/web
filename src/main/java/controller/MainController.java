package controller;

import entity.MockArticle;
import entity.MockExample;
import javax.inject.Named;

@Named
public class MainController
{
    private MockArticle articles = new MockArticle();
    private MockExample examples = new MockExample();

    /**
     * Получить статьи
     */
    public MockArticle getArticles()
    {
        return articles;
    }

    public MockExample getExamples()
    {
        return examples;
    }
}
