package org.example.patterns.factory;

import org.example.patterns.abstractFactory.Showroom;

public class AudiShowroom extends Showroom {

    public Car createCar(TypeCar type) {
        Car car = switch (type) {
            case COUPE -> new Coupe("AUDI R8", 75000);
            case SEDAN -> new Sedan("AUDI A6", 40000);
            case UNIVERSAL -> new Universal("AUDI A4", 25000);
            default -> null;
        };

        return car;
    }

}
