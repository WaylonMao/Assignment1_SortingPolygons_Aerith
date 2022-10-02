package com.aerith.sortingpolygons.modules;

/**
 * Class description: This is a class for the shape of OctagonalPrism. This class extends Prism.
 *
 * @author Hoa Le
 * @author Weilong Mao
 * @author Hu Peng
 * @author Chris Wang
 *
 * @version 1.0 October 07, 2022
 *
 */

public class OctagonalPrism extends Prism{

    /**
     * The constructor of OctagonalPrism. Calculate its base area and volume at the same time.
     *
     * @param height the height of OctagonalPrism
     * @param side the side of OctagonalPrism
     */

    public OctagonalPrism (double height, double side){
        super();
        setHeight(height);
        setSide(side);
        calcBaseArea();
        calcVolume();
    }
    /**s
     * Method use to calculate base area of OctagonalPrism
     */
    @Override

    protected void calcBaseArea() {
        double side = getSide();
        setBaseArea(2.0 * (1 + Math.sqrt(2.0)) * side * side);
    }
}

