package Observer.Subscriber;

public class SubscriberOne implements PublisherActionListener {
    public void doAction(String message) {
        System.out.println(message + " from " + this.getClass().getName());
    }
}
