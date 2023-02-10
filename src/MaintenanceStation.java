import java.util.LinkedList;
import java.util.Queue;

public class MaintenanceStation {
    Queue<Object> carsQueue = new LinkedList<>();



    public MaintenanceStation() {
        Queue<Object> carsQueue = new LinkedList<>();
    }

    public void queueCarAdd() {
        Lightweightcar car1 = new Lightweightcar("brand1", "model1", "White", 130, 2000, "Japan", 2, "Lightweightcar");
        Heavyweightcar hatchback1 = new Heavyweightcar("brand1", "model1", "White", 130, 2000, "Japan", 2, "Heavyweightcar");
        carsQueue.add(car1);
        System.out.println("Обслуживание");
        carsQueue.remove(car1);
        carsQueue.add(hatchback1);
        System.out.println("Обслуживание");
        carsQueue.remove(hatchback1);
    }



    public Queue<Object> getCarsQueue() {
        return carsQueue;
    }


}