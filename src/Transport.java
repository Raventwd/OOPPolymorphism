import java.util.ArrayList;

public abstract class Transport {
    private final String brand;
    private final String model;
    private final int year;
    private final String country;
    private String color;
    private int maxSpeed;

    public String carType;

    private int engineVolume;

    private Mechanic mechanic;

    public Transport(String brand, String model, int year, String country, String color, int maxSpeed, int engineVolume, String carType, Mechanic mechanic) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.country = country;
        this.color = (color != null && color.isEmpty() != true && color.isBlank() != true) ? color : "white";
        this.maxSpeed = (maxSpeed >= 0) ? maxSpeed : 100;
        this.engineVolume = engineVolume;
        this.carType = carType;
        this.mechanic=mechanic;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }


    public String getColor() {
        return color;
    }

    public String getCountry() {
        return country;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getEngineVolume() {
        return engineVolume;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}' + ", engineVolume" + engineVolume;
    }

    public abstract void printType();



    ArrayList <String> mechanicList = new ArrayList<>();



    public void carCheck() throws Exception {
        if(carType == "Lightweightcar" || carType == "Heavyweightcar"){
            System.out.println("Можно пройти диагностику");
        }
        if(carType == "Bus"){
            throw new Exception("TransportTypeException");
        }
    }

}