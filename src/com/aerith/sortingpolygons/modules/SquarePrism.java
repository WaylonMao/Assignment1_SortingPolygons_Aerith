package com.aerith.sortingpolygons.modules;


/**
 * Class description: This is a class for the shape of SquarePrism. This class extends Prism.
 *
 * @author Hoa Le
 * @author Weilong Mao
 * @author Hu Peng
 * @author Chris Wang
 *
 * @version 1.0 October 07, 2022
 *
 */

public class SquarePrism extends Prism {

    /**
     * The constructor of SquarePrism. Calculate its base area and volume at the same time.
     *
     * @param height the height of SquarePrism
     * @param side the side of SquarePrism
     *
     */


    public SquarePrism (double height, double side){
        super();
        setSide(side);
        setHeight(height);
        calcBaseArea();
        calcVolume();
    }
    /**
     * Method uses to calculate base area of SquarePrism
     */
    @Override
    protected void calcBaseArea() {
        double side = getSide();
        setBaseArea(side * side);
    }
}
