package plato.controller;

import plato.model.BattleSea;
import plato.model.Player;
import plato.model.Direction;
import plato.model.Ship;

public class BattleSeaController{
    public static int numberofplayedgame=0;

    public BattleSeaController(Player player1, Player player2) {

    }

    static public void startBattleSea(){

    }

    public static void executeGame() {
    }

    public void assignRandomCoordinates(Player player, Ship ship, int xPosition, int yPosition) {

    }

    public void changeShipCoordinates(Player player, Ship ship, int xPosition, int yPosition) {

    }

    public void setDirection(Direction direction){
        //vertical or horizontal
    }

    public void changeCoordinateState(int xPosition, int yPosition){
        //boomed or unboomed
    }

    public void boom(int xPosition, int yPosition){

    }

    public boolean isAvailableForAttack (int xPosition, int yPosition){
        return false;
    }

    public boolean isAbleToAttack (Player player){
        return false;
        //if attack was successful, attack again
    }
}
