package program_4;
import java.util.Scanner;
class LeapyearChecker{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if(year%4 == 0){
            if(year%100 == 0){
                if(year%400 == 0){
                    System.out.println("leap");
                }
                else
                System.out.println("not leap");
            }
            else{
                System.out.println("leap");
            }
        }
        else
          System.out.println("no leap");
    }
}