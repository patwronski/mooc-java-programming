
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author patryk
 */
public class Box implements Packable{
    private double maximumCapacity;
    private ArrayList<Packable> packables;
    
    public Box(double maximumCapacity){
        this.maximumCapacity = maximumCapacity;
        this.packables = new ArrayList<>();
    }
    
    public void add(Packable packable){
        if(weight() + packable.weight() <= this.maximumCapacity){
            this.packables.add(packable);
        }
    }
    
    @Override
    public double weight(){
        double weight = 0;
        for(Packable packable : this.packables){
            weight+=packable.weight();
        }
        return weight;
    }
    
    @Override
    public String toString(){
        return "Box: " + this.packables.size() + " items, total weight " + weight() + " kg"; 
    }
    
}
