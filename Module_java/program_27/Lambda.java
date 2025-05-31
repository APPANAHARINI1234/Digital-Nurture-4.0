package program_27;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;
public class Lambda {
    public static void main(String[] args) {
        // for integers you can use a-b if based on first elemnet in arrays of arrays take a[0]-b[0] and for reverse use b[0]-a[0]
        List<String>list = Arrays.asList("wddw","iwoeoi","njjdwjn","a");
        //Collections.sort(list,(a,b)->(a.compareTo(b)));
        //sort by length
        Collections.sort(list,(a,b)->(a.length()-b.length()));
        System.out.println(list);
    }
}
