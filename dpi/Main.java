package dpi;

public class Main {
    public static void main (String []args) {
        Car fuelCar = new Car(new PetrolEngine());
        Car dieselCar = new Car(new DieselEngine());
        Car hybridCar = new Car(new HybridEngine());

        //Jalankan mobil
        fuelCar.start();
        dieselCar.start();
        hybridCar.start();
    }
}