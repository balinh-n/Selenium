package exercise;

import java.util.Scanner;

public class Topic8_Loop {

    public static void main(String[] args) {
        TC1_printNumber();
        TC2_printNumber();
        TC3_printNumber();
        TC4_printNumber();
        TC5_pinttNumber();
        TC6_pinttNumber();
        TC7_pinttNumber();
    }

    public static void TC1_printNumber() {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        scanner.close();
    }

    public static void TC2_printNumber() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        for (int i = a; i <= b; i++) {
            System.out.print(i + " ");
        }
        scanner.close();
    }

    public static void TC3_printNumber() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        for (int i = 0; i <= a; i++) {
            if (i % 2 == 0) {
                System.out.print(i);
            }
        }

        scanner.close();
    }

    public static void TC4_printNumber() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum += i;
        }
        System.out.println(sum);
        scanner.close();
    }

    public static void TC5_pinttNumber() {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            if (!(i % 2 == 0)) {
                sum += i;
            }
        }
        System.out.println(sum);
        scanner.close();
    }

    public static void TC6_pinttNumber() {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        for (int i = a; i <= b; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
        scanner.close();
    }

    public static void TC7_pinttNumber() {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int giai_thua=1;
        for (int i = 1; i <= a; i++) {
            giai_thua *= i;
        }
        System.out.println(giai_thua);
        scanner.close();
    }
}
