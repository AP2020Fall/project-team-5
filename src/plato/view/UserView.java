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

    public String showFriends(User user) {
        return null;
    }

    public String viewUserProfile(User user) {
        return null;
    }

    public String showFriendsRequest(String PlayerUsername) {
        String requests="";
        for (User user: User.getUsers()) {

        }
        return requests;
    }

}
