
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
public class OneItemBox extends Box{
    private int itemCapacity;
    private ArrayList<Item> items;
    
    public OneItemBox(){
        this.itemCapacity = 0;
        this.items = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        if(this.itemCapacity == 0){
            this.items.add(item);
            this.itemCapacity += 1;
        }
    }

    @Override
    public boolean isInBox(Item item) {
        return this.items.contains(item);
    }
    
}
