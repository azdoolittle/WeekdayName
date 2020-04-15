import java.util.Scanner;

public class WeekdayName {
    public static void main(String[] args) {
        Scanner input;
        int weekdayNum;
        String weekday;
        String returnStr;

        System.out.println("Enter a number from 1-7: ");
        input = new Scanner(System.in);
        weekdayNum = input.nextInt();

        switch (weekdayNum) {
            case 1:
                weekday = "Sunday";
                break;
            case 2:
                weekday = "Monday";
                break;
            case 3:
                weekday = "Tuesday";
                break;
            case 4:
                weekday = "Wednesday";
                break;
            case 5:
                weekday = "Thursday";
                break;
            case 6:
                weekday = "Friday";
                break;
            case 7:
                weekday = "Saturday";
                break;
            default:
                main(new String[] {});
                return;
        }
        System.out.printf("It is %s.", weekday);
    }
}
