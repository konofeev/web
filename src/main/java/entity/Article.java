package entity;

/**
 * Статья
 */
public class Article
{
    private String title;
    private String description;

    /**
     * Конструктор
     *
     * @param title Заголовок
     */
    public Article(String title, String description)
    {
        this.title = title;
        this.description = description;
    }

    /**
     * Получить заголовок
     */
    public String getTitle()
    {
        return title;
    }

    /**
     * Получить описание
     */
    public String getDescription()
    {
        return description;
    }
}
