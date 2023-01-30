public class Lightweightcar extends Transport {
    bodyType bodyType;
    public Lightweightcar(String brand, String model, String color, int maxSpeed, int year, String country, int engineVolume, String carType) {
        super(brand, model, year, country, color, maxSpeed, engineVolume, carType);
    }

    enum bodyType {
        Седан,
        Хетчбэк,
        Купе,
        Универсал,
        Внедорожник,
        Кроссовер,
        Пикап,
        Фургон,
        Минивэн
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