package Factory_Method;

public class MainFactoryMethod {
    public static void main(String[] arg) {
        CarSelector carSelector = new CarSelector();

        Car firstCar = carSelector.getCar(RoadType.CITY);
        Car secondCar = carSelector.getCar(RoadType.OFF_ROAD);
        Car thirdCar = carSelector.getCar(RoadType.GRASS);
    }
}
