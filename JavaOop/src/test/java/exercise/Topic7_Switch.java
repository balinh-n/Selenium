package exercise;

import java.util.*;

public class Topic7_Switch {

    public static void main(String[] args) {
        switchNumber();
        calculate();
        month();
    }

    public static void switchNumber() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        switch (number) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break;
            case 10:
                System.out.println("Ten");
                break;
            default:
                break;
        }
        scanner.close();
    }

    public static void calculate() {
        Scanner scanner = new Scanner(System.in);
        String operator = scanner.nextLine();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        switch (operator) {
            case "+":
                System.out.println("a + b =" + (a + b));
                break;
            case "-":
                System.out.println("a - b =" + (a - b));
                break;
            case "*":
                System.out.println("a * b = " + (a * b));
                break;
            case "/":
                System.out.println("a / b = " + (a / b));
                break;
        }

        scanner.close();
    }

    public static void month() {
        Scanner scanner = new Scanner(System.in);

        int month = scanner.nextInt();

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Tháng này có 31 ngày");
                break;
            case 2:
                System.out.println("tháng này có 28 hoặc 29 ngày");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Tháng này có 30 ngày");
        }
        scanner.close();
    }
}
