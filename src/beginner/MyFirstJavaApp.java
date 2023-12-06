package beginner;

import intermediate.classesandobjects.DodgeChallenger;

public class MyFirstJavaApp {
    public static void main(String[] args) {
        byte numberOfSeats = 5;
        byte numberOfDoors = 3;
        byte numberOfVehicleOwners = 1;
        byte emissionSticker = 4;

        short kwPower = 362;
        short horsePower = 460;
        short co2Emissions = 333;
        short cubicCapacity = 6500;

        int price = 30000;
        int mileage = 14000;

        long registrationNumber = 12345623443234789L;

        float fuelConsumptionCombined = 15.5F;
        float fuelConsumptionUrban = 20.5F;
        float fuelConsumptionExtraUrban = 10.5F;

        double fuelConsumptionPreciseAverage = 1.51234545123234e1;

        String consumptionValue = "l/km";

        boolean isDamaged = true;

        char energyEfficiencyCategory = 'G';

        System.out.println("2018 Dodge Challenger SRT 392");
        System.out.println("Price: $" + price + " Dollars");
        System.out.println("Mileage: " + mileage + "KM");
        System.out.println("The car is Damaged: " + isDamaged);
        System.out.println("Registration number: " + registrationNumber);
        System.out.println("Cubic capacity: " + cubicCapacity + "ccm");
        System.out.println("Power: " + kwPower + "kW (" + horsePower + " bhp)");
        System.out.println("CO2 Emission: " + co2Emissions + "g/km");
        System.out.println("Fuel consumption: " + "Combined - " + fuelConsumptionCombined + consumptionValue + ", Urban - " + fuelConsumptionUrban + consumptionValue + ", Extra urban - " + fuelConsumptionExtraUrban + consumptionValue);

        System.out.println("Conversion");
        short newNumberOfSeats = numberOfSeats;
        System.out.println("The value of new number of seats: " + newNumberOfSeats);
        double newFuelConsumptionCombined = fuelConsumptionCombined;
        System.out.println("The new value of combined fuel consumption: " + newFuelConsumptionCombined + "l/ml");

        byte newPower = (byte) horsePower;
        System.out.println("The value of new power: " + newPower);

        DodgeChallenger orangeDodge = new DodgeChallenger("green", ", l/km", (byte)3,
                (short)300, (short)492, 33333, false, 99999);
    }
}

