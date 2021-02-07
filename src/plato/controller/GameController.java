package plato.controller;

import plato.model.DotsAndBoxes;
import plato.model.Game;
import plato.model.Player;
import plato.model.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class GameController {


    public void open(Game game) {
        Scanner sc = new Scanner(System.in);
        String start = sc.nextLine();
        if(start.equals("start dot and boxes game")) {
//            DotsAndBoxesController dab_controller = new DotsAndBoxesController(game.getGameID(), game.getGameName());
//            dab_controller.startDotsAndBoxes();
        }
        if(start.equals("start dot and boxes game")){
//            BattleSeaController bs_controller = new BattleSeaController(game.getGameID(), game.getGameName());
//            bs_controller.startBattleSea();

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
