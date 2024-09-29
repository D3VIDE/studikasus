package Notifw;

import java.util.ArrayList;
import java.util.List;

public class CourseNotifier {
    private List<Notifw.Observer> observers = new ArrayList<>();
    private String message;

    public void addObserver(Notifw.Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Notifw.Observer observer) {
        observers.remove(observer);
    }


    public void notifyObservers() {
        for (Notifw.Observer observer : observers) {
            observer.update(message);
        }
    }


    public void setMessage(String message) {
        this.message = message;
        notifyObservers();
    }
}
