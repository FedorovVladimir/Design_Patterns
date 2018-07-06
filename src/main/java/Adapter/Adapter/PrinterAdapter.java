package Adapter.Adapter;

import Adapter.Objects.Printer;

import java.util.List;

public class PrinterAdapter implements PageListPrinter {
    private Printer printer = new Printer();

    public String print(List<String> list) {
        String text = "";
        for (String str : list) {
            text += str + "\n";
        }
        printer.print(text);
        return text;
    }
}
