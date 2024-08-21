package exercise;

import org.testng.annotations.Test;

import java.util.Scanner;

public class Topic4_Operator {

    @Test
    public void calculateAge() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input name: ");
        String name = scanner.nextLine();
        System.out.println("Input age: ");
        int age = scanner.nextInt();
        scanner.close();
    }
}
