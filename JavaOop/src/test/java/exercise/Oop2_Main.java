package exercise;

public class Oop2_Main {
    
    public static void main(String[] args) {
        Oop2_ClassAndObject object = new Oop2_ClassAndObject(1, "Mary", 1.6, 1.9);
        Oop2_ClassAndObject object1 = new Oop2_ClassAndObject(2, "Jack", 2.6, 3.7);
        Oop2_ClassAndObject object2 = new Oop2_ClassAndObject(3, "larry", 2.1, 4.7);
        System.out.println(object.showStudentInfo());
        System.out.println(object1.showStudentInfo());
        System.out.println(object2.showStudentInfo());
    }
}
