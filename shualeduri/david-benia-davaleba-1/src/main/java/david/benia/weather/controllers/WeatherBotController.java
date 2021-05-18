package david.benia.weather.controllers;

import david.benia.weather.services.WeatherBotService;

import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;

@ServerEndpoint("/weatherbot")
public class WeatherBotController {

    @OnOpen
    public void handleOpen() {
        System.out.println("Connected...");
    }

    @OnMessage
    public String handleMessage(String command) throws IOException {
        return WeatherBotService.response(command).toString();
    }

    @OnClose
    public void handleClose(){
        System.out.println("Disconnected.");
    }

    @OnError
    public void handleError(Throwable t){
        t.printStackTrace();
    }
}
