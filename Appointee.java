/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpit305project;

/**
 *
 * @author Ahmed
 */
public class Appointee {
    private String name;
    private int age;
    private boolean diabetic;
    private boolean obese;
    private int priority = 5;
    
    
    
    public Appointee(String name, int age, boolean diabetic, boolean obese){
        this.name = name;
        this.age = age;
        this.diabetic = diabetic;
        this.obese = obese;
        if(obese){
            priority += 2;
        }
        if(diabetic){
            priority += 3;
        }
        if(age >= 0 && age <= 21){
            priority -= 4;
        }else if(age >= 21 && age <= 35){
            priority -= 3;
        }else if(age >= 35 && age <= 45){
            priority -= 2;
        }else if(age >= 45 && age <= 55){
            priority -= 1;
        }
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isDiabetic() {
        return diabetic;
    }

    public void setDiabetic(boolean diabetic) {
        this.diabetic = diabetic;
    }

    public boolean isObese() {
        return obese;
    }

    public void setObese(boolean obese) {
        this.obese = obese;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
    
    
}
