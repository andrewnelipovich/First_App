package intermediate.abstraction.car;

public class Toyota extends Car {
    public Toyota(String color, String consumptionValue, byte numberOfVehicleOwners, short horsePower, short cubicCapacity, int price, boolean isDamaged, int mileage) {
        super("Toyota", color, consumptionValue, numberOfVehicleOwners, horsePower, cubicCapacity, price, isDamaged, mileage);
    }

    @Override
    public void startTheEngine() {
        System.out.println("Toyota is started");
    }
}
