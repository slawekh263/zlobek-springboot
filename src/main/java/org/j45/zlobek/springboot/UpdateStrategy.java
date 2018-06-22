package org.j45.zlobek.springboot;

import org.springframework.stereotype.Component;

@Component
public class UpdateStrategy {
    public void doStrategicUpdate(String param)
    {
        System.out.println("Updating: " + param);
    }
}
