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
    private int total;
    private int[] points={0,0};
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
        total=0;
        for(int ship: ships_size)
            total+=ship;
    }

    public void startBattleSea(Scanner sc){
        executeGame(sc);
    }

    public void executeGame(Scanner sc) {
        System.out.println("a new battle sea game started between "+player1.getName()+" and "+player2.getName()+"!");
        for(int turn_to_place=0; turn_to_place<2; turn_to_place++)
            place_ships(turn_to_place, sc);
        System.out.println("Use this commands:\n" +
                "boom x y\n" +
                "show boomed location\n" +
                "show score");
        while(true){
            if(turn==1)
                System.out.println("it's "+player1.getName()+" turn");
            else
                System.out.println("it's "+player2.getName()+" turn");
            String split[] = sc.nextLine().split(" ");
            if(split[0].equals("boom")){
                int x = Integer.parseInt(split[1]);
                int y = Integer.parseInt(split[2]);
                hit(x,y);
            }
            if(split[0].equals("show"))
                if(split[1].equals("boomed")) {
                    if (turn == 1)
                        show_hitmap(player_1_hit_map, player_2_field);
                    else
                        show_hitmap(player_2_hit_map, player_1_field);
                }else if(split[1].equals("score")){
                    System.out.println("------------------");
                    System.out.println("Player "+player1.getName()+" have "+points[0]+" successful hit");
                    System.out.println((total-points[0])+" remained to be hit");
                    System.out.println("------------------");
                    System.out.println("Player "+player2.getName()+" have "+points[1]+" successful hit");
                    System.out.println((total-points[1])+" remained to be hit");
                    System.out.println("------------------");
                }
            if(check_win())
                return;
        }

    }

    private boolean check_win(){
        if(points[0] == total){
            player1.player_wins++;
            player2.player_loses++;
            System.out.println("Player "+player1.getName()+" wins!");
            return true;
        }
        if(points[1] == total){
            player2.player_wins++;
            player1.player_loses++;
            System.out.println("Player "+player2.getName()+" wins!");
            return true;
        }
        return false;
    }

    private void hit(int x, int y){
        if(turn==1) {
            if (player_1_hit_map[x][y])
                System.out.println("you already hit that location");
            else {
                player_1_hit_map[x][y] = true;
                if (player_2_field[x][y])
                    {System.out.println("You hit!!!\nboom again!");points[0]++;}
                else
                    {System.out.println("You missed :(");turn = 2;}
                show_hitmap(player_1_hit_map, player_2_field);

            }
        }else{
            if (player_2_hit_map[x][y])
                System.out.println("you already hit that location");
            else {
                player_2_hit_map[x][y] = true;
                if (player_1_field[x][y])
                    {System.out.println("You hit!!!\nboom again!");points[1]++;}
                else
                    {System.out.println("You missed :(");turn = 1;}
                show_hitmap(player_2_hit_map, player_1_field);
            }
        }
    }

    private void place_ships(int turn_to_place, Scanner sc){
        System.out.println("Player " + (turn_to_place==0?player1.getName():player2.getName()) + " chose ships to be placed in the field");
        for (int ship : ships_size) {
            while (true) {
                System.out.println("Place the ship with size " + ship + " by entering coordinate and direction(e.g. 2 2 vertical)");
                String[] split = sc.nextLine().split(" ");
                int x = Integer.parseInt(split[0]);
                int y = Integer.parseInt(split[1]);
                boolean vertical = split[2].equals("vertical");
                if (!vertical) {
                    if (x + ship <= WIDTH && x >= 0 && y < HEIGHT && y >= 0) {
                        for (int i = 0; i < ship; i++)
                            if (turn_to_place == 0)
                                player_1_field[x + i][y] = true;
                            else
                                player_2_field[x + i][y] = true;
                        show_field(turn_to_place == 0 ? player_1_field : player_2_field);
                        break;
                    }
                }
                else
                    if (x < WIDTH && x >= 0 && y + ship <= HEIGHT && y >= 0) {
                        for (int i = 0; i < ship; i++)
                            if(turn_to_place==0)
                                player_1_field[x][y + i] = true;
                            else
                                player_2_field[x][y + i] = true;
                        show_field(turn_to_place==0?player_1_field:player_2_field);
                        break;
                    }
                System.out.println("The coordinates are outside of boundary, try again");
            }

        }
    }

    public void show_field(boolean[][] field){
        for(int height=0; height<HEIGHT; height++){
            for(int width=0; width<WIDTH; width++)
                if (field[width][height])
                    System.out.print("#");
                else
                    System.out.print("~");
            System.out.println();
        }
    }

    public void show_hitmap(boolean[][] hit, boolean[][] real_map){
        for(int height=0; height<HEIGHT; height++){
            for(int width=0; width<WIDTH; width++)
                if (hit[width][height]) {
                    if(real_map[width][height])
                        System.out.print("@");
                    else
                        System.out.print("*");
                }
                else
                    System.out.print("?");
            System.out.println();
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
