package intermediate.abstraction.car;

public class DodgeChallenger extends Car implements ElectricMode{


    public DodgeChallenger(String carName, String color, String consumptionValue, byte numberOfVehicleOwners, short horsePower,
                           short cubicCapacity, int price, boolean isDamaged, int mileage) {

        super(carName, color, consumptionValue, numberOfVehicleOwners, horsePower, cubicCapacity, price, isDamaged, mileage);
    }

    @Override
    public void startTheEngine() {
        System.out.println("Dodge engine is started");
    }

    @Override
    public void startElectricEngine() {
        System.out.println("Electric engine is started");
    }
}
