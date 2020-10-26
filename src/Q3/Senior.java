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
public class Senior extends Employee{

    public Senior(String id, String name) {
        super(id, name);
        this.type = "Senior";
    }
    

    @Override
    public String Show() {
        return "Senior";
    }
    
}
