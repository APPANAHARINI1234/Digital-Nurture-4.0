package Module_java.program_12;
public class MethodOverloading{
    public static int sum(int a,int b){
        return a+b;
    }
    public  static double sum(double a, double b){
          return a+b;
    }
    public static int sum(int a,int b,int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        System.out.println(sum(3.5,3));
    }
}