package State.Context;

import State.State.TransformerState;

public class TransformerContext implements TransformerState {
    public TransformerState state;

    public void action() {
        this.state.action();
    }
}
