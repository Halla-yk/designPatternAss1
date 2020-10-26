/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q3;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hala
 */
public abstract class  Employee implements Cloneable{
    private String id;
    protected String type;
    private String name;
    
     public Employee(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public abstract String Show();
      @Override
    protected Object clone() {
        Object clone = null;
        try { 
            return super.clone();
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
        }
        return clone;
    }
}
