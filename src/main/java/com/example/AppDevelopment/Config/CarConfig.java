package com.example.AppDevelopment.Config;

import com.example.AppDevelopment.Entity.Car;
import com.example.AppDevelopment.Repository.CarRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.Optional;

@Configuration //to denote that one or more beans are present
public class CarConfig {
    @Bean
    CommandLineRunner carCommandLineRunner(CarRepository carRepository){
        return args -> {
            Car car1 = new Car("blue","model1","1234",40000.0);
            Car car2 = new Car("white","model1","123",100000.0);
//            carRepository.save(car1);
//            carRepository.save(car2);
            carRepository.saveAll(Arrays.asList(car1,car2));
            //select * from car_table where id = 1

            Optional<Car> car3 = carRepository.findById(3);
            if(car3.isPresent()){
                System.out.println(car3);
            }

//            Car car4 = carRepository.findByColour("gray");
//            if(car4 == null){
//                System.out.println("no record in db");
//            }
        };
    }
}
