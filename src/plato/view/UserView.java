package plato.view;

import plato.model.Player;
import plato.model.User;

public class UserView {

    public String viewAccountMenu() {
        return "";
    }

    public String viewPlatoStatistics(Player player) {
        return null;
    }

    public String viewGamesHistory() {
        return null;
    }

    public String viewGameStatistics(String gameName) {
        return null;
    }

    public String showFriends(String playerUsername) {
        String friends="";
        for(Player player : Player.getPlayers()){
            if (player.getUsername().equals(playerUsername)){
                for (Player friend : player.getFriends()) {
                    friends+= friend.getUsername()+"\n";
                }
            }
        }
        return friends;
    }

    public String viewUserInfo(User user) {
        return String.valueOf(user);
    }

    public String showFriendsRequest(String playerUsername) {
        String requests="";
        //       or for (User user: User.getUsers()) ?????????
        for (Player player: Player.getPlayers()) {
            if (player.getUsername().equals(playerUsername)){
                for (String username : player.getFriendsRequests()) {
                    requests+= username+"\n";
                }
            }
        }
        return requests;
    }

}
