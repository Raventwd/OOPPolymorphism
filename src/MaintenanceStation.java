import java.util.LinkedList;
import java.util.Queue;

public class MaintenanceStation {
    Queue<Object> carsQueue = new LinkedList<>();


    public MaintenanceStation() {
        Queue<Object> carsQueue = new LinkedList<>();
    }

    public void queueCarAdd(Transport Object) {
        carsQueue.add(Object);

    }


    public void getCarsQueue() {
        System.out.println(carsQueue.poll());
        maintenance();
    }

    public void maintenance() {
    carsQueue.remove();
    }


}