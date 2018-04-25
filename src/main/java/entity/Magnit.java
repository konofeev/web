package entity;

import java.io.*;
import java.net.*;
import javax.inject.Named;

@Named
public class Magnit
{
    public String getContent() throws Exception
    {
        StringBuilder result = new StringBuilder();
        URL url = new URL("http://mobiapp.tander.ru/magnit-api/discounts?shopId=1330");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setRequestProperty("version", "4");
        connection.setRequestProperty("Host", "mobiapp.tander.ru");
        connection.setRequestProperty("Connection", "Keep-Alive");
        connection.setRequestProperty("Accept-Encoding", "gzip");
        connection.setRequestProperty("User-Agent", "okhttp/3.2.0");
        connection.setRequestProperty("Content-Type", "application/json;charset=UTF-8");
        BufferedReader reader = new BufferedReader(
            new InputStreamReader(
                connection.getInputStream(), "UTF-8"));
        String line;
        while ((line = reader.readLine()) != null)
        {
            result.append(line);
        }
        reader.close();
        return result.toString();
    }
}
