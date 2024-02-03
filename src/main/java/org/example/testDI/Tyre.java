package org.example.testDI;

import org.springframework.stereotype.Component;

@Component
public class Tyre {

    private String brand;

    public Tyre(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        return "Tyre{" +
                "brand='" + brand + '\'' +
                '}';
    }


    public void showTyre(){

        System.out.println("Tyre is of " + brand);
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
