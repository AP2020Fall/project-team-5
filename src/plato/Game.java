package plato;

import Menu.GameMenu;
import plato.controller.BattleSeaController;
import plato.dotsAndBoxes.DotsAndBoxes;

public abstract class Game implements GameMenu {
    private String gameID;
    private String gameName;

    public Game(String gameID, String gameName) {
        this.gameID = gameID;
        this.gameName = gameName;
    }

    public String getGameID() {
        return gameID;
    }

    public String getGameName() {
        return gameName;
    }

    public void executeGame() {

    }

    public void setScore() {

    }
}
