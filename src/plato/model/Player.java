package plato.model;

import java.util.ArrayList;

public class Player extends User {
    private int platoAge;
    private double moneyAmount;
    private int score;
    private GameLog gameLog;
    private ArrayList<Player> friends;
    private ArrayList<Player> friendsRequests;

    public Player(String firstname, String lastName, String userName, String password, String email, String phoneNumber) {
        super(firstname, lastName, userName, password, email, phoneNumber);
        platoAge=0;
        moneyAmount=0;
        score=0;
    }

    public int getNumberOfdaysSinceRegisteration() {
        return platoAge;
    }

    public double getMoneyAmount() {
        return moneyAmount;
    }

    public int getScore() {

        return score;
    }

    public GameLog getGameLog() {
        return gameLog;
    }

    public ArrayList<Player> getFriends() {
        return friends;
    }

    public ArrayList<Player> getFriendsRequests() {
        return friendsRequests;
    }

}
