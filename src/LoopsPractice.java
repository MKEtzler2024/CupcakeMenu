import java.util.Scanner;
public class LoopsPractice {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int numCakes=4;
        int selection=0;
        int currentCupcake=1;
        String pack= "";

        System.out.println("Welcome to Patty's Cakes!");
        System.out.println("");
        System.out.print("How many cupcakes would you like, 4 or 6? ");
        numCakes = scnr.nextInt();

        while((numCakes != 4)&&(numCakes !=6)){
            System.out.println("Invalid selection, please try again.");
            System.out.print("How many cupcakes would you like, 4 or 6? ");
            numCakes = scnr.nextInt();

        }

        System.out.println("Great! Let's start filling your " + numCakes + "-pack.");
        System.out.println("");
        System.out.println("Cupcake Menu:");
        System.out.println("1. Vanilla Delight:  $2.50");
        System.out.println("2. Chocolate Dream:  $3.00");
        System.out.println("3. Strawberry Bliss: $2.75");
        System.out.println("4. Caramel Drizzle:  $3.50");


        double salesCost =0;

        for(int i=0; i<numCakes; i++) {
            System.out.print("Select cupcake #" + currentCupcake + ": ");
            selection = scnr.nextInt();
            while (((selection < 1) || (selection > 4))) {
                if ((selection < 1) || (selection > 4)) {
                    System.out.println("Invalid selection, please try again.");
                    System.out.print("Select cupcake #" + currentCupcake + ": ");
                    selection = scnr.nextInt();
                }
                else{
                    System.out.print("Select cupcake #" + currentCupcake + ": ");
                    selection = scnr.nextInt();
                }
            }
            switch (selection){
                case 1:
                    salesCost += 2.50;
                    pack += "   - Vanilla Delight\n";
                    break;
                case 2:
                    salesCost += 3.00;
                    pack += "   - Chocolate Dream\n";
                    break;
                case 3:
                    salesCost += 2.75;
                    pack += "   - Strawberry Bliss\n";
                    break;
                case 4:
                    salesCost += 3.50;
                    pack += "   - Caramel Drizzle\n";
                    break;

            }
            currentCupcake +=1;
        }
        double tax = salesCost*0.08;
        double totalwithtax = salesCost + tax;

        System.out.println("");
        System.out.println("Here are the cupcakes in your pack:");
        System.out.println(pack);
        System.out.println("Sales Total:      $" + salesCost);
        System.out.printf("8%% Sales Tax:     $%.2f\n", tax);
        System.out.println("Total:            $" + totalwithtax);
        System.out.println("");
        System.out.println("Thank you for ordering from Patty's Cakes!");


        }

        }

