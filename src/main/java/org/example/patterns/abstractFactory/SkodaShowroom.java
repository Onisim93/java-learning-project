package org.example.patterns.abstractFactory;

import org.example.patterns.factory.*;

public class SkodaShowroom extends Showroom{

    @Override
    public Car createCar(TypeCar type) {
        Car car = switch (type) {
            case COUPE -> new Coupe("SKODA SUPERB", 55000);
            case SEDAN -> new Sedan("SKODA OCTAVIA", 30000);
            case UNIVERSAL -> new Universal("SKODA RAPID", 15000);
            default -> null;
        };

        return car;
    }
}
