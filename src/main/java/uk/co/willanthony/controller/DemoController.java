package uk.co.willanthony.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


//controller annotation scanned like the component annotation. @Controller labels class as a web controller
@Controller
public class DemoController {

    // http://localhost:8080/todo-list/hello
    // when above url is entered, request directed to this method
    @ResponseBody
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    // http://localhost:8080/todo-list/welcome
    @GetMapping("welcome")
    public String welcome() {
        return "welcome";
    }

}
