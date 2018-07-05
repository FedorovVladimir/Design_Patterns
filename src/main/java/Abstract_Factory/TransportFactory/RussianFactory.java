package Abstract_Factory.TransportFactory;

import Abstract_Factory.Aircraft.Aircraft;
import Abstract_Factory.Aircraft.TU134;
import Abstract_Factory.Car.Car;
import Abstract_Factory.Car.Niva;

public class RussianFactory implements TransportFactory {
    public Car createCar() {
        return new Niva();
    }

    public Aircraft createAircraft() {
        return new TU134();
    }
}
