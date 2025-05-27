package program_2;
import java.util.Scanner;
public class SimpleCalculator {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("Enter operator:\nAddition - 1, Substraction - 2, Multiply - 3, Division - 4");
        int op = sc.nextInt();
        switch(op){
            case 1 : System.out.println("Addition is "+(num1+num2));
                     break;
             case 2 : System.out.println("Substraction is "+(num1-num2));
                     break;
             case 3 : System.out.println("Multiply is "+(num1*num2));
                     break;
            case 4 : System.out.println("Division is "+(num1/num2));
                     break;
            default : System.out.println("Invalid operator");
        }
    }
}
