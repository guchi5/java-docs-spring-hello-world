package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class GreetingController {
    
    private static final String template = "Hello, %s!";
    private long counter = 0L;

    @GetMapping("/greeting")
    public String greeting(@RequestParam(value = "name", defaultValue = "World") String name) throws JsonProcessingException{
        counter += 1L;
        Greeting greeting = new Greeting(counter, String.format(template, name));
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(greeting);
        return json;
    }
}
