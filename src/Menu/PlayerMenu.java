package Menu;

import gameStuff.Game;
import people.Player;

public interface PlayerMenu {
    String showPoints(Player player);

    String viewFavoriteGames();

    String viewPlatoMessages();

    String viewLastPlayed();

    String viewAdminSuggestions();

    void chooseSuggestedGame(Game game);

    void addFriend(Player player, Player friend);
}
