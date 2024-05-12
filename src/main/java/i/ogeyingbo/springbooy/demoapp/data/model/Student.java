/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package i.ogeyingbo.springbooy.demoapp.data.model;

/**
 *
 * @author BOLAJI-OGEYINGBO
 */
public class Student {
     
    private  int  id = 0;
    private  String  name;
    private  int   age = -1;
    private  String  grade;
    private  String  gender;
    private  String  state;
    
    
    public  void   setId(int inId){
        id = inId;
    }
    
    public  void   setName(String inName){
        name = inName;
    }
    
    public  void   setAge(int inAge){
           age = inAge;
    }
    
    public  void   setGrade(String inGrade){
           grade = inGrade;
    }
    
    public  void   setGender(String inGender){
          gender = inGender;
    }
    
    public  void   setState(String inState){
            state = inState;
    }
    
    
    
    
    public  int  getId(){
        return   id;
    }
    
    public  String  getName(){
        return   name;
    }
    
    public  int  getAge(){
        return   age;
    }
    
    public  String  getGrade(){
        return   grade;
    }
    
    public  String  getGender(){
        return   gender;
    }
    
    public  String  getState(){
        return   state;
    }
    
}
