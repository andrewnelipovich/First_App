public class ControlFlowApp {
    public static void main(String[] args) {

        boolean isDamaged = false;
        String carColor = "Green";
        char energyEfficiencyCategory = 'a';

        if (isDamaged) {
            System.out.println("Damaged car");
        }
        else {
            System.out.println("Undamaged");
        }

        if (carColor.equals("red")) {
            System.out.println("Car is red");
        } else if (carColor.equals("green")) {
            System.out.println("Car is green");
        } else if (carColor.equals("blue")) {
            System.out.println("Car is blue");
        } else {
            System.out.println("Color unknown");
        }

        switch (energyEfficiencyCategory) {
            case 'A':
            case 'B':
                System.out.println("Low energy");
                break;
            case 'G':
                System.out.println("High energy");
                break;
            default:
                System.out.println("Consumption unknown" + "\n");
        }

        {
            int number = 5;
            {
                number++;
            }
            System.out.println("Number: " + number);
        }
    }
}
