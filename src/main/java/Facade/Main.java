package Facade;

import Facade.Parts.Door;
import Facade.Parts.Key;
import Facade.Parts.Wheel;

public class Main {
    public static void main(String[] args) {
        Door door = new Door();
        door.open();
        Wheel wheel = new Wheel();
        wheel.turn();
        Key key = new Key();
        key.turn();

        CarFacade carFacade = new CarFacade();
        carFacade.go();
    }
}
