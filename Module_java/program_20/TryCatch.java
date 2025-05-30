package program_20;
class CustomException extends Exception{
    CustomException(String message){
        super(message);
    }
}
public class TryCatch {
    public static void main(String[] args) {
        // try{
        //     System.out.println(10/0);
        // }
        // catch(ArithmeticException e){
        //       System.out.println(e);
        // }
        // there are two exceptions 1. checked and 2. unchecked
        //checked is for syntax and unchecked is for run time errors
        // extends either Exception class or RuntimeException

         try{
            throw new CustomException("custom exception");
         }
         catch(CustomException e){
            System.out.println(e.getMessage());
         }
         catch(Exception e){
            e.printStackTrace();
         }
         

    }
}
