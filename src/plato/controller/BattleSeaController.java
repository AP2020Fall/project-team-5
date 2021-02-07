package plato.controller;

import plato.model.BattleSea;
import plato.model.Player;
import plato.model.Direction;
import plato.model.Ship;

import java.util.Scanner;

public class BattleSeaController{
    static final int WIDTH = 10;
    static final int HEIGHT = 10;
    static final int[] ships_size = {2,3};
    public static int numberofplayedgame=0;
    private Player player1, player2;
    public static int turn;

    boolean[][] player_1_field, player_1_hit_map, player_2_field, player_2_hit_map;

    public BattleSeaController(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        player_1_field = new boolean[WIDTH][HEIGHT];
        player_1_hit_map = new boolean[WIDTH][HEIGHT];
        player_2_field = new boolean[WIDTH][HEIGHT];
        player_2_hit_map = new boolean[WIDTH][HEIGHT];
        turn = 1;
    }

    public void startBattleSea(Scanner sc){
        executeGame(sc);
    }

    public void executeGame(Scanner sc) {
        System.out.println("a new battle sea game started between "+player1.getName()+" and "+player2.getName()+"!");
        System.out.println("Player" + player1.getName()"+ chose ships to be placed in the field");
        for(int ship: ships_size){
//            chose
        }

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
