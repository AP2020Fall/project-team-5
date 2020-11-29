package plato.controller;

import Menu.GameMenu;
import plato.Game;
import plato.dotsAndBoxes.DotsAndBoxes;

public abstract class GameController extends Game implements GameMenu {

    public GameController(String gameID, String gameName) {
        super(gameID, gameName);
    }
    @Override
    public void open(String gameName) {
        if(gameName.equals("Dots And Boxes"))
            DotsAndBoxes.startDotsAndBoxes();
        if(gameName.equals("Battle Sea"))
            BattleSeaController.startBattleSea();

    }



    @Override
    public void addToFavorite(Game game) {

    }
}
