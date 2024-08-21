package exercise;

import org.testng.annotations.Test;

public class Topic3_DataType {

    @Test
    public void calculate () {
        int a = 6;
        int b = 2;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
    }
    @Test
    public void totalArea () {
        double width = 3.8;
        double height = 7.5;
        double P = width*height;
        System.out.println("Area = " + P);
    }
    @Test
    public void printText () {
        String text = "Automation Testing";
        System.out.println("Hello " + text);
    }
}
