import java.util.Scanner;

@java.lang.FunctionalInterface
interface Calculator {
    double calculate(double num1, double num2);
}


class FunctionalInterface{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int choice =0;
       while(choice!=5) {
           System.out.println("Enter 1 for Addition ");
           System.out.println("Enter 2 for substraction");
           System.out.println("Enter 3 for multiplication");
           System.out.println("Enter 4 for the Division");
           choice = scanner.nextInt();
           switch (choice)
           {
               case 1:
                   Calculator addition = ((num1, num2) -> num1 + num2);
                   System.out.println("Addition num1 and num2 is " + addition.calculate(3, 4));
                   break;
               case 2:
                   Calculator sub = ((num1, num2) -> num1 - num2);
                   System.out.println("Substraction  num1 and num2 is " + sub.calculate(3, 4));
               case 3:
                   Calculator mul = ((num1, num2) -> num1 * num2);
                   System.out.println("Multiplication of  num1 and num2 is " + mul.calculate(3, 4));
               case 4:
                   Calculator division = ((num1, num2) -> {
                       if (num2 == 0) {
                           System.out.println("can not divide");
                           return Double.NaN;
                       } else {
                           return num1 / num2;
                       }
                   });

                   System.out.println("Division of  num1 and num2 is " + division.calculate(3, 4));
               default:
                   System.out.println("Entered choice is incorrect ");

       }
       }


    }


}