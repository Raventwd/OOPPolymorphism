import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
public class Main {
    public static void main(String[] args)  {
        Mechanic mechanic1 = new Mechanic("Anton Antonov", "company1");
        Mechanic mechanic2 = new Mechanic("Anton Ivanov", "company2");
        Bus bus1 = new Bus("brand1", "model1", "White", 130, 2000, "Japan", 2, "Bus", mechanic1 );
        Lightweightcar car1 = new Lightweightcar("brand1", "model1", "White", 130, 2000, "Japan", 2, "Lightweightcar", mechanic1);
        Heavyweightcar hatchback1 = new Heavyweightcar("brand1", "model1", "White", 130, 2000, "Japan", 2, "Heavyweightcar", mechanic2);
        System.out.println(bus1);
        System.out.println(car1);
        System.out.println(hatchback1);
        car1.printType();
        ArrayList racerList = new ArrayList<>();
        racerList.add(car1);
        racerList.add(bus1);
        racerList.add(hatchback1);

        Queue<Object> queue = new LinkedList<>();
        queue.add(car1);
        queue.add(hatchback1);
        System.out.println(queue.poll());




    }
    public interface competitive {
        void pitStop();

        void bestLapTime();

        void maxSpeed();
    }
}
