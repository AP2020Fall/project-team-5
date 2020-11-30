package plato.controller;

import plato.model.Game;


public class GameController {

    public void open(String gameName) {
        if(gameName.equals("Dots And Boxes"))
            DotsAndBoxesController.startDotsAndBoxes();
        if(gameName.equals("Battle Sea"))
            BattleSeaController.startBattleSea();

    }

    public void runGame(Game game) {

    }

    public void addToFavorite(Game game) {

    }
}
