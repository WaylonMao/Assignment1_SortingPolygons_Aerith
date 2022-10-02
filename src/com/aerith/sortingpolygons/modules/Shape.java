package com.aerith.sortingpolygons.modules;


/**
 * Class clarification: This is an abstract comparable class. Same as its name, this is for shapes to extend.
 *
 * @author Hoa Le
 * @author Weilong Mao
 * @author Hu Peng
 * @author Chris Wang
 *
 * @version 1.0 October 07, 2022
 *
 *
 */
public abstract class Shape implements Comparable<Shape> {

    private double height;

    private double volume;

    private double baseArea;

    /**
     * Initializes the newly created allshapes.Shape
     */
    public Shape() {

    }
    /**
     * Method to get a height from shape
     * @return the height shape
     */
    public double getHeight() {
        return height;
    }

    /**
     * Method to set height of shape
     * @param height the height of shape
     */

    public void setHeight(double height) {
        this.height = height;
    }
    /**
     * Method to calculate volume of shape
     * @return volume the volume of shape
     */

    public double getVolume() {
        return volume;
    }

    /**
     * Method to set volume of shape
     *
     * @param volume the volume of shape
     */

    public void setVolume(double volume) {
        this.volume = volume;
    }
    /**
     * Method to calculate base area of shape
     * @return baseArea the baseArea of shape
     */

    public double getBaseArea() {
        return baseArea;
    }

    /**
     * Method to set base area of shape
     * @return baseArea the baseArea of shape
     */

    public void setBaseArea(double baseArea) {
        this.baseArea = baseArea;
    }

    /**
     * Abstract method use to calculate volume of shape
     */

    protected abstract void calcVolume();

    /**
     * Abstract method uses to calculate base area of shape
     */

    protected abstract void calcBaseArea();

    /**
     * Compare to another Shape object by height.
     *
     * @return int If greater than the other, return 1. If less than the other, return -1. If both are equal, return 0.
     *
     * @Param that The Shape object compared.
     **/

    @Override
    public int compareTo(Shape that) {
        if (this.height > that.height) {
            return 1;
        } else if (this.height < that.height) {
            return -1;
        } else {
            return 0;
        }
    }
}
