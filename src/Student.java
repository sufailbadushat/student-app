import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    int adNo;
    String name;
    int rollNo;
    String collegeName;

    public Student(int adNo, String name, int rollNo, String collegeName) {
        this.adNo = adNo;
        this.name = name;
        this.rollNo = rollNo;
        this.collegeName = collegeName;
    }

    public static void main(String[] args) {
        int condition;
        ArrayList<Student> studentArr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("---------------------Operation Menu--------------------------------");
            System.out.println("1.Add a student");
            System.out.println("2.View all students");
            System.out.println("3.Search a student with admission number and show all details");
            System.out.println("4.Delete a student with admission number");
            System.out.println("5.Exit");
            System.out.println("------------------------------------------------------------------");
            System.out.println("Enter your choice: ");
            condition = sc.nextInt();
            switch (condition){
                case 1:
                    System.out.println("Add student details");
                    System.out.println("Enter admission number:");
                    int adNo = sc.nextInt();
                    System.out.println("Enter student name:");
                    String name = sc.next();
                    System.out.println("Enter roll number:");
                    int rollNo = sc.nextInt();
                    System.out.println("Enter college name:");
                    String collegeName = sc.next();

                    Student student = new Student(adNo, name, rollNo, collegeName);
                    studentArr.add(student);
                    break;
            }
        }
    }
}
