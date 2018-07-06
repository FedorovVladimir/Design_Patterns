package Decorator.Decorators;

import Decorator.Objects.Component;

public class ColorDecorator extends Decorator {
    public ColorDecorator(Component component) {
        super(component);
    }

    public void beforeGetText() {
        component.text = component.getText() + " with color";
    }

    public String getText() {
        beforeGetText();
        return component.text;
    }
}
