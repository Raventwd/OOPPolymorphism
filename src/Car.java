public class Car extends Transport {
    private String gear;
    private int seatsNumber;


    public Car(String brand, String model, String gear, int seatsNumber, int year, String country, String color, int maxSpeed, int engineVolume) {
        super(brand, model, year, country, color, maxSpeed, engineVolume);
    }

    public String getGear() {
        return gear;
    }

    public int getSeatsNumber() {
        return seatsNumber;
    }

    @Override
    public String toString() {
        return super.toString() + gear + seatsNumber;
    }
}