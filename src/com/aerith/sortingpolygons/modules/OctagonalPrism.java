package com.aerith.sortingpolygons.modules;

/**
 * Class description: This is a class for the shape of octagonal prism. This class extends Prism.
 *
 * @author Weilong Mao
 */
public class OctagonalPrism extends Prism {
    /**
     * The constructor of OctagonalPrism. Calculate its base area and volume at the same time.
     *
     * @param height
     * @param side
     */
    public OctagonalPrism(double height, double side) {
        super();
        setHeight(height);
        setSide(side);
        calcBaseArea();
        calcVolume();
    }

    @Override
    protected void calcBaseArea() {
        double side = getSide();
        setBaseArea(2.0 * (1 + Math.sqrt(2.0)) * side * side);
    }
}
