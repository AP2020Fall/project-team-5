package plato.model;

import Menu.GameMenu;
import plato.Game;

public abstract class GameModel extends Game implements GameMenu {

    public GameModel(String gameID, String gameName) {
        super(gameID, gameName);
    }
    @Override
    public void runGame(Game game) {

    }
}
