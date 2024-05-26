package org.example.patterns.abstractFactory;

import org.example.patterns.factory.*;

public class VolkswagenShowroom extends Showroom{
    @Override
    public Car createCar(TypeCar type) {
        Car car = switch (type) {
            case COUPE -> new Coupe("VOLKSWAGEN CC COUPE", 68000);
            case SEDAN -> new Sedan("VOKSWAGEN PASSAT", 44000);
            case UNIVERSAL -> new Universal("VOLKSWAGEN PASSAT UNIVERSAL", 31000);
            default -> null;
        };

        return car;
    }
}
