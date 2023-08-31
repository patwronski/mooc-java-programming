/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author patryk
 */
public class Timer {
    private ClockHand seconds;
    private ClockHand hseconds;
    
    public Timer(){
        this.seconds = new ClockHand(60);
        this.hseconds = new ClockHand(100);
    }
    
    public void advance() {
        this.hseconds.advance();
        if (this.hseconds.value() == 0) {
            this.seconds.advance();
        }
    }
    
    @Override
    public String toString(){
        return this.seconds + ":" + this.hseconds;
    }
}
