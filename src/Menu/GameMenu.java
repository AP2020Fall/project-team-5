package Menu;

import gameStuff.Game;
import gameStuff.GameLog;

public interface GameMenu {
    void open(String gameName);
    String showScoreboard(Game game);
    String details(Game game);
    String showLog(GameLog game);
    String showWinsCount(Game game);
    String showPlayedCount(Game game);
    void addToFavorite(Game game);
    void runGame(Game game);
    String showPoints(Game game);


}
