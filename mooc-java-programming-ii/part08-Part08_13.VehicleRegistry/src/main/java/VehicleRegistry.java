
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
public class VehicleRegistry {
    private HashMap<LicensePlate, String> registry;
    
    public VehicleRegistry(){
        this.registry = new HashMap<>();
    }
    
    public boolean add(LicensePlate licensePlate, String owner){
        if(this.registry.get(licensePlate) == null){
            this.registry.putIfAbsent(licensePlate, owner);
            return true;
        }
        return false;
    }
    
    public String get(LicensePlate licensePlate){
        return this.registry.get(licensePlate);
    }
    
    public boolean remove(LicensePlate licensePlate){
        if(this.registry.get(licensePlate) != null){
            this.registry.remove(licensePlate);
            return true;
        }
        return false;
    }
    
    public void printLicensePlates(){
        for(LicensePlate licensePlate : this.registry.keySet()){
            System.out.println(licensePlate);
        }
    }
    
    public void printOwners(){
        ArrayList<String> owners = new ArrayList<>();
        for(String value : this.registry.values()){
            if(!(owners.contains(value))){
                owners.add(value);
            }
        }
        for(String owner : owners){
            System.out.println(owner);
        }
    }

}
