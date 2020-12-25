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
        Player player = (Player) user;
        StringBuilder list = new StringBuilder();
        for(Player p : player.getFriends())
        {
            System.out.println(p.getUsername());
            list.append(p.getUsername()).append("\n");
        }
        return list.toString();
    }

    public String viewUserProfile(User user) {
        System.out.println("Username: " + user.getUsername() +
                "\nFirst Name: " + user.getFirstname() +
                "\nLast Name: " + user.getLastName() +
                "\nEmail: " + user.getEmail() +
                "\nUserID: " + user.getUserID() +
                "\nPhone Number: " + user.getPhoneNumber()
        );
        return "Username: " + user.getUsername() +
                "\nFirst Name: " + user.getFirstname() +
                "\nLast Name: " + user.getLastName() +
                "\nEmail: " + user.getEmail() +
                "\nUserID: " + user.getUserID() +
                "\nPhone Number: " + user.getPhoneNumber();
    }

    public String showFriendsRequest(String playerUsername) {
        String requests="";
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
