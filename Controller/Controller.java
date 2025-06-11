package Controller;

import Model.Model;
import View.View;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author khadi
 */
public class Controller {

    private Model model;
    private View view;
    
    public Controller(Model model, View view){
        this.model = model;
        this.view = view;
    }
    
    public void setData(String data){
        model.setData(data);
    }
    
    public String getData(){
       return model.getData();
    }
    
    public void updateView(){
        view.printData(getData());
    }
     
}
