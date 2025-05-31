package program_28;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class StreamApi {
    //imagine like a conveyor belt where you will place them on belt and provide request like to filter or change and then collect
    // introduced in java 8
    public static void main(String[] args) {
        List<Integer>list = Arrays.asList(2,3,4,1,4,5,6);
        List<Integer>even = list.stream()
                            .filter(n -> n%2 ==0).collect(Collectors.toList());
        System.out.println(even);
        list = even.stream()
               .map(n -> n*2)
               .collect(Collectors.toList());
        System.out.println(list);
    }
}
