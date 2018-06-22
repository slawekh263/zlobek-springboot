package org.j45.zlobek.springboot;

import org.springframework.stereotype.Component;

@Component
public class UpdaterConfiguration
{
    public String getConfigProp()
    {
        return "sat.config.allowedFormsOfFraud";
    }
}
