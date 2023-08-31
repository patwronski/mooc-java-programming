/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Random;

/**
 *
 * @author patryk
 */
public class TemperatureSensor implements Sensor{
    private boolean status;
    
    public TemperatureSensor(){
        this.status = false;
    }
            
    @Override
    public boolean isOn() {
        return this.status;
    }

    @Override
    public void setOn() {
        this.status = true;
    }

    @Override
    public void setOff() {
        this.status = false;
    }

    @Override
    public int read() {
        if(this.status == false){
            throw new IllegalStateException();
        }
        return new Random().nextInt(61) - 30;
    }
    
    
}
