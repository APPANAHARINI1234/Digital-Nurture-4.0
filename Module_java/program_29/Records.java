package program_29;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;
record Person(String name, int age){}
public class Records {
    //records are used to create immutable data structures
    //means when we need to create class with constant values then we can use records
    //record keyword
    //just use record classname(attributes){} thats it inside it will create constructur and all
    public static void main(String[] args) {
        List<Person>list = Arrays.asList(
            new Person("raju",12),
            new Person("rani",90)
        );
       //using streams filtering
       List<Person>child = list.stream()
                          .filter(p -> p.age()<=18)
                          .collect(Collectors.toList());
    System.out.println(child.get(0).name());
    }
}
