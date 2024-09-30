/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author Admin
 */
public class Coder extends Person {

    private String Programming_Language;

    public Coder() {
    }

    public Coder(String Programming_Language, String name, int age, String phone) {
        super(name, age, phone);
        this.Programming_Language = Programming_Language;
    }

    public String getProgramming_Language() {
        return Programming_Language;
    }

    public void setProgramming_Language(String Programming_Language) {
        this.Programming_Language = Programming_Language;
    }
    public String toString(){
        return super.toString()+ "\nngon ngu: "+ Programming_Language;
    }
    
}
