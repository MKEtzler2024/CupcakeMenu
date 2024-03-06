import java.util.Scanner;
public class rockpaperscissors{
public static void main(){
  Scanner scnr = new Scanner(System.in);
  String playerMove = "";
  String aiMove = "";
  String winner = "";
  System.out.println("Welcome to Tic Tak Toe");
  System.out.println("Your moves are: Rock, Paper, Scissors, Spock");
  System.out.print("Enter your move: ");
  playerMove = scnr.next().ignoreCase();
  aiMove = aiMove();
  winner = checkWinner(playerMove, aiMove);
}
  public static String aiMove(){
    String aiMove = "";
    randomNum = Math.randomInt(0,5);
    switch randomNum{
      case 0:
        aiMove = "Lizard";
      case 1:
        aiMove = "Rock";
      case 2:
        aiMove = "Paper";
      case 3: 
        aiMove = "Scissors";
      case 4: 
        aiMove = "Spock";
    }
    return aiMove;
  }
  public static String checkWinner(String playerMove, String aiMove){
    //Rock beats scissor and lizard
    //Paper beats rock and spock
    //scissors beats paper and lizard
    //lizard beats spock and paper
    //spock beats scissors and rock
    if((playerMove=="rock")&&((aiMove =="")||(aiMove ==""))){}
    if((playerMove=="paper")&&((aiMove =="")||(aiMove ==""))){}
    if((playerMove=="scissors")&&((aiMove =="")||(aiMove ==""))){}
    if((playerMove=="lizard")&&((aiMove =="")||(aiMove ==""))){}
    if((playerMove=="spock")&&((aiMove =="")||(aiMove ==""))){}
  }
}
