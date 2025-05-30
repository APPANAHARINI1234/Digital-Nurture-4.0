package program_10;
import java.util.*;
public class RandomNumber {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int guess =(int)(Math.random()*10);
        while((a = sc.nextInt()) != guess){
             if(a > guess){
                System.out.println("low value");
             }
             else{
                System.out.println("high");
             }
        }
        System.out.println("win");
        //if within a range random then (Math.random()*max)+min 
    }
}
