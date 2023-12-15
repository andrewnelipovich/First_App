package intermediate.abstraction.athlete;

public class AthleteApp {
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
            System.out.println();
            someVariable.getBio();
            System.out.println(someVariable.getBodyType());
        }

        FootballPlayer tom = new FootballPlayer("Tom", "test", 1996, "fuuu",
                55, 30, 20);
        FootballPlayer ed = new FootballPlayer("ED", "erg", 1898, "rg",
                55, 30, 20);

        FootballPlayer[] footballPlayers = new FootballPlayer[2];
        footballPlayers[0] = tom;
        footballPlayers[1] = ed;

        for (FootballPlayer footballPlayer : footballPlayers){
            System.out.println();
            footballPlayer.playGame();
            footballPlayer.getBio();
            System.out.println(footballPlayer.getBodyType());
        }
    }
}
