package CurrencyConvert;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double payment = scanner.nextDouble();
            scanner.close();

            // Write your code here.
             NumberFormat numberFormat = NumberFormat.getCurrencyInstance(Locale.US);
            String us = numberFormat.format(payment);

            NumberFormat numberFormat1 = NumberFormat.getCurrencyInstance(new Locale("en","in"));
            String india = numberFormat1.format(payment);

        NumberFormat numberFormat2 = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = numberFormat2.format(payment);

        NumberFormat numberFormat3 = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = numberFormat3.format(payment);

            System.out.println("US: " + us);
            System.out.println("India: " + india);
            System.out.println("China: " + china);
            System.out.println("France: " + france);
        }
}
