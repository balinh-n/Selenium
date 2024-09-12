package exercise;

public class Oop2_ClassAndObject {

    private int studenNumber;
    private String fullName;
    private double theoretcalPoint;
    private double practcePoint;
    
    public Oop2_ClassAndObject(int studenNumber, String fullName, double theoretcalPoint, double practcePoint) {
        this.studenNumber = studenNumber;
        this.fullName = fullName;
        this.theoretcalPoint = theoretcalPoint;
        this.practcePoint = practcePoint;
    }

    public int getStudenNumber() {
        return studenNumber;
    }

    public void setStudenNumber(int studenNumber) {
        this.studenNumber = studenNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public double getTheoretcalPoint() {
        return theoretcalPoint;
    }

    public void setTheoretcalPoint(double theoretcalPoint) {
        this.theoretcalPoint = theoretcalPoint;
    }

    public double getPractcePoint() {
        return practcePoint;
    }

    public void setPractcePoint(double practcePoint) {
        this.practcePoint = practcePoint;
    }

    public double averagePoint() {
         return (theoretcalPoint + practcePoint*2)/3;
        
    }

    public String showStudentInfo() {
        String studenInfo = studenNumber + " " + fullName + " " + averagePoint();
        return studenInfo;
    }
}