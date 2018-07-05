package Abstract_Factory;

import Abstract_Factory.Aircraft.Aircraft;
import Abstract_Factory.Car.Car;
import Abstract_Factory.TransportFactory.RussianFactory;
import Abstract_Factory.TransportFactory.TransportFactory;
import Abstract_Factory.TransportFactory.USAFactory;

public class MainAbstactFactory {
    private static boolean isRussianFactory;

    public static void main(String[] arg) {
        TransportFactory factory = createFactory();
        Aircraft aircraft = factory.createAircraft();
        aircraft.flight();
        Car car = factory.createCar();
        car.drive();
    }

    private static TransportFactory createFactory() {
        if (isRussianFactory)
            return new RussianFactory();
        else
            return new USAFactory();
    }
}
