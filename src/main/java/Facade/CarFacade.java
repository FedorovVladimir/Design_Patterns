package Facade;

import Facade.Parts.Door;
import Facade.Parts.Key;
import Facade.Parts.Wheel;

class CarFacade {
    private Door door = new Door();
    private Wheel wheel = new Wheel();
    private Key key = new Key();

    void go() {
        door.open();
        wheel.turn();
        key.turn();
    }
}
