package plato.model;

import java.util.ArrayList;

public class Player extends User {
    private static ArrayList<Player> players = new ArrayList<>();
    private int platoAge;
    private double moneyAmount;
    private int score;
    private GameLog gameLog;
    private ArrayList<Player> friends;
    private ArrayList<String> friendsRequests;

    public Player(String firstname, String lastName, String userName, String password, String email, String phoneNumber) {
        super(firstname, lastName, userName, password, email, phoneNumber);
        platoAge=0;
        moneyAmount=0;
        score=0;
    }

    public static ArrayList<Player> getPlayers() {
        return players;
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

    public ArrayList<String> getFriendsRequests() {
        return friendsRequests;
    }

}
