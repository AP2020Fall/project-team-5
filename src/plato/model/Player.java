package plato.model;

import java.util.ArrayList;

public class Player extends User {
    private static ArrayList<Player> players = new ArrayList<>();
    private int platoAge;
    private double moneyAmount;
    public static int player1_score, player2_score;
    public static int player1_wins, player2_wins;
    public static int numberofequal;
    private GameLog gameLog;
    private ArrayList<Player> friends;
    private ArrayList<String> friendsRequests;

    public Player(String firstname, String lastName, String userName, String password, String email, String phoneNumber) {
        super(firstname, lastName, userName, password, email, phoneNumber);
        platoAge=0;
        moneyAmount=0;
        player1_score=0;
        player2_score=0;
        player1_wins=0;
        player2_wins=0;
        numberofequal=0;

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

    public static int getScorePlayer1(Player player1) {
        return player1_score;
    }
    public static int getScorePlayer2(Player player2){
        return player2_score;
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
