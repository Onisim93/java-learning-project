package org.example.patterns.factory;

import org.example.patterns.abstractFactory.Showroom;
import org.example.patterns.abstractFactory.SkodaShowroom;
import org.example.patterns.abstractFactory.VolkswagenShowroom;

public class Test {

    public static void main(String[] args) {
        Showroom showroom = new AudiShowroom();
        Showroom skodaShowroom = new SkodaShowroom();
        Showroom volkswagenShowroom = new VolkswagenShowroom();

        Car car = volkswagenShowroom.createCar(TypeCar.COUPE);

        System.out.println(car);
    }





}
