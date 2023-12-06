package intermediate;

import java.util.Random;

public class BasketballPlayer {
    private String name;
    private String nickname;
    private int yearOfBirth;
    private String team;
    private double freeThrowPercentage;
    private double pointsPerGame;
    private int gamesPlayed;

    public BasketballPlayer(String name, String nickname, int yearOfBirth,
                          String team, double freeThrowPercentage, double pointsPerGame, int gamesPlayed) {
        this.name = name;
        this.nickname = nickname;
        this.yearOfBirth = yearOfBirth;
        this.team = team;
        this.freeThrowPercentage = freeThrowPercentage;
        this.pointsPerGame = pointsPerGame;
        this.gamesPlayed = gamesPlayed;
    }

    public void getFreeThrowPercentage(){
        Random randomNumberGenerator = new Random();
        if ((randomNumberGenerator.nextDouble() * 100) > freeThrowPercentage){
            System.out.println(name + " " + nickname + " failed to score free throw.");
        }
        else {
            System.out.println(name + " " + nickname + " scored free throw.");
        }
    }
}
