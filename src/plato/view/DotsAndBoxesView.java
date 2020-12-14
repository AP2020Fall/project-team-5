package plato.view;

import plato.controller.DotsAndBoxesController;
import plato.model.Player;


public class DotsAndBoxesView extends GameView {



    public void showWhoseTurn(Player player1, Player player2){

    }
    public void showTable(){

    }
    //Dots
    public void showAvailableLines(){


    }
    //Line
    public void showDrawnLines(){

    }
    public static void showGameResult(Player player1, Player player2){
        System.out.println(player1 + "score is" + DotsAndBoxesController.player1_score);
        System.out.println(player2 + "score is" + DotsAndBoxesController.player2_score);
        if(DotsAndBoxesController.player1_score > DotsAndBoxesController.player2_score)
            System.out.println(player1 + "won");
        else if(DotsAndBoxesController.player2_score > DotsAndBoxesController.player1_score)
            System.out.println(player2 + "won");
        else
            System.out.println("equal");
    }
    public static void showScore(){

    }
}
