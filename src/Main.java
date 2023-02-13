import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Bus bus1 = new Bus("brand1", "model1", "White", 130, 2000, "Japan", 2, "Bus");
        Lightweightcar car1 = new Lightweightcar("brand1", "model1", "White", 130, 2000, "Japan", 2, "Lightweightcar");
        Heavyweightcar hatchback1 = new Heavyweightcar("brand1", "model1", "White", 130, 2000, "Japan", 2, "Heavyweightcar");
        ArrayList racerList = new ArrayList<>();
        racerList.add(car1);
        racerList.add(bus1);
        racerList.add(hatchback1);
        MaintenanceStation station1 = new MaintenanceStation();
        station1.queueCarAdd(hatchback1);
        station1.getCarsQueue();
    }

    public interface competitive {
        void pitStop();

        void bestLapTime();

        void maxSpeed();
    }
}
