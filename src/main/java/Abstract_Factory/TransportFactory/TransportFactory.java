package Abstract_Factory.TransportFactory;

import Abstract_Factory.Aircraft.Aircraft;
import Abstract_Factory.Car.Car;

public interface TransportFactory {
    Car createCar();
    Aircraft createAircraft();
}
