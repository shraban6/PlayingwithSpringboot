package com.onlyjavatech.jjpacrud;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class ControllerPage {

     @RequestMapping("/test")
     public String FirstHandler () {

         return "Just for testing";
     }


    @RequestMapping(value="/home", method= RequestMethod.GET)
    public String check(){
        return "Hi User, Welcome to order service";
    }

}
