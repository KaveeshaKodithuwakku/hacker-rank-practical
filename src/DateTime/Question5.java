package DateTime;

import java.io.*;
import java.util.Calendar;
import java.util.Date;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month -1, day);
        int dayOfWeek;
        dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);



        String dayName = "";

        switch(dayOfWeek){
            case 1: dayName ="SUNDAY";
                break;
            case 2:  dayName = "MONDAY";
                break;
            case 3:  dayName = "TUESDAY";
                break;
            case 4:  dayName = "WEDNESDAY";
                break;
            case 5:  dayName = "THURSDAY";
                break;
            case 6:  dayName = "FRIDAY";
                break;
            case 7:  dayName = "SATURDAY";
            break;
            default : dayName = "Invalid Date";
                break;
        }

        return dayName;
    }



}

public class Question5 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("text.txt"));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
