import java.util.List;
public class Heavyweightcar extends Transport {

    private allowedWeight allowedWeight;


    public Heavyweightcar(String brand, String model, String color, int maxSpeed, int year, String country, int engineVolume, String carType, List<Mechanic>mechanics) {
        super(brand, model, year, country, color, maxSpeed, engineVolume, carType, mechanics );
    }

    enum allowedWeight {
        N1,
        N2,
        N3
    }

    public void setAllowedWeight(Heavyweightcar.allowedWeight allowedWeight) {
        this.allowedWeight = allowedWeight;
    }

    public Heavyweightcar.allowedWeight getAllowedWeight() {
        return allowedWeight;
    }

    public void printType() {
        System.out.println(carType);
    }

}