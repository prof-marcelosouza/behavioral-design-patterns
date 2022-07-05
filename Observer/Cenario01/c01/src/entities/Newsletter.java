package entities;

import java.util.ArrayList;
import java.util.List;

public class Newsletter implements Subject {

    private List observers = new ArrayList();
    private List messages = new ArrayList();

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Object o : observers) {
            System.out.println(o);
        }
    }

    public void addMessage(String msg) {
        messages.add(msg);
        this.notifyObservers();
    }

    @Override
    public String toString() {
        return "" + messages.get(messages.size() -1 );
    }
}
