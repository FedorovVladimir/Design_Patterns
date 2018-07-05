package Factory_Method;

import Factory_Method.Car.Car;
import Factory_Method.Car.Ford;
import Factory_Method.Car.Nissan;
import Factory_Method.Car.Opel;

class CarSelector {

    public static Car getCar(RoadType roadType) {
        Car car;
        if (roadType == RoadType.CITY)
            car = new Opel();
        else if (roadType == RoadType.OFF_ROAD)
            car = new Nissan();
        else // if (roadType == RoadType.GRASS)
            car = new Ford();
        return car;
    }
}
