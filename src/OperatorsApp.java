public class OperatorsApp {
    public static void main(String[] args) {

        String carModel = "Dodge Challenger";
        int price = 14000;
        int moneyInBank = 50000;
        boolean isDamaged = false;

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

        int priceNegative = -14000;
        int priceNegativeWithPlusSign = +priceNegative;
        System.out.println("Negative price with plus sign: " + priceNegativeWithPlusSign);
        int priceNegativeWithMinusSign = -priceNegative;
        System.out.println("Negative price with minus sign: " + priceNegativeWithMinusSign);

        System.out.println("Car's price equals money: " + (price == moneyInBank));
        System.out.println("Car's price does not equal money: " + (price != moneyInBank));
        System.out.println("Car's price is greater than money: " + (price > moneyInBank));
        System.out.println("Car's price is less than money: " + (price < moneyInBank));
        System.out.println("Car's price is greater than or equals money: " + (price >= moneyInBank));
        System.out.println("Car's price is less or equals than money: " + (price <= moneyInBank));

        String damagedText = isDamaged ? "The car is damaged" : "The car is not damaged";
        System.out.println(damagedText);

        String worthSeeingText = !isDamaged || price <= 20000 ? "Worth" : "Not worth";
        System.out.println(worthSeeingText);

        String worthRepairingText = isDamaged && price <= 20000 ? "To repair" : "Not to repair";
        System.out.println(worthRepairingText);

        price += 1000;
        System.out.println("Price increased: " + price);
        price -= 2000;
        System.out.println("Price decreased: " + price);
        price *= 2;
        System.out.println("Price multiplied: " + price);
        price /= 2;
        System.out.println("Price divided: " + price);
        price %= 10000;
        System.out.println("Price remained:" + price);

    }
}
