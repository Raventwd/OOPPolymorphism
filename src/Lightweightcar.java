public class Lightweightcar extends Transport {
    bodyType bodyType;
    public Lightweightcar(String brand, String model, String color, int maxSpeed, int year, String country, int engineVolume, String carType) {
        super(brand, model, year, country, color, maxSpeed, engineVolume, carType);
    }

    enum bodyType {
        sedan,
        hatchback,
        coupe,
        wagon,
        offroad,
        crossover,
        minivan
    }

    public String toString() {
        return ("тип кузова" +bodyType);
    }

    public Lightweightcar.bodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(Lightweightcar.bodyType bodyType) {
        this.bodyType = bodyType;
    }

    public void printType() {
        System.out.println(carType);
    }

}