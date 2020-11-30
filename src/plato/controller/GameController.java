package plato.controller;

import plato.model.Game;
import plato.dotsAndBoxes.DotsAndBoxes;

public class GameController {

    public void open(String gameName) {
        if(gameName.equals("Dots And Boxes"))
            DotsAndBoxes.startDotsAndBoxes();
        if(gameName.equals("Battle Sea"))
            BattleSeaController.startBattleSea();

    }

    public void runGame(Game game) {

    }

    public void addToFavorite(Game game) {

    }
}
