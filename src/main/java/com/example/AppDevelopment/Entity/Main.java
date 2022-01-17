package com.example.AppDevelopment.Entity;

public class Main implements ChildClass{
    public void display(){
        System.out.println("hello world");
    }

    @Override
    public void sum() {
//HOW TO ADD/
        System.out.println(5+2);
    }

    @Override
    public void diff() {
    //DIFF
    }
//    public static void main(String[] args) {
////        Car c = new Car("blue","model1","12234",200000.0);
//        Car c = new Car();
//        c.setColour("blue");
//        System.out.println(c.getColour());
//    }
}
