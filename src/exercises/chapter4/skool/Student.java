package exercises.chapter4.skool;

import java.util.Objects;

public class Student {

    private static int nextStudentId = 1;


    private String name;
    private int studentId;
    private int numberOfCredits;
    private double gpa;

    public Student(String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }

    public String studentInfo() {
        return (this.name + " has a GPA of: " + this.gpa);
    }

    public void addGrade(int courseCredits, double grade) {
        double currentTotalQualityScore = this.gpa * this.numberOfCredits;
        double newQualityScore = grade * courseCredits;
        double totalQualityScore = newQualityScore + currentTotalQualityScore;

        int newCreditTotal = this.numberOfCredits + courseCredits;
        this.numberOfCredits = newCreditTotal;
        double newGpa = totalQualityScore/newCreditTotal;
        this.gpa = newGpa;
    }

    public String getGradeLevel(){
        int credits = this.getNumberOfCredits();

        if (credits<=29) {
            return "Freshman";
        } else if (credits >=30 && credits <= 59) {
            return "Sophomore";
        } else if (credits >= 60 && credits <=89) {
            return "Junior";
        } else if (credits>=90){
            return "Senior";
        } else {
            return null;
        }
    }

    @Override
    public String toString() {
        return this.name + ": " + this.gpa;
    }

    @Override
    public boolean equals(Object obj) {
       if ((obj instanceof Student) == false) return false;
       Student studentObj = (Student) obj;

       if(studentObj.name.equals(this.name)) {
           return true;
       } else {
           return false;
       }
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentId() {
        return studentId;
    }

    private void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    protected double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

}
