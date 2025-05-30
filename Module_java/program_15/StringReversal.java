package program_15;

import java.util.Scanner;

public class StringReversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        StringBuilder rStr = new StringBuilder();
        rStr.append(str);
        int i = 0;
        while(i<=str.length()/2){
            char temp=rStr.charAt(i);
            rStr.setCharAt(i, rStr.charAt(str.length()-1-i));
            rStr.setCharAt(str.length()-i-1, temp);
            i++;
        }
        System.out.println(rStr);
    }
}
