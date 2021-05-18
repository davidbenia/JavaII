package david.benia.weather.services;

import david.benia.weather.models.Data;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class WeatherBotService {
    public static URL url1, url2;
    public static HttpURLConnection conn1, conn2;

    public static void URLGenerator(String path) throws IOException {
        url1 = new URL("http://localhost:8080/david_benia_davaleba_1_war_exploded/api/weather");
        conn1 = (HttpURLConnection)url1.openConnection();
        conn1.setRequestMethod("GET");
        conn1.connect();

        url2 = new URL("http://localhost:8080/david_benia_davaleba_1_war_exploded/api/weather/" + path);
        conn2 = (HttpURLConnection)url2.openConnection();
        conn2.setRequestMethod("GET");
        conn2.connect();
    }

    public static String json_formatter(URL url) throws IOException {
        Scanner scanner = new Scanner(url.openStream());
        String formatted = "";

        while(scanner.hasNext()){
            formatted += scanner.nextLine();
        }

        return formatted;
    }

    public static String response(String command) throws IOException {
        final String cmd = command.toLowerCase();
        URLGenerator(cmd);

        if(cmd.equals("all")){
            return json_formatter(url1);
        }
        else if(Data.datalist.stream().anyMatch(weather_object -> cmd.equals(weather_object.getCityName().toLowerCase()))) {
            return json_formatter(url2);
        }

        return "Unknown command...";
    }
}
