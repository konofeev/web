package entity;

import qualifier.MockQualifier;
import javax.enterprise.inject.Alternative;

@Alternative @MockQualifier(version = 1)
public class AlternativeContent implements Content
{
    @Override
    public String getContent()
    {
        return "Содержимое. Использование альтернатив при внедрении компонентов. Включается указанием класса альтернативы в файле beans.xml";
    }
}
