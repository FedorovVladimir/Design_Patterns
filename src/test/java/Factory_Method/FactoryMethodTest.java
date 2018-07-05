package Factory_Method;

import Factory_Method.Car.Ford;
import Factory_Method.Car.Nissan;
import Factory_Method.Car.Opel;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactoryMethodTest {

    @Test
    void getCar() {
        assertTrue(CarSelector.getCar(RoadType.CITY) instanceof Opel);
        assertTrue(CarSelector.getCar(RoadType.OFF_ROAD) instanceof Nissan);
        assertTrue(CarSelector.getCar(RoadType.GRASS) instanceof Ford);
    }
}