package exercise;

import java.util.Scanner;

public class Topic4_Operator {

    public static void main(String[] args) {
        //calculateAge();
        //swapperNumber();
        compareNumber();
    }

    public static void calculateAge() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input name: ");
        String name = scanner.nextLine();
        System.out.println("Input age: ");
        int age = scanner.nextInt();
        int ageAfter15Years = age + 15;
        System.out.println("After 15 years, age of " + name + " will be " + ageAfter15Years);
        scanner.close();
    }

    public static void swapperNumber() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Input a: ");
        int a = scanner.nextInt();

        System.out.println("Input b: ");
        int b = scanner.nextInt();
        int temp = a;
        a=b;
        b=temp;
        System.out.println("After swapping then a = "+ a + ",b = " +b);
        scanner.close();
    }

    public static void compareNumber() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Input a: ");
        int a = scanner.nextInt();

        System.out.println("Input b: ");
        int b = scanner.nextInt();

        if (a > b) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
        scanner.close();
    }
}
