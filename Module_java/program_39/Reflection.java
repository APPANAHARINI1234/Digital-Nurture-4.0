package program_39;
import java.lang.reflect.Method;

public class Reflection {
    public static void main(String[] args) throws Exception {
       Class<?>cls = Class.forName("program_39.MyClass");
       Object obj = cls.getDeclaredConstructor().newInstance();
       Method[]methods = cls.getDeclaredMethods();
       for(Method method : methods){
         System.out.println(method.getName());
         if(method.getName().equals("greet")){
            method.invoke(obj, "ram");
         }
         else{
            method.invoke(obj);
         }
       }
    }
}
