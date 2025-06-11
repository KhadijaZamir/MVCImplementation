/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Model;

/**
 *
 * @author khadi
 */


import java.util.ArrayList;

public class StudentList {
    private ArrayList<StudentData> students;

    public StudentList() {
        students = new ArrayList<>();
    }

    public void addStudent(StudentData student) {
        students.add(student);
    }

    public ArrayList<StudentData> getStudents() {
        return students;
    }

    public double getAverageCgpa() {
        if (students.isEmpty()) return 0;
        double total = 0;
        for (StudentData s : students) {
            total += s.getCgpa();
        }
        return total / students.size();
    }

    public ArrayList<StudentData> getAboveAverageStudents() {
        double avg = getAverageCgpa();
        ArrayList<StudentData> result = new ArrayList<>();
        for (StudentData s : students) {
            if (s.getCgpa() > avg) {
                result.add(s);
            }
        }
        return result;
    }
}

