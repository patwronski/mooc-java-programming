
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author patryk
 */
public class StorageFacility {
    private final HashMap<String,ArrayList<String>> map;
    
    public StorageFacility(){
        this.map = new HashMap<>();
    }
    public void add(String unit, String item){
        this.map.putIfAbsent(unit, new ArrayList<>());
        this.map.get(unit).add(item);
    }
    public ArrayList<String> contents(String storageUnit){
        for(String i: map.keySet()){
            
                System.out.println(map.values().get(storageUnit));
            
            
        }
        return null;
    }
}
