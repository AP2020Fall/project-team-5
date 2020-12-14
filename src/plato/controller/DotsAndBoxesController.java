package plato.controller;

import plato.model.DotsAndBoxes;
import plato.model.Player;

import java.util.Scanner;


public class DotsAndBoxesController extends DotsAndBoxes {
    static final int WIDTH = 8;
    static final int HEIGHT = 8;
    static final int RIGHT = 0;
    static final int BOTTOM = 1;
    boolean[][] box;
    int player1_score, player2_score;
    int turn;
    boolean[][] rightline;
    boolean[][] bottomline;

    public DotsAndBoxesController(String gameID, String gameName) {
        super(gameID, gameName);
        box = new boolean[WIDTH-1][HEIGHT-1];
        rightline = new boolean[WIDTH-1][HEIGHT];
        bottomline = new boolean[WIDTH][HEIGHT-1];
        turn = 1;
    }

    public void startDotsAndBoxes(){
        executeGame();
    }

    public void executeGame() {
        System.out.println("enter the width, height and direction example1:3 5 0   example2:4 6 1");
        Scanner sc = new Scanner(System.in);
        while(true){
            String[] split = sc.nextLine().split(" ");
            int width = Integer.parseInt(split[0]);
            int height = Integer.parseInt(split[1]);
            int direction = Integer.parseInt(split[3]);
                                                            //TODO: gets the info for drawing the line
            if(drawLine(width, height, direction)) {
                int newboxes = newBoxes();
                if(newboxes==0)
                    turn = 3 - turn;
                else{
                    if(turn==1)
                        player1_score+=newboxes;
                    if(turn==2)
                        player2_score+=newboxes;
                }
            }
            if(endgame()){
                //TODO: print who won the game
                //update the scoreboard
                break;
            }
        }

    }
    //Dots
    public void findAvailableDots(){ //check

    }
//    public void changeTurn(Player player1, Player player2){
//
//    }
//    public void notChangeTurn(Player player){
//
//
//    }
    //Line
    public boolean drawLine(int width, int height, int direction){
        // 0 for direction means right, 1 means bottom
        if(width <0 || height<0) return false;
        if(direction == RIGHT && width >= WIDTH-1) return false;
        if(direction == BOTTOM && width >= WIDTH) return false;
        if(direction == RIGHT && height >= HEIGHT) return false;
        if(direction == BOTTOM && height >= HEIGHT-1) return false;
        if(direction == BOTTOM && bottomline[width][height]) return false;
        if(direction == RIGHT && rightline[width][height]) return false;
        if(direction == BOTTOM)
            bottomline[width][height] = true;
        if(direction == RIGHT)
            rightline[width][height] = true;
        return true;
    }

    public void saveInformation(){

    }
//    public void limitOfCoordinatePlane(){
//
//    }
    public void possibilityOfDrawLine(){

    }
    public void players(Player player1, Player player2){

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



    public void gainScore(Player player){
        player.getScore();

    }

}
