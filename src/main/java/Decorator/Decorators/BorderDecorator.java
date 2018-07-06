package Decorator.Decorators;

import Decorator.Objects.Component;

public class BorderDecorator extends Decorator {
    public BorderDecorator(Component component) {
        super(component);
    }

    public void beforeGetText() {
        component.text = component.getText() + " with border";
    }

    public String getText() {
        beforeGetText();
        return component.text;
    }
}
