package beginner;

public class HomeworkPrimitivesAmazon {
    public static void main (String[] args) {
        String title = "Glass";
        float score = 4.5F;
        float price = 25.5F;
        short quantity = 10;
        byte numberinSet = 5;
        int reviews = 15000;

        System.out.println("Title: " + title);
        System.out.println("Score: " + score);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Number in set: " + numberinSet);
        System.out.println("Reviews: " + reviews);

    }

//    String title = "Glass";
//    float score = 4.5F;
//    float price = 25.5F;
//    short quantity = 10;
//    byte numberinSet = 5;
//    int reviews = 15000;
//
//    public HomeworkPrimitivesAmazon(String title, float score, float price, short quantity, byte numberinSet, int reviews) {
//        this.title = title;
//        this.score = score;
//        this.price = price;
//        this.quantity = quantity;
//        this.numberinSet = numberinSet;
//        this.reviews = reviews;
//    }

    public void getOpinion(short quantity){
        if (quantity <= 20) {
            System.out.println("Fuuu");;
        }
        else {
            System.out.println("Norm");;
        }
    }
}


