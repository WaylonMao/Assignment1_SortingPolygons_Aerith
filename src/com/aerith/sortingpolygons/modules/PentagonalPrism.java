package com.aerith.sortingpolygons.modules;

/**
 * Class description:
 *
 * @author Weilong Mao
 */
public class PentagonalPrism extends Prism {
    /**
     * The constructor of PentagonalPrism. Calculate its base area and volume at the same time.
     * @param height
     * @param side
     */
    public PentagonalPrism(double height, double side) {
        super();
        setHeight(height);
        setSide(side);
        calcBaseArea();
        calcVolume();
    }

    @Override
    protected void calcBaseArea() {
        double side = getSide();
        setBaseArea(5.0 * side * side * Math.tan(Math.toRadians(54.0)) / 4.0);
    }
}
