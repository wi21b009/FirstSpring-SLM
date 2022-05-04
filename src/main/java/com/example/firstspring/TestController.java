package com.example.firstspring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //bedeutet, dass DAten (und kein HTML) zurückgeschickt wird > alles was von da kommt wird als Daten interpretiert
public class TestController { //Controller bearbeitet Anfragen aus dem Internet

    private int count = 0;

    //Beispiel, was wir in unserem Projekt verwenden könnten
    private boolean online = true;
    private String message = "Hallo";

    @RequestMapping("/count")
    public String count() {
        count++;
        return  "Count: " + count;
    }

    @RequestMapping("/") //Verbindet URL im Browser und Java in der Datei = localhost:8080
    public String hello() {
        return "Hello World";
    }

    @RequestMapping("/at") //Verbindet URL im Browser und Java in der Datei = localhost:8080/at
    public String hallo() {
        return "Hallo Welt";
    }
}
