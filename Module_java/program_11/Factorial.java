package program_11;
import java.util.Scanner;

public class Factorial {
    public static int findFactorial(int n){
        int fact = 1;
        while(n -- > 1){
            fact*=n;
        }
        return fact;
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println(findFactorial(n));   
    }
}
