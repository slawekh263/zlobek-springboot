package org.j45.zlobek.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class Updater {

    @Autowired
    private UpdaterConfiguration configuration;
    @Resource
    private UpdateStrategy strategy;

    public void doUpdate()
    {
        String configProperty = configuration.getConfigProp();
        strategy.doStrategicUpdate(configProperty);
    }
}
