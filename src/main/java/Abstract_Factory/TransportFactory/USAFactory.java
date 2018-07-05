package Abstract_Factory.TransportFactory;

import Abstract_Factory.Aircraft.Aircraft;
import Abstract_Factory.Aircraft.Boeing747;
import Abstract_Factory.Car.Car;
import Abstract_Factory.Car.Ford;

public class USAFactory implements TransportFactory {
    public Car createCar() {
        return new Ford();
    }

    public Aircraft createAircraft() {
        return new Boeing747();
    }
}
