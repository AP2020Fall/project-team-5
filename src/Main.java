import java.util.ArrayList;
import java.util.Scanner;

import plato.controller.BattleSeaController;
import plato.controller.DotsAndBoxesController;
import plato.model.BattleSea;
import plato.model.Player;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.println("\nenter number for one of this commands:\n" +
                    "1.Mange users\n" +
                    "2.Start a game\n" +
                    "3.Quit");
            String nextline = input.nextLine();
            if(nextline.equals("1")){
               manageUsers(input);
            }else if (nextline.equals("2")){
                if(Player.getPlayers().size()>1)
                    startGame(input);
                else
                    System.out.println("Not enough players, please create at least two users");
            }else if(nextline.equals("3")){
                return;
            }else{
                System.out.println("Not a valid command number");
            }
        }
    }

    public static void manageUsers(Scanner input){
        while(true) {
            System.out.println("\nenter number for one of this commands:\n" +
                    "1.create a new user\n" +
                    "2.delete a user\n" +
                    "3.list all users\n" +
                    "4.back to main menu");
            String nextline = input.nextLine();
            if (nextline.equals("1")){
                System.out.println("enter the user's name");
                nextline = input.nextLine();
                Player player = new Player(nextline);
            }else if(nextline.equals("2")){
                System.out.println("Chose a user to delete");
                ArrayList<Player> players = Player.getPlayers();
                for(int i=0; i<players.size(); i++)
                    System.out.println((i+1)+"."+players.get(i).getName());
                nextline = input.nextLine();
                int index = Integer.parseInt(nextline);
                if(index>players.size())
                    System.out.println("index out of bound");
                else{
                    Player.remove(players.get(index-1));
                }
            }else if(nextline.equals("3")){
                System.out.println("All users:");
                ArrayList<Player> players = Player.getPlayers();
                for(int i=0; i<players.size(); i++)
                    System.out.println((i+1)+"."+players.get(i).getName());
            }else if(nextline.equals("4"))
                return;

        }
    }
    public static void startGame(Scanner input){
        System.out.println("chose a user for player 1");
        Player player1;
        while(true){
            ArrayList<Player> players = Player.getPlayers();
            for(int i=0; i<players.size(); i++)
                System.out.println((i+1)+"."+players.get(i).getName());
            String nextline = input.nextLine();
            int index = Integer.parseInt(nextline);
            if(index>players.size())
                System.out.println("index out of bound");
            else{
                player1 = players.get(index-1);
                break;
            }
        }
        System.out.println("chose a user for player 2");
        Player player2;
        while(true){
            ArrayList<Player> players = Player.getPlayers();
            for(int i=0; i<players.size(); i++)
                System.out.println((i+1)+"."+players.get(i).getName());
            String nextline = input.nextLine();
            int index = Integer.parseInt(nextline);
            if(index>players.size())
                System.out.println("index out of bound");
            else{
                player2 = players.get(index-1);
                break;
            }
        }

        while(true) {
            System.out.println("enter number for the game:\n" +
                    "1.Dots and Boxes\n" +
                    "2.Battle Sea");
                    String nextline = input.nextLine();
            if (nextline.equals("1")){
                DotsAndBoxesController controller = new DotsAndBoxesController(player1, player2);
                controller.startDotsAndBoxes(input);
//                 Gameview UI = new Gameview();
//                 UI.start(new PrimaryStage(), controller);
                return;
            }else if(nextline.equals("2")){
                BattleSeaController controller = new BattleSeaController(player1, player2);
                controller.startBattleSea(input);
                return;
            }


        }
    }
}

