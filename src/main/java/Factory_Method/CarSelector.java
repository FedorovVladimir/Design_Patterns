package Factory_Method;

class CarSelector {

    public Car getCar(RoadType roadType) {
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
