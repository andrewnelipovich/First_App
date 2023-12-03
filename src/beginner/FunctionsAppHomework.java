package beginner;

public class FunctionsAppHomework {
    public static void main(String[] args) {
        System.out.println(getEnergyConsumption('f'));
        getCarDescription("blabla", 5, "more blabla");
    }

    static String getEnergyConsumption(char energyConsumptionClass){
        switch (Character.toUpperCase(energyConsumptionClass)){
            case 'A':
                return "Low consumption";
            case 'B':
                return "Average consumption";
            case 'C':
                return "High consumption";
            default:
                return "Don't know consumption";
        }
    }

    static void getCarDescription(String model, int productionYear, String condition){
        System.out.println(model + " " + productionYear + " " + condition);
    }
}
