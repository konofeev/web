package entity;

import qualifier.TestQualifier;

@TestQualifier
public class TestHeader implements Header
{
    @Override
    public String getHeader()
    {
        return "Другая тестовая реализация заголовка";
    }
}
