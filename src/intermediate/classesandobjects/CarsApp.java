package intermediate.classesandobjects;

public class CarsApp {
    public static void main(String[] args) {
//        DodgeChallenger dodgeChallenger = new DodgeChallenger();
//        dodgeChallenger.startTheEngine();
//        DodgeChallenger.getDescription();
//        System.out.println();

        DodgeChallenger orangeDodge = new DodgeChallenger("green", ", l/km", (byte)3,
                (short)300, (short)492, 33333, false, 99999);
        orangeDodge.getDescription();
    }
}
