package org.example.testDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        Truck c = new Truck();
//        c.drive();
/*
So above is old code where we have to write truck and car everytime we create a new object, we want in such a way that if
we create a new object we must not change anything into this file..See eg belw
 */

        //Using the interface
//
//        Vehicle v = new Car();
//        v.drive();

        //why even to write a new car..just use spring and write getBean
        // 2 approach..always use ApplicaitonContext for Enterprise Application

        ApplicationContext context = new ClassPathXmlApplicationContext("/spring.xml");

        Tyre t = (Tyre) context.getBean("tyre");
        t.showTyre();

//        Vehicle obj = (Vehicle) context.getBean("car");
        Vehicle obj = (Vehicle) context.getBean("car");

        obj.drive();




    }
}
