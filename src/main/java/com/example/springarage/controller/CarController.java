package com.example.springarage.controller;

import com.example.springarage.entity.Car;
import com.example.springarage.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/car")
public class CarController {
    @Autowired
    private CarService carService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Car carAdd(@RequestBody Car car) {
        return carService.carAdd(car);
    }


}
