<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>WeatherBot</title>
</head>
<body>
<textarea id="msgarea" rows="10" cols="50"></textarea><br/>

<form>
    <input type="text" id="textmsg">
    <input type="button" value="Send Message" onclick="sendMessage();">
</form>

<script>
    var webSocket = new WebSocket("ws://localhost:8080/david_benia_davaleba_1_war_exploded/weatherbot");
    var msgarea = document.getElementById("msgarea");

    webSocket.onopen = function (){
        msgarea.value = "";
        processOpen()
    };

    webSocket.onmessage = function (msg){
        processMessage(msg);
    }

    webSocket.onclose = function (){
        processClose();
    }

    webSocket.onerror = function (){
        processError();
    }

    function processOpen(){
        msgarea.value += "Connected...\n\n"
    }

    function processMessage(msg){
        msgarea.value += "Server: " + msg.data + "\n";
    }

    function sendMessage(){
        webSocket.send(textmsg.value);
        msgarea.value += "Client: " + tmsg.value + "\n";
    }

    function processClose(){
        webSocket.send("Disconnected.");
        msgarea.value += "Disconnected.";
    }

    function processError(){
        msgarea.value = "error...";
    }
</script>
</body>
</html>