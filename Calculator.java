import java.util.Scanner;

public class Calculator {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      double num1, num2, result;
      char operator;

      while (true) {
         System.out.println("Enter first number or 'q' to quit:");
         String inputStr = input.next();

         if (inputStr.equalsIgnoreCase("q")) {
            System.out.println("Goodbye!");
            break;
         }

         num1 = Double.parseDouble(inputStr);

         System.out.println("Enter second number:");
         num2 = input.nextDouble();

         System.out.println("Enter an operator (+, -, *, /, ^) or 'q' to quit:");
         operator = input.next().charAt(0);

         if (operator == 'q') {
            System.out.println("Goodbye!");
            break;
         }

         switch(operator) {
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
               result = num1 / num2;
               break;

            case '^':
               result = Math.pow(num1, num2);
               break;

            default:
               System.out.println("Invalid operator");
               continue;
         }

         System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
      }
   }
}
