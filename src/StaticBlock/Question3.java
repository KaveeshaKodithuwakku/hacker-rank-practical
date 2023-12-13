package StaticBlock;

import java.util.Scanner;

public class Question3 {
    static boolean flag;
    static int B,H;

    static{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the breadth : ");
        B = scanner.nextInt();
        System.out.println("Enter the height : ");
        H = scanner.nextInt();

        checkValidity(B,H);

    }

    public static void checkValidity(int b, int h){
        if(b > 0 && h > 0){
            flag = true;
        }else{
            flag = false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }

    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }

    }

}
