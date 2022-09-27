package com.aerith.sortingpolygons.modules;

/**
 * Class description:
 *
 * @author Weilong Mao
 */
public class Pyramid extends Shape {
    /**
     * The radius of Pyramid.
     *
     * @Fields side
     **/
    private double side;

    /**
     * The constructor of Pyramid. Calculate its base area and volume at the same time.
     *
     * @param height
     * @param side
     */
    public Pyramid(double height, double side) {
        super();
        setHeight(height);
        setSide(side);
        calcBaseArea();
        calcVolume();
    }

    /**
     * Get the side length of Pyramid.
     *
     * @return double
     */
    public double getSide() {
        return side;
    }

    /**
     * Set the side length of Pyramid.
     *
     * @param side
     */
    private void setSide(double side) {
        this.side = side;
    }

    /**
     * Pyramid's volume = 1/3 * s^2 * h
     */
    @Override
    protected void calcVolume() {
        setVolume(getBaseArea() * getHeight() / 3.0);
    }

    /**
     * Pyramid's base area = s^2
     */
    @Override
    protected void calcBaseArea() {
        setBaseArea(side * side);
    }
}
