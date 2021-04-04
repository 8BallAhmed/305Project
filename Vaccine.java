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
public class Vaccine {
    
    private String name;
    private int numOfShots;
    private int durationBetweenShots;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumOfShots() {
        return numOfShots;
    }

    public void setNumOfShots(int numOfShots) {
        this.numOfShots = numOfShots;
    }

    public int getDurationBetweenShots() {
        return durationBetweenShots;
    }

    public void setDurationBetweenShots(int durationBetweenShots) {
        this.durationBetweenShots = durationBetweenShots;
    }

    public Vaccine(String name, int numOfShots, int durationBetweenShots) {
        this.name = name;
        this.numOfShots = numOfShots;
        this.durationBetweenShots = durationBetweenShots;
    }
    
    
}
