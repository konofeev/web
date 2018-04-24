import javax.inject.Named;
import javax.inject.Inject;
import javax.enterprise.inject.Default;

/**
 * Провайдер тестовых строк
 */
@Named
public class TestStringProvider
{
    @Inject @StringGeneratorQualifier
    private Generator generator;

    /**
     * Получить тестовую строку
     */
    public String getTest()
    {
        return generator.generate();
    }
}
