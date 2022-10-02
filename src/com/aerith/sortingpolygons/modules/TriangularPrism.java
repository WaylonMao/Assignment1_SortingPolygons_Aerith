package com.aerith.sortingpolygons.modules;


/**
 * Class description: This is a class for the shape of TriangularPrism. This class extends Prism.
 *
 * @author Hoa Le
 * @author Weilong Mao
 * @author Hu Peng
 * @author Chris Wang
 *
 * @version 1.0 October 07, 2022
 *
 */

public class TriangularPrism extends Prism {

    /**
     * The constructor of TriangularPrism. Calculate its base area and volume at the same time.
     *
     * @param height the height of TriangularPrism
     * @param side the side of TriangularPrism
     */

    public TriangularPrism (double height, double side) {
        super();
        setHeight(height);
        setSide(side);
        calcBaseArea();
        calcVolume();
    }

    /**
     * Method uses to calculate base are of TriangularPrism
     */
    @Override
    protected void calcBaseArea() {
        double side = getSide();
        setBaseArea(side * side * Math.sqrt(3)/4.0);
    }
}
