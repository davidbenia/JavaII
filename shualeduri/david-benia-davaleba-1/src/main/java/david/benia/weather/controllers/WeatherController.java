package david.benia.weather.controllers;

import david.benia.weather.models.Data;
import david.benia.weather.models.DirectionType;
import david.benia.weather.models.Weather;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

@Path("/")
public class WeatherController {

    @GET
    @Path("/weather")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Weather> getData(){
        return Data.datalist;
    }

    @GET
    @Path("/weather/{city}")
    @Produces(MediaType.APPLICATION_JSON)
    public Weather getCityData(@PathParam("city") String city){
        String city_formatted = city.substring(0,1).toUpperCase() + city.substring(1).toLowerCase();

        for(Weather o : Data.datalist){
            if(o.getCityName().equals(city_formatted)) return o;
        }
        return null;
    }
}
