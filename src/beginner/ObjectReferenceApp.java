package beginner;

public class ObjectReferenceApp {
    public static void main(String[] args) {
        Byte numberOfSeats = 5;
        Short horsepower = 300;
        Integer price = 14000;
        Long registationNumber = 32343432L;

        Float fuelConsumption = 15.5F;
        Double fuelConsumptionPrecise = 15.324324;

        Boolean isDamaged = true;
        Character energyEfficiency = 'G';

        String carModel = "Dodge Challenger";
        String carModelNew = new String("Dodge Challenger");

        System.out.println("Number of seats " + numberOfSeats);
        System.out.println("Horsepower " + horsepower);
        System.out.println("Price " + price.floatValue());
        System.out.println("Registration number " + registationNumber);
        System.out.println("Fuel consumption " + fuelConsumption.intValue());
        System.out.println("Damaged " + isDamaged);
        System.out.println("Energy efficiency " + energyEfficiency);
        System.out.println("Car model " + carModelNew.toUpperCase());
        System.out.println("Car model " + carModelNew.toLowerCase());
        System.out.println("Car model and car model with key are equal " + carModelNew.equals(carModel));

    }
}
