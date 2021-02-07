package plato.model;

import java.util.ArrayList;

public class Player{
    private static ArrayList<Player> players = new ArrayList<>();
    private String firstname;
    private int platoAge;
    private double moneyAmount;
    public int player_wins, player_loses, player_draws;
    private GameLog gameLog;
    private ArrayList<Player> friends;
    private ArrayList<String> friendsRequests;

    public Player(String firstname) {
        this.firstname = firstname;
        players.add(this);
        platoAge=0;
        moneyAmount=0;

    }
    public String getName(){
        return firstname;
    }
    public static void remove(Player player){
        players.remove(player);
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
