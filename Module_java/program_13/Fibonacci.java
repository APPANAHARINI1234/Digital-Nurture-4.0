package program_13;

import java.util.Scanner;

public class Fibonacci {
    public static int findNthFib(int n){
        if(n<=2)
          return 1;
        int a = 1;
        int b = 1;
        int i = 2;
        while(i<n){
            int c = a+b;
            a = b;
            b = c;
            i++;
        }
        return b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(findNthFib(n));
    }
}
