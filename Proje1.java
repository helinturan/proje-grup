import java.util.Scanner;
public class Proje1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//1
        System.out.println("Please enter the day: ");
        int day = scan.nextInt();
        System.out.println("Please enter the month: ");
        int month = scan.nextInt();
        System.out.println("Please enter the year: ");
        int year = scan.nextInt();

        if (month > 12 || month < 1) {
            System.out.println("Invalid month");
            return;
        }

        int numberofdays;
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            numberofdays = 30;
        }
        else if (month == 1 || month == 3 || month == 5 || month == 7
                || month == 8 || month == 10 || month == 12) {
            numberofdays = 31;
        }
        else if (month == 2) {
            if (isLeapYear(year)) {
                numberofdays = 29;
            }
            else {
                numberofdays = 28;
            }
        }
        else {
            System.out.println("Invalid month");
            return;
        }

        if (day < 1 || day > numberofdays) {
            System.out.println("Invalid day");
        }
        else {
            System.out.println("Valid day.");
        }
    }

    public static boolean isLeapYear(int year) {
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            return true;
        }
        else {
            return false;
        }
    }

