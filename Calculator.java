import java.util.Scanner;

public class Calculator {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      double num1, num2, result;
      char operator;

      System.out.println("Enter first number:");
      num1 = input.nextDouble();

      System.out.println("Enter second number:");
      num2 = input.nextDouble();

      System.out.println("Enter an operator (+, -, *, /, ^):");
      operator = input.next().charAt(0);

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
            return;
      }

      System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
   }
}
