package com.aerith.sortingpolygons.modules;

/**
 * Class description: This is a class for the shape of PentagonalPrism. This class extends Prism.
 *
 * @author Hoa Le
 * @author Weilong Mao
 * @author Hu Peng
 * @author Chris Wang
 *
 * @version 1.0 October 07, 2022
 *
 */

public class PentagonalPrism extends Prism{
    /**
     * The constructor of PentagonalPrism. Calculate its base area and volume at the same time.
     *
     * @param height the height of PentagonalPrism
     * @param side the side of PentagonalPrism
     */

    public PentagonalPrism (double height, double side) {
        super();
        setSide(side);
        setHeight(height);
        calcBaseArea();
        calcVolume();
    }

    /**
     * Method uses to calculate base area of PentagonalPrism
     */
    @Override
    protected void calcBaseArea() {
        double side = getSide();
        setBaseArea(5.0 * side * side * Math.tan(Math.toRadians(54.0))/4.0);
    }
}
