package david.benia.weather.models;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Data {
    public static List<Weather> datalist = Arrays.asList(new Weather[]{
            new Weather(DirectionType.EAST, 20, "Tbilisi", 70, 20, 15),
            new Weather(DirectionType.WEST, 18, "Batumi", 72, 25, 11),
            new Weather(DirectionType.NORTH, 19, "Kutaisi", 71, 22, 12)
    });
}
