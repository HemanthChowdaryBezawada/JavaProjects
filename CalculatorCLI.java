import java.util.*;
import java.util.Scanner;

public class CalculatorCLI{
    public static void main(String a[]){
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to CLI Calculator!!!");
        System.out.println("Enter your first element: ");
        double num1 = input.nextDouble();

        System.out.println("Enter the second number: ");
        double num2 = input.nextDouble();

        System.out.println("Choose the Operation to perform(+, -, *, /): ");
        char operator = input.next().charAt(0);

        double result;
        boolean ValidOperation = true;

        switch(operator){
            case '+':
                result = num1 + num2;
                break;

            case '-':
                result = num1 - num2;
                break;

            case '*':
                result = num1 * num2;
                break;

            case '/':
                if(num2 == 0){
                    System.out.println("Error! Cannot be divisible by 0");
                    ValidOperation = false;
                    result = 0;
                } else{
                    result = num1 / num2;
                }
                break;
            default:
                System.out.println("Invalid Operation! Please choose from +, -, * or /.");
                ValidOperation = false;
                result = 0;
        }

        if(ValidOperation){
            System.out.println("The result is: " + result);
        }

        input.close();
        System.out.println("Thanks for using the CLI Calculator!");
    }
}