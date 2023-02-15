import java.util.List;
public class Bus extends Transport {
    sitCapacity sitCapacity;
    public Bus(String brand, String model, String color, int maxSpeed, int year, String country, int engineVolume, String carType, Mechanic mechanic) {
        super(brand, model, year, country, color, maxSpeed, engineVolume, carType, (List<Mechanic>) mechanic);
    }

    enum sitCapacity{
        small,
        little,
        average,
        big,
        large
    }

    public Bus.sitCapacity getSitCapacity() {
        return sitCapacity;
    }

    public void setSitCapacity(Bus.sitCapacity sitCapacity) {
        this.sitCapacity = sitCapacity;
    }

    public void printType() {
        System.out.println(carType);
    }
}