import java.util.*;

public class Example4
{
   public static void main(String[] args)
   {

      Scanner in = new Scanner(System.in);
      String inputLine = in.nextLine();
      String[] expressions = inputLine.split("\\s+");

      for (String expression : expressions) {
         double leftOperand, result, rightOperand;
         String leftString, operator, rightString;
         StringTokenizer tokenizer;

         tokenizer = new StringTokenizer(expression, "+-*/", true);

         try {
            leftString = tokenizer.nextToken();
            operator = tokenizer.nextToken();
            rightString = tokenizer.nextToken();

            try {
               leftOperand = Double.parseDouble(leftString);
            } catch(NumberFormatException nfe) {
               System.out.println("Invalid number: " + leftString + " in expression: " + expression);
               continue;
            }
            try {
               rightOperand = Double.parseDouble(rightString);
            } catch(NumberFormatException nfe) {
               System.out.println("Invalid number: " + rightString + " in expression: " + expression);
               continue;
            }

            switch (operator) {
               case "+":
                  result = leftOperand + rightOperand;
                  break;
               case "-":
                  result = leftOperand - rightOperand;
                  break;
               case "*":
                  result = leftOperand * rightOperand;
                  break;
               case "/":
                  if (rightOperand == 0) {
                     System.out.println("Division by zero is not allowed");
                     continue;
                  }
                  result = leftOperand / rightOperand;
                  break;
               default:
                  System.out.println("Unknown operator");
                  continue;
            }

            System.out.println("Result: " + result);
         } catch (NoSuchElementException nsee) {
            System.out.println("Invalid syntax");
         } catch (NumberFormatException nfe) {
            System.out.println("One or more operands is not a number");
         }
      }
   }
}
