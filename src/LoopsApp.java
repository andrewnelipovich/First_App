public class LoopsApp {
    public static void main(String[] args) {
       int i = 1;
       while (i <= 5) {
           System.out.println(i + " Being right sucks");
           i++;
       }
        System.out.println("Value of i is " + i);
        System.out.println();

       int j = 5;
       do {
           System.out.println(j + " Being right sucks");
           j++;
       } while (j <= 0);
        System.out.println("Value of j is " + j);
        System.out.println();

        for (int k = 1; k <= j; k++) {
            if (k == 3) {
                break;
            }
            System.out.println("Value of k is " + k);
        }
        System.out.println();

        for (int k = 1; k <= 5; k++) {
            for (int l = 1; l <= 2; l++) {
                System.out.println("k = " + k + " , value of l is " + l);
            }
        }
    }
}
