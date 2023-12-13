package EndOfFile;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        while(scanner.hasNextLine()){
            String input = scanner.nextLine();
            System.out.println(count + " " + input);
            count++;
        }
    }
}
