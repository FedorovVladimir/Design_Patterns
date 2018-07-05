package Factory_Method;

import Factory_Method.Car.Car;

public class MainFactoryMethod {
    public static void main(String[] arg) {
        Car firstCar = CarSelector.getCar(RoadType.CITY);
        Car secondCar = CarSelector.getCar(RoadType.OFF_ROAD);
        Car thirdCar = CarSelector.getCar(RoadType.GRASS);

        firstCar.drive();
        secondCar.stop();
        thirdCar.drive();
    }
}
