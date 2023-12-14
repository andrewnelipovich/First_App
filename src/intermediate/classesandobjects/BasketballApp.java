package intermediate.classesandobjects;

public class BasketballApp {
    public static void main(String[] args) {

        BasketballPlayer kobe = new BasketballPlayer("Korben", "kobe", 1980,
                "gerh", 80.2, 20.2, 50);

        BasketballPlayer jordan = new BasketballPlayer("Mickael Jordan", "Nike", 1960,
                "toasty", 50.2, 50.2, 100);

        BasketballPlayer jonson = new BasketballPlayer("Jonson", "Magic", 1960,
                "dunno", 70.2, 10.2, 350);


        BasketballPlayer[] basketballPlayers = new BasketballPlayer[3];
        basketballPlayers[0] = kobe;
        basketballPlayers[1] = jordan;
        basketballPlayers[2] = jonson;

        for (BasketballPlayer someVariable : basketballPlayers){
            someVariable.getFreeThrowPercentage();
        }

//        kobe.getFreeThrowPercentage();
//        jordan.getFreeThrowPercentage();
//        jonson.getFreeThrowPercentage();
    }
}
