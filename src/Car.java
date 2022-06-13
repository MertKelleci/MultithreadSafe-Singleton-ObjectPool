public class Car {
    private String carName;
    private boolean available = true;

    public Car(String carName) {
        this.carName = carName;
    }

    public synchronized String RentCar(String customerName) {
        if (!available) {
            try {
                wait(100);
            } catch (InterruptedException e) {

            }
            return null;
        }

        available = false;
        notifyAll();
        return carName;
    }

    public synchronized void ReturnCar() {
        available = true;
        System.out.println(carName + " aracı alınmaya hazır.\n");
        notifyAll();
    }
}
