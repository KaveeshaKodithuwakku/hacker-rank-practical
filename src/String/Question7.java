package String;

import java.util.Locale;
import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */

        int totalLength = A.length() + B.length();
        System.out.println(totalLength);

        char a = A.charAt(0);
        char b = B.charAt(0);
        if(a <= b){
            System.out.println("No");
        }else {
            System.out.println("Yes");
        }

        System.out.println(A.substring(0,1).toUpperCase() + A.substring(1).toLowerCase() + " " + B.substring(0,1).toUpperCase() + B.substring(1).toLowerCase());
    }
}
