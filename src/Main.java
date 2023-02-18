import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Main {
    public static void main(String[] args) {
        Mechanic mechanic1 = new Mechanic("Anton Antonov", "company1");
        Mechanic mechanic2 = new Mechanic("Anton Ivanov", "company2");
        List<Mechanic> mechanics = new ArrayList<>();
        mechanics.add(mechanic1);
        mechanics.add(mechanic2);
        Bus bus1 = new Bus("brand1", "model1", "White", 130, 2000, "Japan", 2, "Bus", mechanics);
        Lightweightcar car1 = new Lightweightcar("brand1", "model1", "White", 130, 2000, "Japan", 2, "Lightweightcar", mechanics);
        Heavyweightcar hatchback1 = new Heavyweightcar("brand1", "model1", "White", 130, 2000, "Japan", 2, "Heavyweightcar", mechanics);
        ArrayList racerList = new ArrayList<>();
        racerList.add(car1);
        racerList.add(bus1);
        racerList.add(hatchback1);

        MaintenanceStation station1 = new MaintenanceStation();
        station1.queueCarAdd(hatchback1);


        Map<Transport, List<Mechanic>> transportListMap = new HashMap<>();
        transportListMap.put(bus1, mechanics);
        transportListMap.put(hatchback1, mechanics);
        for (Map.Entry<Transport, List<Mechanic>> car: transportListMap.entrySet()) {
            System.out.println("Машина " + car.getKey() + " Механики " + car.getValue());
        }




    }


    public interface competitive {
        void pitStop();

        void bestLapTime();

        void maxSpeed();
    }
}
