package Decorator;

import Decorator.Decorators.BorderDecorator;
import Decorator.Decorators.ColorDecorator;
import Decorator.Objects.Component;
import Decorator.Objects.TextView;
import Decorator.Objects.Window;

public class Main {
    private static Component window;
    private static Component textView;
    private static Boolean showBorder = true;

    public static void main(String[] arg) {
        if (showBorder) {
            window = new BorderDecorator(new Window());
            textView = new BorderDecorator(new TextView());
        } else {
            window = new Window();
            textView = new TextView();
        }

        Component component = new ColorDecorator(new BorderDecorator(new Window()));
        System.out.println(component.getText());

        System.out.println(window.getText());
        System.out.println(textView.getText());
    }
}
