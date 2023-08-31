
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
public class ProductWarehouseWithHistory extends ProductWarehouse{
    private ChangeHistory history = new ChangeHistory();
    
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance){
        super(productName,capacity);
        super.addToWarehouse(initialBalance);
        this.history.add(initialBalance);
        //Set the initial balance as the initial balance of the warehouse, as well as the first value of the change history.
    }
    
    public String history(){
        return history.toString();
    }
    
    @Override
    public void addToWarehouse(double amount){
        super.addToWarehouse(amount);
        this.history.add(super.getBalance());
    }
    
    @Override
    public double takeFromWarehouse(double amount){
        super.takeFromWarehouse(amount);
        this.history.add(super.getBalance());
        
        return 0;
    }
    
    public void printAnalysis(){
        System.out.println("Product: " + super.getName());
        System.out.println("History: " + this.history());
        System.out.println("Largest amount of product:" + history.maxValue());
        System.out.println("Smallest amount of product: " + history.minValue());
        System.out.println("Average: " + history.average());
    }
}
