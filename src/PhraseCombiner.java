import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String output = "";
        boolean repeat = true;
        String repeatAnswer = "";
        System.out.println("Enter you first phrase: ");
        output = scnr.nextLine();
        while(repeat == true){
            System.out.print("add another phrase: ");
            output += " " + scnr.nextLine();
            System.out.print("Would you like to add another line? ");
            repeatAnswer = scnr.nextLine();
            if((repeatAnswer.equalsIgnoreCase("yes"))|| (repeatAnswer.equalsIgnoreCase("y"))){
                repeat = true;
            }
            else{
                repeat = false;
                System.out.println(output);
            }
        }




    }
}
