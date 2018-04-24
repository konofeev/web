import javax.enterprise.inject.Default;

/**
 * Строковый генератор
 */
@StringGeneratorQualifier
public class StringGenerator implements Generator
{
    @Override
    public String generate()
    {
        return "Сгенерированная строка";
    }
}
