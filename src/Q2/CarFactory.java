/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q2;

/**
 *
 * @author hala
 */
public class CarFactory {
      public Car getCar(String type){
        if(type.equalsIgnoreCase("Sedan"))
            return new Sedan();
        else if(type.equalsIgnoreCase("SUV"))
            return new SUV();
        else if(type.equalsIgnoreCase("Van"))
            return new Van();
        else
            return new Sedan();
    }
}
