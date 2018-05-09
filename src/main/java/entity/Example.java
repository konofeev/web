package entity;

/**
 * Пример
 */
public class Example
{
    public Example(String title, String body, String description)
    {
        this.title = title;
        this.body = body;
        this.description = description;
    }

    /**
     * Заголовок
     */
    private String title;

    /**
     * Пример
     */
    private String body;

    /**
     * Описание
     */
    private String description;

    public String getTitle()
    {
        return title;
    }

    public String getBody()
    {
        return body;
    }

    public String getDescription()
    {
        return description;
    }
}
