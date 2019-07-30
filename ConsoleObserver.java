package observer_rassilka;

public class ConsoleObserver implements Observer {

    @Override
    public void handleEvent(int temp, int presser) {
        System.out.println("Temperature is " + temp + " C" + " Pressure is " + presser + "mm");
    }

}
