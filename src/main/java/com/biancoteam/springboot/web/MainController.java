package com.biancoteam.springboot.web;

import com.biancoteam.springboot.web.dto.MainResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/")
    public String main(){
        return "localhost:8080";
    }

    @GetMapping("/main")
    public String main_(){
        return "localhost:8080/main";
    }

    @GetMapping("/main/dto")
    public MainResponseDto mainDto(@RequestParam("name") String name, @RequestParam("amount") int amount){
        return new MainResponseDto(name, amount);
    }
}
