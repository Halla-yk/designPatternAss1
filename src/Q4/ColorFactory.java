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
public class ColorFactory extends AbstractFactory {

    @Override
    Color getColor(String color) {
        if (color.equalsIgnoreCase("Black")) {
            return new Black();
        } else if (color.equalsIgnoreCase("White")) {
            return new White();

        } else if (color.equalsIgnoreCase("silver")) {
            return new Silver();
        }
        return null;
    }

    @Override
    Car getCar(String car) {
        return null;
    }

}
