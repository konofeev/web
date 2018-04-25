package entity;

import qualifier.MockQualifier;
import qualifier.TestQualifier;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;

public class ContentProducer
{
    @Produces @MockQualifier(version = 1)
    private String title = "Содержимое. Продюсер";
    @Produces @MockQualifier(version = 1)
    private Integer version = 9;
    @Produces @TestQualifier
    public String getContent()
    {
        return "Использование производителей данных";
    }
}
