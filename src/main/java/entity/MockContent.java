package entity;

import qualifier.MockQualifier;

@MockQualifier(version = 1)
public class MockContent implements Content
{
    @Override
    public String getContent()
    {
        return "Содержимое";
    }
}
