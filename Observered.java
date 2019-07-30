package observer_rassilka;

public interface Observered {

    void addObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObserver();
}

interface Observer {

    void handleEvent(int temp, int presser);
}
