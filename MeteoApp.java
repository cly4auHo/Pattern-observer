package observer_rassilka;

public class MeteoApp {
    
    public static void main(String[] args) {
        MeteoStation ms = new MeteoStation();
        
        ms.addObserver(new ConsoleObserver());
        ms.addObserver(new FileObserver());
        
        ms.setMeasurment(50, 760);
    }
}
