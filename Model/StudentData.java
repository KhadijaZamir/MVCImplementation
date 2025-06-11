package Model;


import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author khadi
 */


// MODEL Class
public class StudentData {

    private String name;
    private String regno;
    private double cgpa;
    
    
    public StudentData(String name, String regno, double cgpa){
        this.name = name;
        this.regno = regno;
        this.cgpa = cgpa;
    }
//    public String getData(){
//        return "Name: " + name + ", Reg No: " + regno + ", CGPA: " + cgpa;
//    }
    
    public String getName() { 
        return name; 
    }
    public String getRegno() {
        return regno; 
    }
    public double getCgpa() {
        return cgpa; 
    }
    
//    public void setData(String data){
//        this.data = data;
//    }

     @Override
    public String toString() {
        return "Name: " + name + ", Reg No: " + regno + ", CGPA: " + cgpa;
    }

    public String getData() {
        return toString();
    }
  
}
