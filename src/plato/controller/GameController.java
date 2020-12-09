package plato.controller;

import plato.model.Game;
import plato.model.Player;
import plato.model.User;

import java.util.ArrayList;
import java.util.HashMap;


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

    HashMap<User, Integer> scoreList = new HashMap<>();
    public void setScore(User userID, int score){
        scoreList.put(User.getUserID(userID),score);
    }
}
