package Main;
import Model.StudentData;
import Controller.StudentController;
import Model.StudentList;
import View.StudentView;



public class MyMain {

    public static void main(String[] args) {
        
        StudentList model = new StudentList();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);
        
        controller.addStd("Khadija", "sp23bse025", 3.9);
        controller.addStd("ALishba", "sp23bse022", 3.8);
        controller.addStd("Narjis", "sp23bse023", 3.7);
        controller.addStd("Nida", "sp23bse011", 3.6);
        controller.addStd("Rabeea", "sp23bse032", 3.5);
       
        controller.updateView();

}
}
