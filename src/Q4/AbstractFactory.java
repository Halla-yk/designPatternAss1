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
public abstract class  AbstractFactory {
    
    abstract Color getColor(String color);
    abstract Car getCar(String car);
}
