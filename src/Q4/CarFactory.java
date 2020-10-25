/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q4;


/**
 *
 * @author hala
 */
public class CarFactory extends AbstractFactory{
     @Override  
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

    @Override
    Color getColor(String color) {
        return null;
    }

   
}
