import java.util.ArrayList;

public class Player extends User {
    private int numberOfDaysSinceRegisteration;
    private double moneyAmount;
    private int score;
    private GameLog gameLog;
    private ArrayList<Player> friends;
    private ArrayList<Player> friendsRequests;

    public void participateInEvent(Event event){

    }

    public void changeMenu(){

    }

    public void runGame(Game game){

    }

    public void addFriend(User user){

    }

    public int getNumberOfdaysSinceRegisteration() {
        return numberOfDaysSinceRegisteration;
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
