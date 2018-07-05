package Factory_Method;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarSelectorTest {

    @Test
    void getCar() {
        assertTrue(new CarSelector().getCar(RoadType.CITY) instanceof Opel);
        assertTrue(new CarSelector().getCar(RoadType.OFF_ROAD) instanceof Nissan);
        assertTrue(new CarSelector().getCar(RoadType.GRASS) instanceof Ford);
    }
}