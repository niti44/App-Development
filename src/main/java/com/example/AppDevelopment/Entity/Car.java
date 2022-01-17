package com.example.AppDevelopment.Entity;

import javax.persistence.*;

@Entity
@Table(name = "car_table", uniqueConstraints = {
        @UniqueConstraint(name = "regNumUnique",columnNames = "reg_num")
})
public class Car {
    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private Integer id;
    private String colour;
    private String modelName;
    @Column(name = "reg_num", nullable = false)
    private String registrationNumber;
    private Double price;

    public Car() {
    }

    public Car(Integer id, String colour, String modelName, String registrationNumber, Double price) {
        this.id = id;
        this.colour = colour;
        this.modelName = modelName;
        this.registrationNumber = registrationNumber;
        this.price = price;
    }

    public Car(String colour, String modelName, String registrationNumber, Double price) {
        this.colour = colour;
        this.modelName = modelName;
        this.registrationNumber = registrationNumber;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
