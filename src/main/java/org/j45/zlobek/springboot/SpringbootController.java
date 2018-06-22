package org.j45.zlobek.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class SpringbootController
{
    @Autowired
    UpdateStrategy strategy;

    @RequestMapping("/")
    public String index()
    {
        strategy.doStrategicUpdate("HTTP request received");
        return "Greetings, Mortal, from Spring Boot!";
    }
}
