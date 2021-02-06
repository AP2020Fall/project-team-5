package plato.view;

import plato.controller.DotsAndBoxesController;
import plato.model.Player;


public class DotsAndBoxesView extends GameView {



    public void showWhoseTurn(Player player1, Player player2){
        if(DotsAndBoxesController.turn == 1 )
            System.out.println("It's" + player1 + "Turn");
        if (DotsAndBoxesController.turn == 2)
            System.out.println("It's" + player2 + "Turn");

    }
    public void showTable(){

    }


    public void showDrawnLines(){

    }
    public static void showGameResult(Player player1, Player player2){
        System.out.println(player1 + "score is" + Player.player1_score);
        System.out.println(player2 + "score is" + Player.player2_score);
        if(Player.player1_score > Player.player2_score)
            System.out.println(player1 + "won");
        else if(Player.player2_score > Player.player1_score)
            System.out.println(player2 + "won");
        else
            System.out.println("equal");
    }
    public static void showScorePlayer1(Player player1){
        System.out.println(Player.getScorePlayer1(player1));
    }
    public static void showScorePlayer2(Player player2){
        System.out.println(Player.getScorePlayer2(player2));
    }
}
