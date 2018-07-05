package Singleton;

import static org.junit.jupiter.api.Assertions.*;

class SingletonTest {

    @org.junit.jupiter.api.Test
    void getInstance() {
        assertEquals(Singleton.getInstance(), Singleton.getInstance());
    }
}