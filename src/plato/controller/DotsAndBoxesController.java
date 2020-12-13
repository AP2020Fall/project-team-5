package plato.controller;

import plato.model.DotsAndBoxes;
import plato.model.Player;


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

    public static void startDotsAndBoxes(){
        executeGame();
    }

    public static void executeGame() {
        while(true){

        }

    }
    //Dots
    public void findAvailableDots(){ //check

    }
    public void changeTurn(Player player1, Player player2){

    }
    public void notChangeTurn(Player player){


    }
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
    public void limitOfCoordinatePlane(){

    }
    public void possibilityOfDrawLine(){

    }
    public void players(Player player1, Player player2){

    }
    public void timeToDrawLine(){

    }
    public void makeBox(){


    }

    public void gainScore(Player player){
        player.getScore();

    }

}
