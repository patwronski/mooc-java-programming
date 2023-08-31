
import java.util.ArrayList;
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author patryk
 */
public class ChangeHistory {
    private ArrayList<Double> list;
    
    public ChangeHistory(){
        this.list = new ArrayList<>();
    }
    
    public void add(double status){
        this.list.add(status);
    }
    
    public void clear(){
        this.list.clear();
    }
    
    public double maxValue(){
        return Collections.max(list);
    }
    
    public double minValue() {
        return Collections.min(list);
    }
    
    public double average(){
        double sum = 0;
        int counter = 0;
        for(double value : list){
            sum+=value;
            counter++;
        }
        return sum/counter;
    }
    
    @Override
    public String toString(){
        return this.list.toString();
    }
}
