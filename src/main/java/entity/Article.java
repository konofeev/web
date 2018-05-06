package entity;

/**
 * Статья
 */
public class Article
{
    private String title;

    /**
     * Конструктор
     *
     * @param title Заголовок
     */
    public Article(String title)
    {
        this.title = title;
    }

    /**
     * Получить заголовок
     */
    public String getTitle()
    {
        return title;
    }
}
