public class Main {
    public static void main(String[] args) throws Exception {
        Bus bus1 = new Bus("brand1", "model1", "White", 130, 2000, "Japan", 2, "Bus");
        Bus bus2 = new Bus("brand2", "model2", "White", 160, 2005, "Usa", 2, "Bus");
        Bus bus3 = new Bus("brand3", "model3", "White", 170, 2008, "Australia", 2, "Bus");
        Bus bus4 = new Bus("brand4", "model4", "White", 170, 2009, "Australia", 2, "Bus");
        Lightweightcar car1 = new Lightweightcar("brand1", "model1", "White", 130, 2000, "Japan", 2, "Lightweightcar");
        Lightweightcar car2 = new Lightweightcar("brand2", "model2", "White", 130, 2000, "Japan", 2, "Lightweightcar");
        Lightweightcar car3 = new Lightweightcar("brand3", "model3", "White", 130, 2000, "Japan", 2, "Lightweightcar");
        Lightweightcar car4 = new Lightweightcar("brand4", "model4", "White", 130, 2000, "Japan", 2, "Lightweightcar");
        Heavyweightcar hatchback1 = new Heavyweightcar("brand1", "model1", "White", 130, 2000, "Japan", 2, "Heavyweightcar");
        Heavyweightcar hatchback2 = new Heavyweightcar("brand2", "model2", "White", 130, 2000, "Japan", 2, "Heavyweightcar");
        Heavyweightcar hatchback3 = new Heavyweightcar("brand3", "model3", "White", 130, 2000, "Japan", 2, "Heavyweightcar");
        Heavyweightcar hatchback4 = new Heavyweightcar("brand4", "model4", "White", 130, 2000, "Japan", 2, "Heavyweightcar");

        System.out.println(bus1);
        System.out.println(bus2);
        System.out.println(bus3);
        System.out.println(bus4);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);

        System.out.println(hatchback1);
        System.out.println(hatchback2);
        System.out.println(hatchback3);
        System.out.println(hatchback4);
        car1.printType();
        car1.carCheck();
        bus1.carCheck();
    }

    public interface competitive {
        void pitStop();

        void bestLapTime();

        void maxSpeed();
    }
}
