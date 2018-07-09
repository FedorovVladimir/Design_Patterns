package State;

import State.Context.TransformerContext;
import State.State.FireState;
import State.State.MoveState;
import State.State.TransformerState;

public class Main {
    public static void main(String[] args) {
        TransformerContext context = new TransformerContext();

        TransformerState fireState = new FireState();
        TransformerState moveState = new MoveState();

        context.state = fireState;
        context.action();

        context.state = moveState;
        context.action();
    }
}
