package intermediate.inheritance.athlete;

import java.util.Random;

public class BasketballPlayer extends Athlete {

    private double freeThrowPercentage;
    private double pointsPerGame;

    public BasketballPlayer(String name, String nickname, int yearOfBirth,
                          String team, double freeThrowPercentage, double pointsPerGame, int gamesPlayed) {
        super(name, nickname, yearOfBirth, team, gamesPlayed);
        this.freeThrowPercentage = freeThrowPercentage;
        this.pointsPerGame = pointsPerGame;
    }

    public void getFreeThrowPercentage(){
        Random randomNumberGenerator = new Random();
        if ((randomNumberGenerator.nextDouble() * 100) > freeThrowPercentage){
            System.out.println(super.getName() + " failed to score free throw.");
        }
        else {
            System.out.println(super.getName() + " scored free throw.");
        }
    }

    @Override
    public void getBio() {
        super.getBio();
        System.out.println("Throw percentage " + freeThrowPercentage);
        System.out.println("Points " + pointsPerGame);
    }
}
