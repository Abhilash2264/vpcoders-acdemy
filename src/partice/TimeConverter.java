package partice;

import java.util.Scanner;

public class TimeConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days= scanner.nextInt();
        int hours = scanner.nextInt();
        int min = 60;
        int sec = 60;
        int result = days*hours*min*sec;
        System.out.println(result);
    }
}
