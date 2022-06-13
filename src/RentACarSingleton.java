import java.util.ArrayList;

public class RentACarSingleton {
    private static RentACarSingleton RACInstance = null;
    private static ArrayList<Car> carList;

    private RentACarSingleton() {
        carList = new ArrayList<Car>();
        carList.add(new Car("Renault"));
        carList.add(new Car("Fiat"));
        carList.add(new Car("Volkswagen"));
        carList.add(new Car("Opel"));
        carList.add(new Car("Ford"));
        carList.add(new Car("Hyundai"));
        carList.add(new Car("Toyota"));
        carList.add(new Car("Peugeot"));
        carList.add(new Car("Honda"));
        carList.add(new Car("Mercedes"));
    };

    public static RentACarSingleton getInstance() {
        if (RACInstance == null) {
            synchronized (RentACarSingleton.class) {
                if (RACInstance == null) {
                    RACInstance = new RentACarSingleton();
                }
            }
        }
        return RACInstance;
    }

    public ArrayList<Car> getCarList() {
        synchronized (RentACarSingleton.class) {
            return carList;
        }
    }

}
