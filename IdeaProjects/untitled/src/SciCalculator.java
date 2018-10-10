import java.util.Scanner;
public class SciCalculator
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        //This section of the code will create and initialize all the variables needed.
        double x;
        double y;
        double result = 0.0;
        double total = 0.0;
        double average;
        int choice;
        int numCalc = 0;
        boolean menu = true;

        //The whole calculator will be contained within an infinite loop.
        while (true)
        {
            //Making the menu.
            if (menu == true) {
                System.out.println("Current Result: " + result);
                System.out.println();
                System.out.println("Calculator Menu ");
                System.out.println("--------------- ");
                System.out.println("0. Exit Program");
                System.out.println("1. Addition ");
                System.out.println("2. Subtraction ");
                System.out.println("3. Multiplication ");
                System.out.println("4. Division ");
                System.out.println("5. Exponentiation ");
                System.out.println("6. Logarithm ");
                System.out.println("7. Display Average ");
            }
            System.out.println();
            System.out.print("Enter Menu Selection: ");

            choice = in.nextInt();

            //Making an exit option
            if (choice == 0)
            {
                System.out.println();
                System.out.println("Thanks for using this calculator. Goodbye!");
                break;
            }
            else if ((choice == 7) && (numCalc == 0)) {
                System.out.println();
                System.out.println("Error: No calculations yet to average!");
                menu = false;
                continue;
            }

            //Taking input.
            if ((choice >= 0) && (choice <= 6)) {
                System.out.print("Enter first operand: ");
                x = in.nextDouble();
                System.out.print("Enter second operand: ");
                y = in.nextDouble();
            }
            else {
                x=0;
                y=0;
            }
            menu = true;

            //Calculating result
            if (choice == 1) {
                result = x + y;
            }
            else if (choice == 2) {
                result = x - y;
            }
            else if (choice == 3) {
                result = x * y;
            }
            else if (choice == 4) {
                result = x / y;
            }
            else if (choice == 5) {
                result = Math.pow(x, y);
            }
            else if (choice == 6) {
                result = (Math.log(y)) / (Math.log(x));
            }
            else if (choice == 7) {
                System.out.println("Sum of calculations: " + total);
                System.out.println("Number of calculations: " + numCalc);
                average = total / numCalc;
                average = average * 100;
                int av = (int) average;
                average = (double) av;
                average = average / 100;
                System.out.println("Average of calculations: " + average);
                menu = false;
                continue;
            }
            else if ((choice > 7) || (choice < 0)) {
                System.out.println("Error: Invalid selection!");
                menu = false;
                continue;
            }

            //Setting total and numCalc
            total = total + result;
            numCalc++;

        }

    }
}