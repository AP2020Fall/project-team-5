package plato;

import Menu.GameMenu;
import plato.battleSea.BattleSeaController;
import plato.dotsAndBoxes.DotsAndBoxes;

public class Game implements GameMenu {
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


    @Override
    public void open(String gameName) {
        if(gameName.equals("Dots And Boxes"))
            DotsAndBoxes.startDotsAndBoxes();
        if(gameName.equals("Battle Sea"))
            BattleSeaController.startBattleSea();

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
    public void addToFavorite(Game game) {

    }

    @Override
    public void runGame(Game game) {

    }

    @Override
    public String showPoints(Game game) {
        return null;
    }
}
