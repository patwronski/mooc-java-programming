/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author patryk
 */
public class Book implements Comparable<Book>{
    private String name;
    private int ageRec;
    
    public Book(String name, int ageRec){
        this.name = name;
        this.ageRec = ageRec;
    }
    
    @Override
    public String toString(){
        return this.name + " (recommended for " + this.ageRec + " year-olds or older)";
    }
    
    public int getAgeRec(){
        return this.ageRec;
    }
    
    public String getName(){
        return this.name;
    }
    
    @Override
    public int compareTo(Book object){
        if(this.ageRec == object.ageRec){
            return this.name.compareTo(object.name);
        }
        return this.ageRec - object.ageRec;
    }
}
