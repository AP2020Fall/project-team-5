package plato.controller;

import plato.model.DotsAndBoxes;
import plato.model.Player;
import plato.view.DotsAndBoxesView;

import java.util.Scanner;


public class DotsAndBoxesController extends DotsAndBoxes {
    static final int WIDTH = 8;
    static final int HEIGHT = 8;
    static final int RIGHT = 0;
    static final int BOTTOM = 1;
    public static int numberofplayedgame=0;
    boolean[][] box;
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
        Scanner sc = new Scanner(System.in);
        //draw line between (x,y) and (x,y)
        while(true){
            String[] split = sc.nextLine().split(" ");
            String x1_y1 = split[4];
            String x2_y2 = split[6];
            String[] x1y1 = x1_y1.split("");
            String[] x2y2 = x2_y2.split("");
            int x1 = Integer.parseInt(x1y1[1]);
            int y1 = Integer.parseInt(x1y1[3]);
            int x2 = Integer.parseInt(x2y2[1]);
            int y2 = Integer.parseInt(x2y2[3]);

            int width;
            int height;
            int direction;

            if(x1 == x2 + 1 && y1==y2){width = x2; height = y2; direction = 0;}
            else if(x2 == x1 + 1 && y1==y2){width = x1; height = y1; direction = 0;}
            else if(x1 == x2 && y1 == y2 + 1){width = x2; height = y2; direction = 1;}
            else if(x1 == x2 && y2 == y1 + 1){width = x1; height = y1; direction = 1;}
            else{ System.out.println("you can’t draw line between these two dots");break;}


            if(drawLine(width, height, direction)) {
                int newboxes = newBoxes();
                if(newboxes==0)
                    turn = 3 - turn;
                else{
                    if(turn==1)
                        Player.player1_score+=newboxes;
                    if(turn==2)
                        Player.player2_score+=newboxes;
                }
            }
            if(endgame()){
                //TODO: print who won the game
                if(Player.player1_score > Player.player2_score)


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

    public void availableLines(){

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

}
