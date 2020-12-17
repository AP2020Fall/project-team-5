package plato.view;

import plato.controller.BattleSeaController;
import plato.controller.DotsAndBoxesController;
import plato.model.Game;
import plato.model.GameLog;
import plato.model.Player;

public class GameView {

    public void showScoreboard(Game game) {
        System.out.println();

    }

    public void details(Game game) {
        if (game.getGameName().equals("Dots And Boxes"))
            System.out.println("Take more boxes than your opponent." +
                    " You move by connecting two dots with a line." +
                    " When you place the last 'wall' of a single square (box), the box is yours." +
                    " The players move in turn, but whenever a player takes a box (s)he must move again.");
        if (game.getGameName().equals("Battle Sea"))
            System.out.println("Battle Sea is a strategy type guessing game for two players." +
                    " It is played on ruled grids on which each player's fleet of ships  are marked." +
                    " The locations of the fleets are concealed from the other player." +
                    " Players alternate turns calling shots at the other player's ships," +
                    " and the objective of the game is to destroy the opposing player's fleet.");
    }

    public void showLog(GameLog game) {
        System.out.println("Number Of Playing:" + game.getNumberOfPlaying());
        System.out.println("Number Of Wins:" + game.getNumberOfWins());
        System.out.println("Log ID:" + game.getLogID());
        System.out.println("Game Score:" + game.getGameScore());
    }

    public void showWinsCount(Game game) {
        if(game.getGameName().equals("Dots And Boxes"))
            System.out.println(Player.player1_wins + Player.player2_wins);
        if(game.getGameName().equals("Battle Sea")){
            //TODO: for Battle sea do the same way.
            }
    }

    public void showPlayedCount(Game game) {
        if(game.getGameName().equals("Dots And Boxes"))
            System.out.println(DotsAndBoxesController.numberofplayedgame);
        if (game.getGameName().equals("Battle Sea"))
            System.out.println(BattleSeaController.numberofplayedgame);

    }

    public String showPoints(Game game) {
        return null;
    }
}
