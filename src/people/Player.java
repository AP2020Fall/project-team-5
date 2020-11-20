package people;

import Menu.PlayerMenu;
import plato.Event;
import plato.Game;
import plato.GameLog;

import java.util.ArrayList;

public class Player extends User implements PlayerMenu {
    private int platoAge;
    private double moneyAmount;
    private int score;
    private GameLog gameLog;
    private ArrayList<Player> friends;
    private ArrayList<Player> friendsRequests;

    public Player(String firstname, String lastName, String userName, String password, String email, String phoneNumber) {
        super(firstname, lastName, userName, password, email, phoneNumber);
    }

    public void participateInEvent(Event event) {

    }

    public void changeMenu() {

    }

    public void runGame(Game game) {

    }

    public void addFriend(User user) {

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

    @Override
    public String showPoints(Player player) {
        return null;
    }

    @Override
    public String viewFavoriteGames() {
        return null;
    }

    @Override
    public String viewPlatoMessages() {
        return null;
    }

    @Override
    public String viewLastPlayed() {
        return null;
    }

    @Override
    public String viewAdminSuggestions() {
        return null;
    }

    @Override
    public void chooseSuggestedGame(Game game) {

    }

    @Override
    public void addFriend(Player player, Player friend) {

    }
}
