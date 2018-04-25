package entity;

import qualifier.MockQualifier;

@MockQualifier(version = 1)
public class MockHeader implements Header
{
    @Override
    public String getHeader()
    {
        return "Заголовок";
    }
}
