package Adapter.Adapter;

import Adapter.Objects.Printer;

import java.util.List;

public class PrinterAdapter implements PageListPrinter {
    private Printer printer = new Printer();

    public void print(List<String> list) {
        for (String text : list) {
            printer.print(text);
        }
    }
}
