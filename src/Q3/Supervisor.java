/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q3;

/**
 *
 * @author hala
 */
public class Supervisor extends Employee{
     public Supervisor(String id, String name) {
        super(id, name);
        this.type = "Supervisor";
    }

    @Override
    public String Show() {
        return "Supervisor";
    }

   
    
}
