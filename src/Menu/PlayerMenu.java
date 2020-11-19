package Menu;

import gameStuff.Game;
import people.Player;

public class PlayerMenu {
    public String showPoints(Player player){
        return String.valueOf(player.getScore());
    }

    public String viewFavoriteGames(){
        return "";
    }

    public String viewPlatoMessages(){
        return "";
    }

    public String viewLastPlayed(){
        return "";
    }

    public String viewAdminSuggestions(){
        return"";
    }

    public void chooseSuggestedGame(Game game){

    }

    public void addFriend(Player player, Player friend){
        player.getFriends().add(friend);
    }


}
