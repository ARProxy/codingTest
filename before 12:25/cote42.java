import java.util.Scanner;

public class cote42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = 0;
        switch(a) {
            case 1:
                sum = 0;
                break;
            case 2:
                sum = 31;
                break;
            case 3:
                sum = 31 + 29;
                break;
            case 4:
                sum = 31 + 29 + 31;
                break;
            case 5:
                sum = 31 + 29 + 31 + 30;
                break;
            case 6:
                sum = 31 + 29 + 31 + 30 + 31;
                break;
            case 7:
                sum = 31 + 29 + 31 + 30 + 31 + 30;
                break;
            case 8:
                sum = 31 + 29 + 31 + 30 + 31 + 30 + 31;
                break;
            case 9:
                sum = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31;
                break;
            case 10:
                sum = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30;
                break;
            case 11:
                sum = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
                break;
            case 12:
                sum = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30;
                break;
        }
        sum += b;

        switch(sum % 7) {
            case 0:
                System.out.println("THU");
                break;
            case 1:
                System.out.println("FRI");
                break;
            case 2:
                System.out.println("SAT");
                break;
            case 3:
                System.out.println("SUN");
                break;
            case 4:
                System.out.println("MON");
                break;
            case 5:
                System.out.println("TUE");
                break;
            case 6:
                System.out.println("WED");
                break;
        }
        sc.close();

        
    }
}
class Solution42 {
    public String solution(int a, int b) {
        int[] daysInMonth = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] daysOfWeek = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
        int totalDays = b;
        for (int i = 0; i < a; i++) {
            totalDays += daysInMonth[i];
        }
        return daysOfWeek[totalDays%7];
    }
}