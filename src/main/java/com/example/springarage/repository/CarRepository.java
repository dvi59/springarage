package com.example.springarage.repository;

import com.example.springarage.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car,Long > {

}
