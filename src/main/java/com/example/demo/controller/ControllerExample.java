package com.example.demo.controller;

import com.example.demo.model.Data;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("v1/api")
public class ControllerExample {


    @GetMapping("/retrieve")
    public ResponseEntity<List<Data>> response(){
       List<Data> response = Arrays.asList(new Data("Pedrin","putin"),new Data("nalgas","sombreado"));
        return new ResponseEntity<>(response, HttpStatus.OK);
    }



}
