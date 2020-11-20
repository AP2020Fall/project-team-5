package plato.battleSea;

import plato.Game;
import people.Player;

public class BattleSea extends Game {
    public BattleSea(String gameID, String gameName) {
        super(gameID, gameName);
    }

    static public void startBattleSea(){

    }

    public void assignRandomCoordinates(Player player, Ship ship, int xPosition, int yPosition) {

    }

    public void changeShipCoordinates(Player player, Ship ship, int xPosition, int yPosition) {

    }

    public void setDirection(Direction direction){
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

    public void showShips(Player player){

    }

    public void showBooms(Player player){

    }

    public void showCorrectBooms(Player player){

    }

    public void showIncorrectBooms(Player player){

    }

    public  void showBoomedShips(Player player){

    }

    public void showUnboomedShips(Player player){

    }

    public void showCoordinatePlane(Player player){

    }
}
