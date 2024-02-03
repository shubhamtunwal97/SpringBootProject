package org.example.testDI;


import org.springframework.stereotype.Component;

@Component
public class Truck implements Vehicle{


    @Override
    public void drive() {
        System.out.println("Truck vruuummmm...");
    }
}
