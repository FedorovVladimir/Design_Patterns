package Adapter;

import Adapter.Adapter.PrinterAdapter;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AdapterTest {
    @Test
    void printAdapterTest() {
        List<String> list = new ArrayList<String>();
        list.add("text 1");
        list.add("text 2");
        list.add("text 3");

        String text = new PrinterAdapter().print(list);
        assertEquals(text, "text 1\ntext 2\ntext 3\n");
    }
}
