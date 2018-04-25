package controller;

import entity.Bottom;
import entity.Content;
import entity.Header;
import javax.inject.Inject;
import javax.inject.Named;
import qualifier.MockQualifier;
import qualifier.TestQualifier;

@Named
public class MainController
{
    @Inject @TestQualifier
    private Header header;
    @Inject @MockQualifier(version = 9)
    private Content content;
    @Inject @MockQualifier(version = 2)
    private Bottom bottom;

    public String getHeader()
    {
        return header.getHeader();
    }

    public String getContent()
    {
        return content.getContent();
    }

    public String getBottom()
    {
        return bottom.getBottom();
    }
}
