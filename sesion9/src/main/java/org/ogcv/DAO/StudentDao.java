package org.ogcv.DAO;
import java.util.ArrayList;
import org.ogcv.Interface.Sesion9;
import org.ogcv.Models.Student;

public class StudentDao implements Sesion9 {
    ArrayList<Student> students = new ArrayList<>();

    @Override
    public boolean store(Object object) {
        Student student = (Student) object;
        try {
            students.add((Student) student);
            return true;
        } catch (Exception e) {
            System.out.println("An error occured during the store operation");
        }
        return false;
    }
    @Override
    public boolean findByName(String name) {
        try {
            for (Student student : students) {
                if (student.getName().equals(name)) {
                    System.out.println(student);
                }
            }
            System.out.println("Student was not found");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return false;
    }

    public void showStudents(){
        for (Student student : students) {
            System.out.println(student);
        }
    }
}






