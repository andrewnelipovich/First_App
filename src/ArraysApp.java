public class ArraysApp {
    public static void main(String[] args) {
        int[] lotteryNumbers = new int[5];

        lotteryNumbers[0] = 17;
        lotteryNumbers[1] = 65;
        lotteryNumbers[2] = 4;
        lotteryNumbers[3] = 7;
        lotteryNumbers[4] = 14;

        for (int lotteryNum : lotteryNumbers){
            System.out.println(lotteryNum);
        }

        int[][] weeklyLotteryNumbers = {
                {1,2,3,4,5},
                {10,2,30,40,5},
                {1,26,37,43,52},
                {15,24,3,40,56}
        };
        for (int i = 0; i < weeklyLotteryNumbers.length; i++) {
            for (int j = 0; j < weeklyLotteryNumbers[i]; j++) {

            }
        }
    }
}
