package com.aerith.sortingpolygons.modules;

/**
 * Class description:
 *
 * @author Weilong Mao
 */
public class SquarePrism extends Prism {

    public SquarePrism(double height, double side) {
        super();
        setHeight(height);
        setSide(side);
        calcBaseArea();
        calcVolume();
    }

    @Override
    public double getBaseArea() {
        double side = getSide();
        return side * side;
    }

    @Override
    protected void calcBaseArea() {
        double side = getSide();
        setBaseArea(side * side);
    }
}
