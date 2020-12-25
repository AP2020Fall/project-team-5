package plato.controller;

import plato.model.Player;
import plato.model.User;
import plato.model.Event;
import plato.model.Game;

public class PlayerController extends UserController{
//    private Player player;

    public void participateInEvent(Event event) {

    }

    public void changeMenu() {

    }

    public void runGame(Game game) {

    }

    public void addFriend(User user) {

    }

    public boolean searchFriends(String friendID) {
        return false;
    }

    public void chooseSuggestedGame(Game game) {

    }

    public void addFriend(Player player, Player friend) {
        friend.getFriendsRequests().add(player.getUsername());
    }

    public void removeFriend(Player player, String friendUsername) {
        player.getFriends().removeIf(friend -> friend.getUsername().equals(friendUsername));
    }

    public void accept(Player player, Player friend) {
        for (String username: player.getFriendsRequests()) {
            if (friend.getUsername().equals(username)){
                player.getFriends().add(friend);
                player.getFriendsRequests().remove(username);
                friend.getFriends().add(player);
            }
        }
    }

    public void decline(Player player, Player friend) {
        player.getFriendsRequests().removeIf(username -> friend.getUsername().equals(username));
    }
}
