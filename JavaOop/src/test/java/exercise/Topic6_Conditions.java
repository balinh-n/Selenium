package exercise;

import java.util.Scanner;

public class Topic6_Conditions {

    public static void main(String[] args) {
        evenOrOdd();
        comparing();
        compareName();
        biggestNumber();
        inRange();
        rank();
        months();
    }

    public static void evenOrOdd() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number: ");
        int n = scanner.nextInt();

        if (n % 2 == 0) {
            System.out.println("n là số chẵn");
        } else {
            System.out.println("n là số lẻ");
        }
        scanner.close();
    }

    public static void comparing() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input a: ");
        int a = scanner.nextInt();

        System.out.println("Input b: ");
        int b = scanner.nextInt();

        if (a >= b) {
            System.out.println("a lớn hơn hoặc bằng b");
        } else {
            System.out.println("a nhỏ hơn b");
        }
        scanner.close();
    }

    public static void compareName() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input firstPersonName: ");
        String firstPersonName = scanner.nextLine();

        System.out.println("Input firstPersonName: ");
        String secondPersonName = scanner.nextLine();

        String result = (firstPersonName.equals(secondPersonName)) ? "2 người cùng tên" : "2 người khác tên";
        System.out.println(result);
        scanner.close();
    }

    public static void biggestNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Input second number: ");
        int secondNumber = scanner.nextInt();
        System.out.println("Input third number: ");
        int thirdNumber = scanner.nextInt();

        if (firstNumber > secondNumber && firstNumber > thirdNumber) {
            System.out.println(firstNumber + "là số lớn nhất");
        } else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
            System.out.println(secondNumber + "là số lớn nhất");
        } else {
            System.out.println(thirdNumber + "là số lớn nhất");
        }
        scanner.close();
    }

    public static void inRange() {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        if (a > 10 && a <100) {
            System.out.println(a + " nằm trong [10,100]");
        }
        else {
            System.out.println(a + " không nằm trong [10, 100]");
        }
        scanner.close();
    }

    public static void rank() {
        Scanner scanner = new Scanner(System.in);

        double point = scanner.nextDouble();

        if (point <=10 && point >=8.5) {
            System.out.println("Điểm A");
        } else if (point < 8.5 && point >= 7.5) {
            System.out.println("Điểm B");
        } else if (point < 7.5 && point >=5) {
            System.out.println("Điểm C");
        } else {
            System.out.println("Điểm D");
        }
        scanner.close();
    }

    public static void months() {
        Scanner scanner = new Scanner(System.in);

        int month = scanner.nextInt();
        if (month ==1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            System.out.println("Tháng này có 31 ngày");
        }
        else if (month == 2) {
            System.out.println("Tháng này có 28 hoặc 29 ngày");
        }
        else if (month == 4 || month == 6 || month == 9 || month == 11){
            System.out.println("Tháng này có 30 ngày");
        }
        scanner.close();
    }
}
