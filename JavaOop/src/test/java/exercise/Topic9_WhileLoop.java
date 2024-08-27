package exercise;

import java.util.Scanner;

public class Topic9_WhileLoop {

    public static void main(String[] args) {
        TC1();
        TC2();
        TC3();
        TC4();
        TC5();
        TC6();
    }

    public static void TC1() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        while (n < 100) {
            if (n % 2 == 0) {
                System.out.println(n);
            }
            n++;
        }
        scanner.close();
    }

    public static void TC2() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        while (a < b) {
            if (a % 3 == 0 && a % 5 == 0) {
                System.out.println(a);
            }
            a++;
        }
        scanner.close();
    }

    public static void TC3() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int a = 0;

        while (n < m) {
            if (n % 2 != 0) {
                a += n;
            }
            n++;
        }
        System.out.println(a);
        scanner.close();
    }

    public static void TC4() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        while (a < b) {
            if (a % 3 == 0) {
                System.out.println(a);
            }
            a++;
        }
        scanner.close();
    }

    public static void TC5() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int i = 1;
        while (a > 0) {
            i *= a;
            a--;
        }
        System.out.println(i);
        scanner.close();
    }

    public static void TC6() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        while (a < b) {
            if (a % 2 == 0) {
                System.out.println(a);
            }
            a++;
        }
        scanner.close();
    }
}