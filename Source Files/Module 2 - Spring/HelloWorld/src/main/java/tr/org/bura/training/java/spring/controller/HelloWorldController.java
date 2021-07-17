package tr.org.bura.training.java.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class HelloWorldController {
   /* @GetMapping("/hello")
    public @ResponseBody String hello(@RequestParam(value = "name", defaultValue = "World") String name){
        return String.format("Hello %s!", name);
    }*/

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name){
        return String.format("Hello %s!", name);
    }

}
