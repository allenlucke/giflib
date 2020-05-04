package com.allen.giflib.Controller;

import com.allen.giflib.Model.Gif;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDate;

@Controller
public class GifController {
    @RequestMapping(value = "/")
//    @ResponseBody
    public String listGifs() {
        return "home";
    }

    @RequestMapping(value = "/gif")
//    @ResponseBody
    public String gifDetails(ModelMap modelMap) {
        Gif gif = new Gif("compiler-bot", LocalDate.of(2015,2,13),"Tom Jones", true);
        modelMap.put("gif",gif);
        return "gif-details";
    }
}
