package intermediate.abstraction.car;

import java.util.Random;

public abstract class Car {
    byte numberOfSeats = 5;
    byte numberOfDoors = 3;
    byte numberOfVehicleOwners = 1;
    byte emissionSticker = 4;

    short kwPower = 362;
    short horsePower = 460;
    short co2Emissions = 333;
    short cubicCapacity = 6500;

    private int price = 30000;
    private int mileage = 14000;

    long registrationNumber = 12345623443234789L;

    float fuelConsumptionCombined = 15.5F;
    float fuelConsumptionUrban = 20.5F;
    float fuelConsumptionExtraUrban = 10.5F;

    double fuelConsumptionPreciseAverage = 1.51234545123234e1;

    String consumptionValue = "l/km";

    boolean isDamaged = true;

    char energyEfficiencyCategory = 'G';

    private String color;
    private String carName;

    public Car(String carName, String color, String consumptionValue, byte numberOfVehicleOwners, short horsePower,
                           short cubicCapacity, int price, boolean isDamaged, int mileage){
        this.carName = carName;
        this.color = color;
        this.consumptionValue = consumptionValue;
        this.numberOfVehicleOwners = numberOfVehicleOwners;
        this.horsePower = horsePower;
        this.cubicCapacity = cubicCapacity;
        this.price = price;
        this.isDamaged = isDamaged;
        this.mileage = mileage;
        Random randomNumber = new Random();
        this.registrationNumber = randomNumber.nextLong();
    }

    public abstract void startTheEngine();

    public void getDescription(){
        System.out.println(carName);
        System.out.println("Price: $" + price + " Dollars");
        System.out.println("Mileage: " + mileage + "KM");
        System.out.println("The car is Damaged: " + isDamaged);
        System.out.println("Registration number: " + registrationNumber);
        System.out.println("Cubic capacity: " + cubicCapacity + "ccm");
        System.out.println("Power: " + kwPower + "kW (" + horsePower + " bhp)");
        System.out.println("CO2 Emission: " + co2Emissions + "g/km");
        System.out.println("Fuel consumption: " + "Combined - " + fuelConsumptionCombined + consumptionValue + ", Urban - " + fuelConsumptionUrban + consumptionValue + ", Extra urban - " + fuelConsumptionExtraUrban + consumptionValue);
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = Math.abs(price);
    }

    public int getMileage() {
        return mileage;
    }

    public void drive(int mileage){
        this.mileage += Math.abs(mileage);
    }

    public String getCarName() {
        return carName;
    }

}
