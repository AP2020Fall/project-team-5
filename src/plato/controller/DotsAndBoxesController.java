package plato.controller;

import plato.model.DotsAndBoxes;
import plato.model.Player;


public class DotsAndBoxesController extends DotsAndBoxes {

    public DotsAndBoxesController(String gameID, String gameName) {
        super(gameID, gameName);
    }

    static public void startDotsAndBoxes(){
        executeGame();
    }

    public static void executeGame() {

    }
    //Dots
    public void findAvailableDots(){ //check

    }
    public void changeTurn(Player player1, Player player2){

    }
    public void notChangeTurn(Player player){

    }
    //Line
    public void drawLine(Player player){

    }

    public void saveInformation(){

    }
    public void limitOfCoordinatePlane(){

    }
    public void possibilityOfDrawLine(){

    }
    public void players(Player player1, Player player2){

    }
    public void timeToDrawLine(){

    }
    public void makeBox(Player player){

    }

    public void gainScore(Player player){
        player.getScore();

    }

}
