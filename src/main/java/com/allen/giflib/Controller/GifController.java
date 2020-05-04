package com.allen.giflib.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GifController {
    @RequestMapping(value = "/")
//    @ResponseBody
    public String listGifs() {
        return "home";
    }

    @RequestMapping(value = "/gif")
    @ResponseBody
    public String gifMsg() {
        return "I am a gif message";
    }
}
