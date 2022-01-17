package com.example.AppDevelopment.Service;

import com.example.AppDevelopment.Entity.Car;
import org.springframework.stereotype.Service;

@Service
public class CarService {
    public Car getCar(){
        Car car1 = new Car("blue","model1","1234",40000.0);
        return car1;
    }

}
