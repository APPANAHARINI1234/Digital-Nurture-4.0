package program_21;

import java.util.Scanner;
class InvalidAgeException extends Exception{
    InvalidAgeException(String message){
        super(message);
    }
}
public class CustomException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        try{
            if(age < 18){
                throw new InvalidAgeException("Age is less than 18");
            }
            else{
                System.out.println("Eligible to vote");
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
