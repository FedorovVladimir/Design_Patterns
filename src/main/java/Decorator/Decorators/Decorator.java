package Decorator.Decorators;

import Decorator.Objects.Component;

abstract class Decorator extends Component {
    protected Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    public abstract void beforeGetText();
}
