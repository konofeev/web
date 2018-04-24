import javax.enterprise.inject.Default;

/**
 * Числовый генератор
 */
@DigitGeneratorQualifier
public class DigitGenerator implements Generator
{
    @Override
    public String generate()
    {
        return "1923 32071 82319 231123 87429";
    }
}
