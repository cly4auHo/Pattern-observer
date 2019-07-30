package observer_rassilka;

import java.util.ArrayList;
import java.util.List;

public class MeteoStation implements Observered { //издатель

    int temperature, pressure;
    List<Observer> observers = new ArrayList<>();

    public void setMeasurment(int t, int p) {
        this.temperature = t;
        this.pressure = p;
        notifyObserver();
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObserver() {
        for (Observer o : observers) {
            o.handleEvent(temperature, pressure);
        }
    }

}
