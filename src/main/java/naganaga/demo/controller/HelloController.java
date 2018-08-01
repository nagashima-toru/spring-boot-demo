package naganaga.demo.controller;

import lombok.Data;
import naganaga.demo.model.Hello;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(path = "/hello")
public class HelloController {

    @GetMapping
    public Hello hello(@RequestParam(required = false) String message) {
        Hello hello = new Hello();
        hello.setMessage(Optional.ofNullable(message).orElse("Hello World."));
        return hello;
    }
}
