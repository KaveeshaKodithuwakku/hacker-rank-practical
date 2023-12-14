package StringReverse;

import java.util.Arrays;
import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();

     //   String[] array = new String[A.length()];
        String[] reverseArray = new String[A.length()];

//        for(int i=0; i<A.length();i++){
//            array[i] = ""+A.charAt(i);
//        }

        int count = 0;
        for(int j=A.length(); j >0; j--){
            reverseArray[count] = ""+A.charAt(j-1);
            count++;
        }

       // System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(reverseArray));

        String reverseWord = "";
        for(int n=0;n<reverseArray.length;n++){
           reverseWord += reverseArray[n];
        }

        System.out.println(reverseWord);
        if(A.contains(reverseWord)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
