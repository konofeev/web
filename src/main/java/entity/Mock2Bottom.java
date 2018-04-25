package entity;

import qualifier.MockQualifier;

@MockQualifier(version = 2)
public class Mock2Bottom implements Bottom
{
    @Override
    public String getBottom()
    {
        return "Нижняя часть. Использование квалификатора с параметрами";
    }
}
