package program_25;
import java.util.HashMap;
import java.util.Scanner;
public class HashMapEx {
    public static void main(String[] args) {
        HashMap<Integer,String>map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-->0){
            int id = sc.nextInt();
            String name = sc.next();
            map.put(id,name);
        }
        int key = sc.nextInt();
        //o(1) for search operation
        if(map.containsKey(key)){
            System.out.println(map.get(key));
        }
        else{
            System.out.println("not found");
        }

    }
}
