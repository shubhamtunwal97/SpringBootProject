package org.example.testDI;


import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle{


    @Override
    public void drive() {
        System.out.println("Car vruuuummmm....");


    }
}
