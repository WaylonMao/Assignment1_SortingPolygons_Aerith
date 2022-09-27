package com.aerith.sortingpolygons.modules;

/**
 * Class description:
 *
 * @author Weilong Mao
 */
public class SquarePrism extends Prism {
    /**
     * The constructor of SquarePrism. Calculate its base area and volume at the same time.
     * @param height
     * @param side
     */
    public SquarePrism(double height, double side) {
        super();
        setHeight(height);
        setSide(side);
        calcBaseArea();
        calcVolume();
    }

    @Override
    protected void calcBaseArea() {
        double side = getSide();
        setBaseArea(side * side);
    }
}
