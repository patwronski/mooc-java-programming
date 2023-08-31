
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author patryk
 */
public class UserInterface {
    private Scanner sc = new Scanner(System.in);
    private TodoList list = new TodoList();
    //private String command;
    //private String task;
    //private int number;
    
    public UserInterface(TodoList list, Scanner sc) {
        this.list = list;
        this.sc = sc;
    }
    
    public void start(){
        while(true) {
            System.out.println("Command: ");
            
            String command = String.valueOf(sc.nextLine());
            if(command.equals("stop")) {
                break;
            }
            
            if(command.equals("add")) {
                this.list.add(String.valueOf(sc.nextLine()));
            }
            
            if(command.equals("list")) {
                this.list.print();
            }
            
            if(command.equals("remove")) {
                this.list.remove(Integer.valueOf(sc.nextLine()));
            }
            
        }
    }
}
