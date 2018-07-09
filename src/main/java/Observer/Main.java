package Observer;

import Observer.Subscriber.SubscriberOne;
import Observer.Subscriber.SubscriberTwo;

public class Main {
    public static void main(String[] args) {
        SubscriberOne subscriberOne = new SubscriberOne();
        SubscriberTwo subscriberTwo = new SubscriberTwo();

        Publisher publisher = new Publisher();

        publisher.addListener(subscriberOne);
        publisher.addListener(subscriberTwo);

        publisher.createNewMessage("First message.");
    }
}
