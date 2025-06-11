package Controller;

import View.StudentView;
import Model.StudentData;
import Model.StudentList;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author khadi
 */
public class StudentController {

    private StudentList model;
    private StudentView view;
    
    public StudentController(StudentList model, StudentView view){
        this.model = model;
        this.view = view;
    }
    
    public void addStd(String name, String regno, double cgpa){
        StudentData newStd = new StudentData(name, regno, cgpa);
        model.addStudent(newStd);
    }
    
   
    
      public void updateView() {
        view.printStdList(model.getStudents());                        
        view.calculateAvg(model.getAverageCgpa());                      
        view.showStdAboveAvg(model.getAboveAverageStudents());       }
     
}
