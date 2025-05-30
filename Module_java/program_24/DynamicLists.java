package program_24;
import java.util.ArrayList;
import java.util.Scanner;
public class DynamicLists {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String>names = new ArrayList<>();
        int n = sc.nextInt();
         for(int i=0;i<n;i++){
            names.add(sc.next());
         }
         System.out.println(names);
    }
}
