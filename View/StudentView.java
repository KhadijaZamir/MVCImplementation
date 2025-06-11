package View;

import Model.StudentData;
import java.util.ArrayList;


public class StudentView {

    
   public void printStdList(ArrayList<StudentData> students){
       System.out.println("Student List:");
       for(StudentData s: students){
           System.out.println(" - " + s.getData());
       }
   }
   
   //list avg gpa
   public void calculateAvg(double avg){
       System.out.println("Average Cgpa: " + avg);
   }
   
   //list of students more than avg gpa
    public void showStdAboveAvg(ArrayList<StudentData> abavg){
       System.out.println("Students who got Cgpa above Average: " + abavg);
   }
   
}
