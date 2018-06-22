package org.j45.zlobek.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecondController {

    @RequestMapping("/ono")
    public String ede() {
        return "haha";
    }
}
