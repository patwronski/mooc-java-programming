/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author patryk
 */
public class AverageSensor implements Sensor{
    
    private ArrayList<Sensor> sensors;
    private ArrayList<Integer> readings;
    
    public AverageSensor(){
        this.sensors = new ArrayList<>();
        this.readings = new ArrayList<>();
    }
    
    @Override
    public boolean isOn() {
        /*for(Sensor sensor : sensors){
            System.out.println(sensor);
            System.out.println(sensor.isOn());
        }*/
        return sensors.stream().noneMatch(sensor -> (sensor.isOn()==false));
    }

    @Override
    public void setOn() {
        sensors.forEach(sensor -> {sensor.setOn();} );
    }

    @Override
    public void setOff() {
        sensors.forEach(sensor -> {sensor.setOff();} );
    }

    @Override
    public int read() {
        if(isOn() == false){
            throw new IllegalStateException();
        }
        if(sensors.isEmpty() == true){
            throw new IllegalStateException();
        }
        int value = (int)sensors.stream().mapToInt(s -> s.read()).average().getAsDouble();
        this.readings.add(value);
        
        return value;
        
    }
    
    public void addSensor(Sensor toAdd){
        this.sensors.add(toAdd);
    }
    
    public List<Integer> readings(){
        return this.readings;
        //return sensors.stream().map(s ->s.read()).collect(Collectors.toList());
    }
    
}
