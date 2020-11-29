package plato.view;

import Menu.GameMenu;
import plato.Game;
import plato.GameLog;

public abstract class GameView extends Game implements GameMenu {
    public GameView(String gameID, String gameName) {
        super(gameID, gameName);
    }
    @Override
    public String showScoreboard(Game game) {
        return null;
    }

    @Override
    public String details(Game game) {
        return null;
    }

    @Override
    public String showLog(GameLog game) {
        return null;
    }

    @Override
    public String showWinsCount(Game game) {
        return null;
    }

    @Override
    public String showPlayedCount(Game game) {
        return null;
    }

    @Override
    public String showPoints(Game game) {
        return null;
    }
}
