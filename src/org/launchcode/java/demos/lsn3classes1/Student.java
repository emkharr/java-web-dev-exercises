package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

public class Student {

    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private final double gpa = 0.0;


    public String getName() {
        return name;
    }
    public void setName(String aName) {
        name = aName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int aStudentId) {
        studentId = aStudentId;
    }

    protected int getNumberOfCredits() {
        return numberOfCredits;
    }

    protected void setNumberOfCredits(int aNumberOfCredits) {
        numberOfCredits = aNumberOfCredits;
    }

    protected final double getGpa() {
        return gpa;
    }

}