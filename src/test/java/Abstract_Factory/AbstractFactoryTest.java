package Abstract_Factory;

import Abstract_Factory.Aircraft.Aircraft;
import Abstract_Factory.Aircraft.Boeing747;
import Abstract_Factory.Aircraft.TU134;
import Abstract_Factory.Car.Car;
import Abstract_Factory.Car.Ford;
import Abstract_Factory.Car.Niva;
import Abstract_Factory.TransportFactory.RussianFactory;
import Abstract_Factory.TransportFactory.TransportFactory;
import Abstract_Factory.TransportFactory.USAFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbstractFactoryTest {

    @Test
    void RussianFactoryTest() {
        TransportFactory factory = new RussianFactory();
        Car car = factory.createCar();
        Aircraft aircraft = factory.createAircraft();

        assertTrue(car instanceof Niva);
        assertTrue(aircraft instanceof TU134);
    }

    @Test
    void USAFactoryTest() {
        TransportFactory factory = new USAFactory();
        Car car = factory.createCar();
        Aircraft aircraft = factory.createAircraft();

        assertTrue(car instanceof Ford);
        assertTrue(aircraft instanceof Boeing747);
    }
}