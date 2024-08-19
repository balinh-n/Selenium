package exercise;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        //nameAndAge();
        //swapNumber();
        compare();
    }
    public static void nameAndAge() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input name:");
        String personName = scanner.nextLine();

        System.out.println("Input age:");
        int age = scanner.nextInt();
        int ageafter = age + 15;
        System.out.println("After 15 years, age of : " + personName + " will be  " + ageafter);
    }

    public static void swapNumber () {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Int temp:");
        int temp = scanner.nextInt();
        System.out.println("int a");
        int a = scanner.nextInt();
        System.out.println("int b");
        int b = scanner.nextInt();

        System.out.println(" before swap" + a + b);
       temp=a;
        a=b;
        b=temp;

        System.out.println("after swap" + a + b);
    }

    public static void compare () {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Input a:");
        int a = scanner.nextInt();
        System.out.println("Input b:");
        int b = scanner.nextInt();

        if (a > b) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}
