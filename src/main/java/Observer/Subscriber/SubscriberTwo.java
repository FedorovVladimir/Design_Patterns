package Observer.Subscriber;

public class SubscriberTwo implements PublisherActionListener {
    public void doAction(String message) {
        System.out.println(message + " from " + this.getClass().getName());
    }
}
