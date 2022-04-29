package exercises.chapters123;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashmapPractice {
    
    public static void main (String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;

        System.out.println("Enter your students");
        
        do {
            System.out.println("Student: ");
            newStudent = input.nextLine();

            if (!newStudent.equals("")) {
                System.out.println("Student ID: ");
                Integer studentID = input.nextInt();
                students.put(studentID, newStudent);

                input.nextLine();
            }
        }
        while(!newStudent.equals(""));
        input.close();



        System.out.println("\nClass roster: ");
        for (Map.Entry<Integer, String> student: students.entrySet()) {
            System.out.println(student.getKey() + ": " + student.getValue());
        }

    }
}
