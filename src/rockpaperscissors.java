import java.util.Scanner;
import java.lang.Math;
public class rockpaperscissors{
    public static void main(String [] args){
        Scanner scnr = new Scanner(System.in);
        String playerMove;
        String aiMove;
        boolean winner = false;
        System.out.println("Welcome to Tic Tak Toe");
        System.out.println("Your moves are: Rock, Paper, Scissors, Spock");
        System.out.print("Enter your move: ");
        playerMove = scnr.next().toLowerCase();
        aiMove = aiMove();
        winner = checkWinner(playerMove, aiMove);
        if (winner == true){
            System.out.println("You won!");
        }
        else{
            System.out.println("You lost");
        }
    }
    public static String aiMove(){
        String aiMove = "";
        int randomNum = 1 + (int)(Math.random() * 5);
        System.out.println(randomNum);
        switch (randomNum){
            case 1:
                aiMove = "Lizard";
                break;
            case 2:
                aiMove = "Rock";
                break;
            case 3:
                aiMove = "Paper";
                break;
            case 4:
                aiMove = "Scissors";
                break;
            case 5:
                aiMove = "Spock";
                break;
        }
        System.out.println("Ai plays: " +aiMove);
        return aiMove.toLowerCase();
    }
    public static boolean checkWinner(String playerMove, String aiMove){
        //Rock beats scissor and lizard
        //Paper beats rock and spock
        //scissors beats paper and lizard
        //lizard beats spock and paper
        //spock beats scissors and rock
        boolean winner = false;
        if (playerMove.equals(aiMove)){
            System.out.println("You tied");
        }
        else if((playerMove.equals("rock")&&((aiMove.equals("scissors"))||(aiMove.equals("lizard"))))){
            winner =true;
        }
        else if((playerMove.equals("paper"))&&((aiMove.equals("rock"))||(aiMove.equals("spock")))){
            winner =true;
        }
        else if((playerMove.equals("scissors"))&&((aiMove.equals("paper"))||(aiMove.equals("lizard")))){
            winner =true;
        }
        else if((playerMove.equals("lizard"))&&((aiMove.equals("spock"))||(aiMove.equals("paper")))){
            winner =true;
        }
        else if((playerMove.equals("spock"))&&((aiMove.equals("scissors"))||(aiMove.equals("rock")))){
            winner =true;
        }
        else {
            winner = false;
        }
        return winner;
    }
}
