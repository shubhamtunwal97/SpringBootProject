package org.example.testDI;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle{


    @Autowired
    public Tyre tyre;

    public Tyre getTyre() {
        return tyre;
    }

    public void setTyre(Tyre tyre) {
        this.tyre = tyre;
    }




    @Override
    public void drive() {
        System.out.println("Car vruuuummmm.... with "+tyre.toString());

    }
}
