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
public class Junior extends Employee{

    public Junior(String id, String name) {
        super(id, name);
        this.type = "Junior";
    }

    
    @Override
    public String Show() {
        return "Junior";
    }
    
}
