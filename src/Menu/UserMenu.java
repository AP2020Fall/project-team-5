package Menu;

import gameStuff.Game;
import people.Player;
import people.User;

public class UserMenu {
    public String viewAccountMenu(){
        return "View personal info\n" + "View plato statistics\n" + "Game history\n" + "";
    }

    public void changePassword(String currentPassword, String newPassword){

    }

    public void edit(String field, String newValue) {

    }

    public String viewPlatoStatistics(Player player){
        return "Friends:\n"+player.getFriends()+"\n";
    }

    public String viewGamesHistory(){
        return "";
    }

    public String viewGameStatistics(String gameName){
        return "";
    }

    public void logout(){

    }
}
