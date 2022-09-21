package com.aerith.sortingpolygons.modules;

/**
 * Class description:
 *
 * @author Weilong Mao
 */
public abstract class Prisms extends Shape {

    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    protected void calcVolume(){
        setVolume(getBaseArea() * getHeight());
    }
}
