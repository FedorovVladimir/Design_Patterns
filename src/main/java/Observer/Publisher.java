package Observer;

import Observer.Subscriber.PublisherActionListener;

import java.util.ArrayList;

public class Publisher implements PublisherInterface {

    private ArrayList<PublisherActionListener> listeners = new ArrayList<PublisherActionListener>();

    public ArrayList<PublisherActionListener> getListeners() {
        return listeners;
    }

    public void addListener(PublisherActionListener listener) {
        listeners.add(listener);
    }

    public void removeListener(PublisherActionListener listener) {
        listeners.remove(listener);
    }

    public void removeAllListeners() {
        listeners.clear();
    }

    public void notifySubscribers(String message) {
        for (PublisherActionListener actionListener : listeners)
            actionListener.doAction(message);
    }

    public void createNewMessage(String message) {
        System.out.println("Publisher printed message: " + message);
        notifySubscribers(message);
    }
}
