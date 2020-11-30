package plato.controller;

import people.model.Player;
import plato.model.BattleSeaModel;

public class BattleSeaController {
    static public void startBattleSea(){

    }
    public void assignRandomCoordinates(Player player, BattleSeaModel.Ship ship, int xPosition, int yPosition) {

    }

    public void changeShipCoordinates(Player player, BattleSeaModel.Ship ship, int xPosition, int yPosition) {

    }

    public void setDirection(BattleSeaModel.Direction direction){
        //vertical or horizontal
    }

    public void changeCoordinateState(int xPosition, int yPosition){

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
