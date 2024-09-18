package org.ogcv;
import java.util.Scanner;

import org.ogcv.Interface.Sesion9;
import org.ogcv.Models.Student;

public class Main {
    public static <StudentDao> void main(String[] args) {
        StudentDao students = new StudentDao();

        Scanner sc = new Scanner(System.in);
        int option = 0;
        String menu = "1. Add student\n" +
                "2. Find student\n" +
                "3. Show students\n" +
                "4. Exit program\n" +
                "Enter you choice: ";
        while (option != 4) {
            System.out.println(menu);
            option = sc.nextInt();

            if (option == 1) {
                System.out.println("Enter the name of the student: ");
                String name = sc.next();
                System.out.println("Enter the age of the student: ");
                int age = sc.nextInt();
                System.out.println("Enter the email address of the student: ");
                String email = sc.next();
                Student student = new Student(name, age, email);
                students.store(student);
            }
        }
    }
}
