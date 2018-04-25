package entity;

import qualifier.MockQualifier;

@MockQualifier(version = 1)
public class MockBottom implements Bottom
{
    @Override
    public String getBottom()
    {
        return "Нижняя часть";
    }
}
