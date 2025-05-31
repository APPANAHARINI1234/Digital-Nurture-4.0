package program_30;

public class PatternMatching {
    public static void printType(Object obj){
        switch(obj){
            case String s: System.out.println("string"); break;
            case Integer i : System.out.println("It's an integer"); break;
            case Double d : System.out.println("It's a double "); break;
            case Float f : System.out.println("It is float"); break;
             default : System.out.println("other");
        }
    }
    //implemented in java 21
    public static void main(String[] args) {
        printType("name");
        printType(2.45);
    }
}

