package entity;

import qualifier.MockQualifier;
import qualifier.TestQualifier;
import javax.inject.Inject;

@MockQualifier(version = 9)
public class TestContent implements Content
{
    @Inject @MockQualifier(version = 1)
    private String title;
    @Inject @MockQualifier(version = 1)
    private Integer version;
    @Inject @TestQualifier
    private String content;
    @Override
    public String getContent()
    {
        return title + " " + version + " " + content;
    }
}
