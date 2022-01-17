package com.example.AppDevelopment.Controller;

import com.example.AppDevelopment.Entity.Car;
import com.example.AppDevelopment.Service.CarService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@RequestMapping(path = "/api")
public class CarController {

    @GetMapping(path = "/hello")
//    @RequestMapping(path = "/hello",method = GET)
    public String getHello(){
        return "Hello World";
    }

    @GetMapping(path = "/car")
    public Car getCar(){
        CarService carService = new CarService();
        return carService.getCar() ;
    }

    @GetMapping(path = "/carList")
    public List<Car> getCarList(){
        Car car1 = new Car("blue","model1","1234",40000.0);
        Car car2 = new Car("white","model1","123",100000.0);
        return Arrays.asList(car1,car2);
    }
}
