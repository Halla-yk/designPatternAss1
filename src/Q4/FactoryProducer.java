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
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
       if(choice.equalsIgnoreCase("Car")){
       return new CarFactory();}
       else if(choice.equalsIgnoreCase("Color")){
       return new ColorFactory();}
       else return null;
    }
    
}
