package exercise;

public class Topic11_Array {
    static int[] arr = {2,7,6,8,9};
    public static void main(String[] args) {
        TC1_maximumNumber();
        TC2_Sum_First_Last_Number();
        TC3_Even();
        TC4_Odd();
        TC5_SumNumber_from_0_10();
        TC6_Sum_Average();
    }

    public static void TC1_maximumNumber() {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } 
        }
        System.out.println(max);
    }

    public static void TC2_Sum_First_Last_Number() {
        System.out.println(arr[0] + arr[arr.length-1]);
    }

    public static void TC3_Even() {
        int[] arrNummber = {2,7,6,8,9,16,17,20};
        for (int i = 0; i < arrNummber.length; i++) {
            if (arrNummber[i] % 2 ==0) {
                System.out.println(arrNummber[i]);
            }
        }
    }

    public static void TC4_Odd() {
        int []  arr = {3,-7,2,5,9,-6,10,12};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0  && arr[i] %2 != 0) {
                sum += arr[i];
            }
        }
        System.out.println(sum);
    }

    public static void TC5_SumNumber_from_0_10() {
        int []  arr = {3,-7,2,5,9,-6,10,12};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >=0 && arr[i] <=10) {
                System.out.println(arr[i]);
            }
        }
    }

    public static void TC6_Sum_Average() {
        int[] arr = {3,5,7,30,10,5,8,23,0,-5};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];    
        }
        System.out.println(sum);
        System.out.println(sum/arr.length);
    }
}
