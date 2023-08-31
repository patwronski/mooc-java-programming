
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
public class Stack {
    private ArrayList<String> mStack;
    
    public Stack(){
        this.mStack = new ArrayList<>();
    }
    
    public boolean isEmpty(){
        return this.mStack.isEmpty();
    }
    
    public void add(String value){
        this.mStack.add(value);
    }
    
    public ArrayList<String> values(){
        return this.mStack;
    }
    
    public String take(){
        String test = this.mStack.get(this.mStack.size()-1);
        this.mStack.remove(test);
        return test;
    }
}
