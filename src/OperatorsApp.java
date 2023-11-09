public class OperatorsApp {
    public static void main(String[] args) {

        String carModel = "Dodge Challenger";
        int price = 14000;
        int moneyInBank = 50000;
        boolean isDamaged = true;

        System.out.println("Price of a " + carModel + " = " + price);

        int increasedPrice = price + 1000;
        System.out.println("Increased price of a " + carModel + " = " + increasedPrice); //First comment

        int decreasedPrice = price - 1000;
        System.out.println("Decreased price of a " + carModel + " = " + decreasedPrice);

        int carsMultiplier = 2;
        int twoCarsPrice = decreasedPrice * carsMultiplier;
        System.out.println("Price of " + carsMultiplier + " cars " + carModel + " = " + twoCarsPrice);

        int youCanAfford = moneyInBank / price;
        System.out.println("You can buy " + youCanAfford + " " + carModel);

        int moneyLeft = moneyInBank % price;
        System.out.println("After purchase of " + youCanAfford + " " + carModel + " left " + moneyLeft);
    }
}
