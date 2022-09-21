package com.aerith.sortingpolygons.modules;

/**
 * Class description:
 *
 * @author Weilong Mao
 */
public class Pyramid extends Shape {

    private double side;

    public Pyramid(double height, double side) {
        super();
        setHeight(height);
        setSide(side);
        calcBaseArea();
        calcVolume();
    }

    public double getSide() {
        return side;
    }

    private void setSide(double side) {
        this.side = side;
    }


    @Override
    protected void calcVolume() {
        // volume = 1/3 * s^2 * h
        setVolume(getBaseArea()*getHeight() / 3.0);
    }

    @Override
    protected void calcBaseArea() {
        // base area = s^2
        setBaseArea(side * side);
    }
}
