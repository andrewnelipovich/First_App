public class FunctionsApp {
    public static void main(String[] args) {
        sayHello();
        blackBoard(5);
        System.out.println("Price " + getTenPecentOf(20000));
        System.out.println("Price 50% off " + getDiscountPrice(20000, 50));
        System.out.println("Price 50% off " + getDiscountPrice(40000.0, 40));
    }

    static void sayHello() {
        System.out.println("Hello");
    }

    static void blackBoard(int repeatNumber) {
        for (int i = 1; i <= repeatNumber; i++) {
            System.out.println("Being right sucks");
        }
    }

    static double getTenPecentOf(int price){
        return price * 0.9;
    }

    static double getDiscountPrice(int price, int percent){
        return price * percent / 100.0;
    }

    static double getDiscountPrice(double price, int percent){
        return price * percent / 100;
    }
}
