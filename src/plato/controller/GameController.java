package plato.controller;

import plato.model.Game;

import java.util.ArrayList;


public class GameController {

    public void open(String gameName) {
        if(gameName.equals("Dots And Boxes"))
            DotsAndBoxesController.startDotsAndBoxes();
        if(gameName.equals("Battle Sea"))
            BattleSeaController.startBattleSea();

    }

    public void runGame(Game game){
        if(game.getGameName().equals("Dots And Boxes"))
            DotsAndBoxesController.executeGame();
        if(game.getGameName().equals("Battle Sea"))
            BattleSeaController.executeGame();

    }
    ArrayList<String> favoriteGames = new ArrayList<>();

    public void addToFavorite(Game game){
        favoriteGames.add(game.getGameName());
    }
}
