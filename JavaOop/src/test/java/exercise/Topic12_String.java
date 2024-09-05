package exercise;

import java.util.Scanner;

public class Topic12_String {
    static String courseName = "Automation Testing 345 Tutorials Online 789";
    public static void main(String[] args) {
        //TC1_printUpperLetter();
        //TC2_printLetter();
        //TC3_reserveWord();
        TC4_validatePhone();
    }

    public static void TC1_printUpperLetter() {
        char [] singleChars = courseName.toCharArray(); 
        int count = 0;
        for (char signlechar: singleChars) {
            if (Character.isUpperCase(signlechar)) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void TC2_printLetter() {
       
        char[] singleChars = courseName.toLowerCase().toCharArray();
        int count = 0;
        for (char c : singleChars) {
          if (c == 'a') {
            count++;
          }
        }
        System.out.println(count);
        System.out.println(courseName.contains("Testing"));
        System.out.println(courseName.startsWith("Automation"));
        System.out.println(courseName.endsWith("Online"));
        System.out.println(courseName.indexOf("Tutorials"));
        System.out.println(courseName.replace("Online", "Offline"));
        
        
        int countNumber = 0;
        for (char c : singleChars) {
            if (c >= '0' && c <= '9') {
                countNumber++;
            }
        }
        System.out.println(countNumber);
    }

    public static void TC3_reserveWord() {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();

        char[] reverse = sentence.toCharArray();

        for (int i = reverse.length -1 ; i >= 0; i--) {
            System.out.println(reverse[i]);
        }
        scanner.close();
    }

    public static void TC4_validatePhone() {
        Scanner scanner = new Scanner(System.in);
        String phone = scanner.nextLine();
        
        if (phone.startsWith("7") || phone.startsWith("8") || phone.startsWith("9")) {
            System.out.println("Correct phone number format");
        }
        else {
            System.out.println("wrong phone number format");
        }
        scanner.close();
    }
}
