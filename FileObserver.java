package observer_rassilka;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class FileObserver implements Observer {

    @Override
    public void handleEvent(int temp, int presser) {
        File f;
        try {
            f = File.createTempFile("TempPressure", "txt");
            PrintWriter pw = new PrintWriter(f);
            pw.print("New weather. Temperature is " + temp + ", Pressure is " + presser + ".");
            pw.println();
            pw.close();
        } catch (IOException io) {
            io.printStackTrace();
        }
    }

}
