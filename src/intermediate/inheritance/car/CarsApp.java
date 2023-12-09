package intermediate.inheritance.car;

public class CarsApp {
    public static void main(String[] args) {

        DodgeChallenger orangeDodge = new DodgeChallenger("Dodge Challenger", "green", ", l/km", (byte)3,
                (short)300, (short)492, 33333, false, 99999);
        orangeDodge.getDescription();
        orangeDodge.startTheEngine();
        System.out.println();

        Toyota blackToyota = new Toyota("black", ", l/km", (byte)3,
                (short)300, (short)492, 33333, false, 99999);
        blackToyota.getDescription();
        blackToyota.startTheEngine();
    }
}
