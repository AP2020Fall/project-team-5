package gameStuff;

import Menu.GameMenu;
import gameStuff.battleSea.BattleSea;

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
            gameStuff.DotsAndBoxes.startDotsAndBoxes();
        if(gameName.equals("Battle Sea"))
            BattleSea.startBattleSea();

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
