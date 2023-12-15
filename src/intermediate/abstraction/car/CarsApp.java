package intermediate.abstraction.car;

import intermediate.inheritance.car.Car;

public class CarsApp {
    public static void main(String[] args) {

        DodgeChallenger orangeDodge = new DodgeChallenger("Dodge Challenger", "green", ", l/km", (byte)3,
                (short)300, (short)492, 20333, false, 99999);

        System.out.println(orangeDodge.getCarName() + " price " + orangeDodge.getPrice());
        orangeDodge.setPrice(-35000);
        System.out.println(orangeDodge.getCarName() + " new price " + orangeDodge.getPrice());
        orangeDodge.startElectricEngine();

        System.out.println();

        Toyota blackToyota = new Toyota("black", ", l/km", (byte)3,
                (short)300, (short)492, 33333, false, 99999);
        blackToyota.getDescription();
        blackToyota.startTheEngine();

    }
}
