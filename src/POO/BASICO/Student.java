package POO.BASICO;

public class Student {
    public String name;
    public double n1;
    public double n2;
    public double n3;

    public double finalGrade() {
        return n1 + n2 + n3;
    }

    public void approval() {
        if (finalGrade() >= 60) {
            System.out.println(name.toUpperCase());
            System.out.println("FINAL GRADE = " + String.format("%.2f", finalGrade()));
            System.out.println("PASS");
        } else {
            System.out.println(name.toUpperCase());
            System.out.println("FINAL GRADE = " + String.format("%.2f", finalGrade()));
            System.out.println("FAILED");
            System.out.println("MISSING " + String.format("%.2f", 60 - finalGrade()) + " POINTS");
        }
    }


}
