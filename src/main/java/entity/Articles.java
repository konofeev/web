package entity;

import java.util.List;
import java.util.ArrayList;

/**
 * Статьи
 */
public class Articles
{
    private List<Article> articles;

    /**
     * Конструктор
     */
    public Articles()
    {
        articles = new ArrayList<Article>();
        articles.add(new Article("Тип String"));
        articles.add(new Article("Тип StingBuffer"));
        articles.add(new Article("Тип StingBulder"));
    }

    /**
     * Получить список статей
     * 
     * @return List<Article> список статей
     */
    public List<Article> getArticles()
    {
        return articles;
    }
}
