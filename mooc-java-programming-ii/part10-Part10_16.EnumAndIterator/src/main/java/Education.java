/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author patryk
 */
public enum Education {
    PHD("p"),
    MA("m"),
    BA("b"),
    HS("h");
    
    private String desc;
    
    private Education(String desc){
        this.desc = desc;
    }
    
    public String getDesc(){
        return this.desc;
    }
}
