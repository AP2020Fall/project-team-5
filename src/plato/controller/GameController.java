package plato.controller;

import plato.model.DotsAndBoxes;
import plato.model.Game;
import plato.model.Player;
import plato.model.User;

import java.util.ArrayList;
import java.util.HashMap;


public class GameController {


    public void open(Game game) {
        if(game.getGameName().equals("Dots And Boxes")) {
            DotsAndBoxesController dab_controller = new DotsAndBoxesController(game.getGameID(), game.getGameName());
            dab_controller.startDotsAndBoxes();
        }
        if(game.getGameName().equals("Battle Sea")){
            BattleSeaController bs_controller = new BattleSeaController(game.getGameID(), game.getGameName());
            bs_controller.startBattleSea();

        }
    }

    public String getScoreBoard(){
        return "socreboard!";
//        return ScoreBoard;
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
