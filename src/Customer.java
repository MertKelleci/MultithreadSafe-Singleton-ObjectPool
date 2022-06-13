import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.locks.ReentrantLock;

public class Customer implements Runnable {
    private String customerName;
    private String threadColor;
    private ArrayList<Car> instance;
    private boolean need = true;
    private ReentrantLock lock = new ReentrantLock();

    public Customer(String customerName, String threadColor) {
        this.customerName = customerName;
        this.threadColor = threadColor;
        instance = RentACarSingleton.getInstance().getCarList();
    }

    @Override
    public void run() {
        Random random = new Random();
        while (need) {
            for (Car car : instance) {
                lock.lock();
                try {
                    String carName = car.RentCar(customerName);
                    if (carName == null) {
                        continue;
                    } else {
                        int waitingTime = random.nextInt(3000) + 5000;
                        System.out.println(threadColor + customerName + " adlı müşteri " + carName + " aracını "
                                + (waitingTime / 1000) + " saniyeliğine kiraladı. ");
                        try {
                            Thread.sleep(waitingTime);
                            need = false;
                            System.out.println(
                                    "\n" + threadColor + customerName + " adlı müşterinin ihtiyacı karşılandı.");
                            car.ReturnCar();
                            break;
                        } catch (InterruptedException e) {

                        }
                    }
                } finally {
                    lock.unlock();
                }
            }
            if (need) {
                int waitingTime = random.nextInt(2000) + 1000;
                try {
                    System.out.println("\n" + threadColor + customerName + " adlı kullanıcıya ayrılacak araç kalmadı. "
                            + (waitingTime / 1000) + " saniye sonra tekrar deneyecek.");
                    Thread.sleep(waitingTime);
                } catch (InterruptedException e) {

                }
            }
        }

    }

}
