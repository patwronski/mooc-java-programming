
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author patryk
 * @param <T>
 */
public class Pipe<T>{
    private ArrayList<T> elements;
    
    public Pipe() {
        this.elements = new ArrayList<>();
    }
    
    public void putIntoPipe(T value){
        this.elements.add(value);
    }
    
    public T takeFromPipe(){
        T element = this.elements.get(0);
        this.elements.remove(0);
        
        return element;
    }
    
    public boolean isInPipe(){
        return this.elements.isEmpty();
    }
}
