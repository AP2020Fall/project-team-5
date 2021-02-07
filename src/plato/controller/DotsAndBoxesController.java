package plato.controller;

import plato.model.DotsAndBoxes;
import plato.model.Player;
import plato.view.DotsAndBoxesView;

import java.util.ArrayList;
import java.util.Scanner;

public class DotsAndBoxesController{
    static final int WIDTH = 3;
    static final int HEIGHT = 3;
    static final int RIGHT = 0;
    static final int BOTTOM = 1;
    public static int numberofplayedgame=0;
    public static int turn;
    boolean[][] box;

    boolean[][] rightline;
    boolean[][] bottomline;
    private Player player1, player2;
    private Scanner sc;


    public DotsAndBoxesController(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        box = new boolean[WIDTH-1][HEIGHT-1];
        rightline = new boolean[WIDTH-1][HEIGHT];
        bottomline = new boolean[WIDTH][HEIGHT-1];
        turn = 1;
    }

    public void startDotsAndBoxes(Scanner sc){
        executeGame(sc);
    }

    public void executeGame(Scanner sc) {

        System.out.println("a new dots and lines game started between "+player1.getName()+" and "+player2.getName()+"!\nrun of one these commands:\n" +
                "draw line between (x,y) and (x,y)\n" +
                "end my turn\n" +
                "show available lines\n" +
                "show table");
        //draw line between (x,y) and (x,y)
        boolean didmove = false;
        while(true){
            if(turn==1)
                System.out.println("it's "+player1.getName()+" turn");
            else
                System.out.println("it's "+player2.getName()+" turn");
            String[] split = sc.nextLine().split(" ");
            if(split[0].equals("draw")) {
//                if(didmove){
//                    System.out.println("you already made a move, end your turn please.");
//                    continue;
//                }

                String x1_y1 = split[3].substring(1,split[3].length()-1);
                String x2_y2 = split[5].substring(1,split[5].length()-1);
                String[] x1y1 = x1_y1.split(",");
                String[] x2y2 = x2_y2.split(",");
                int x1 = Integer.parseInt(x1y1[0]);
                int y1 = Integer.parseInt(x1y1[1]);
                int x2 = Integer.parseInt(x2y2[0]);
                int y2 = Integer.parseInt(x2y2[1]);
                if(drawLine(x1,y1,x2,y2)){
                    didmove=true;
                }else{
                    System.out.println("you cannot draw a line between those two points");
                }
            }
            if(split[0].equals("end")){
                if(didmove){
                    turn = 3 - turn;
                    didmove=false;
                }else{
                    System.out.println("you have not made a move");
                }

            }
            if(split[0].equals("show"))
                if(split[1].equals("available"))
                    availableLines();
                else if(split[1].equals("table"))
                    showTable();
            if(endgame()){
                //TODO: print who won the game
                if(Player.player1_score > Player.player2_score)
                    Player.player1_wins++;
                if(Player.player2_score > Player.player1_score)
                    Player.player2_wins++;
                if(Player.player1_score == Player.player2_score)
                    Player.numberofequal++;

                //update the scoreboard
                break;
            }
            numberofplayedgame++;

        }

    }

    public void scoreBoard(){
        System.out.println();
    }


    //Dots
    public void findAvailableDots(){ //check

    }

    //Line
    public boolean drawLine(int x1, int y1, int x2, int y2){
        if(x1 <0 || x2<0 || y1<0 || y2<0) return false;
        if(x1>=WIDTH || x2>=WIDTH || y1>=HEIGHT || y2>=HEIGHT) return false;
        if(x2<x1){int swap=x1; x1=x2; x2=swap;}
        if(y2<y1){int swap=y1; y1=y2; y2=swap;}
        if(x1==x2 && y2==y1+1 && !bottomline[x1][y1]) {
            bottomline[x1][y1] = true;
            return true;
        }
        else if (y1==y2 && x2==x1+1 && !rightline[x1][y1]) {
            rightline[x1][y1] = true;
            return true;
        }
        return false;
    }




    public void saveInformation(){

    }

    public void availableLines(){

    }
    public void showTable(){
        for (int height = 0; height < HEIGHT; height++) {
            for(int width=0; width<WIDTH-1; width++) {
                System.out.print(".");
                if (rightline[width][height])
                    System.out.print("_");
                else
                    System.out.print(" ");
            }
            System.out.println(".");
            if(height!=HEIGHT-1) {
                for(int width=0; width<WIDTH-1; width++) {
                    if (bottomline[width][height])
                        System.out.print("| ");
                    else
                        System.out.print("  ");
                }
                System.out.println();
            }
        }
    }
    ArrayList<Player> players = new ArrayList<>();
    public ArrayList<Player> players(Player player1, Player player2){
        players.add(player1);
        players.add(player2);
        return players;
    }
    public void timeToDrawLine(){

    }
    public int newBoxes(){
        int newboxes = 0;
        for(int width=0; width<WIDTH-1; width++)
            for(int height=0; height<HEIGHT-1; height++)
                if( box[width][height] == false &&
                    rightline[width][height] && rightline[width][height+1] &&
                    bottomline[width][height] && bottomline[width+1][height]) {
                    box[width][height] = true;
                    newboxes++;
                }
        return newboxes;
    }
    public boolean endgame(){
        for(int width=0; width<WIDTH-1; width++)
            for(int height=0; height<HEIGHT; height++)
                if(rightline[width][height]==false)
                    return false;
        for(int width=0; width<WIDTH; width++)
            for(int height=0; height<HEIGHT-1; height++)
                if(bottomline[width][height]==false)
                    return false;
        return true;
    }

}
