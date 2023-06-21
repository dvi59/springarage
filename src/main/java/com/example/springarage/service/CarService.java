package com.example.springarage.service;

import com.example.springarage.entity.Car;
import com.example.springarage.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarService {

    @Autowired
    private CarRepository carRepository;

    public Car carAdd(Car car){
        return carRepository.save(car);
    }
}
