package org.example.patterns.abstractFactory;

import org.example.patterns.factory.Car;
import org.example.patterns.factory.TypeCar;

public abstract class Showroom {

    public abstract Car createCar(TypeCar type);

}
