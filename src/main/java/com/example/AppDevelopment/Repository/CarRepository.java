package com.example.AppDevelopment.Repository;

import com.example.AppDevelopment.Entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;

@Repository
public interface CarRepository extends JpaRepository<Car, Integer> {
//    Car  findByColour(String colour);
}
