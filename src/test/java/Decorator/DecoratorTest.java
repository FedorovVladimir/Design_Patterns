package Decorator;

import Decorator.Decorators.BorderDecorator;
import Decorator.Decorators.ColorDecorator;
import Decorator.Objects.Component;
import Decorator.Objects.TextView;
import Decorator.Objects.Window;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecoratorTest {

    @Test
    void Window() {
        Component window = new Window();
        assertEquals(window.getText(), "Window");
    }

    @Test
    void BorderDecorator() {
        Component windowWithBorder = new BorderDecorator(new Window());
        assertEquals(windowWithBorder.getText(), "Window with border");
    }

    @Test
    void TextView() {
        Component textView = new TextView();
        assertEquals(textView.getText(), "Text View");
    }

    @Test
    void ColorDecorator() {
        Component textViewWithBorder = new ColorDecorator(new TextView());
        assertEquals(textViewWithBorder.getText(), "Text View with color");
    }

    @Test
    void ColorAndBorderDecorator() {
        Component component = new ColorDecorator(new BorderDecorator(new Window()));
        assertEquals(component.getText(), "Window with border with color");
    }
}
