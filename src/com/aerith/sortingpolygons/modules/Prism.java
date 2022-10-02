package com.aerith.sortingpolygons.modules;
/**
 * Class clarification: This Prisms class extends Shape class and is blue print of all Prisms shapes
 *
 * @author Hoa Le
 * @author Weilong Mao
 * @author Hu Peng
 * @author Chris Wang
 *
 * @version 1.0 October 07, 2022
 */

public abstract class Prism extends Shape {
    /**
     * The side length of Prism
     *
     * @Fields side the side of Prism
     **/

    private  double side;

    /**
     * Method to get side of Prism
     *
     * @return side the side of Prism
     */
    public double getSide() {
        return side;
    }

    /**
     * Method to set side of Prism
     *
     * @return side the side of Prism
     */

    public void setSide(double side) {
        this.side = side;
    }
    /**
     * Method uses to calculate the volume of Prism.
     *
     * All prisms' volume = baseArea * height;
     */

    protected void calcVolume() {
        setVolume(getBaseArea() * getHeight());
    }

}
