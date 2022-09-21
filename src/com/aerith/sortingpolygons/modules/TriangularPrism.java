package com.aerith.sortingpolygons.modules;

/**
 * Class description:
 *
 * @author Weilong Mao
 */
public class TriangularPrism extends Prism {
    /**
     * The constructor of TriangularPrism. Calculate its base area and volume at the same time.
     * @param height
     * @param side
     */
    public TriangularPrism(double height, double side) {
        super();
        setHeight(height);
        setSide(side);
        calcBaseArea();
        calcVolume();
    }

    @Override
    protected void calcBaseArea() {
        double side = getSide();
        setBaseArea(side * side * Math.sqrt(3.0) / 4.0);
    }
}
