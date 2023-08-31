/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author patryk
 */
public class Fitbyte {
    private final int age;
    private final int RHR;
    private double percentage;
    
    public Fitbyte(int age, int RHR){
        this.age = age;
        this.RHR = RHR;
    }
    public double targetHeartRate(double percentageOfMaximum){
        this.percentage = percentageOfMaximum;
        return (206.3 - (0.711 * this.age) - this.RHR) * this.percentage + this.RHR;
    }
}
