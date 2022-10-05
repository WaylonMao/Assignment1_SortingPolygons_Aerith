package com.aerith.sortingpolygons.modules;

/**
 * Class description: This is a class for the shape of Pyramid. This class extends Shape.
 *
 * @author Hoa Le
 * @author Weilong Mao
 * @author Hu Peng
 * @author Chris Wang
 *
 * @version 1.0 October 07, 2022
 *
 */

public class Pyramid extends Shape{
    /**
     * The side of Pyramid
     * @Fields side
     **/
    private double side;

    /**
     * The constructor of Pyramid. Calculate its base area and volume at the same time.
     *
     * @param height the height of Pyramid
     * @param side the side of Pyramid
     */

    public Pyramid (double height, double side){
        super();
        setHeight(height);
        setSide(side);
        calcBaseArea();
        calcVolume();

    }
    /**
     * Method uses to get side of Pyramid
     * @return the side of Pyramid
     */

    public double getSide() {
        return side;
    }

    /**
     * Method uses to set side of Pyramid
     * @return the side of Pyramid
     */

    public void setSide(double side) {
        this.side = side;
    }
    /**
     * Method uses to calculate volume of Pyramid
     *
     * Pyramid's volume = 1/3 * s^2 * h
     */

    @Override
    protected void calcVolume() {
        setVolume(getBaseArea() * getHeight()/3.0);
    }

    /**
     * Method uses to calculate base area of Pyramid
     *
     * Pyramid's base area = s^2
     */

    @Override
    protected void calcBaseArea() {
        setBaseArea(side * side);
    }

}
