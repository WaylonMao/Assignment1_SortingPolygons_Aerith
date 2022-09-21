package com.aerith.sortingpolygons.modules;


/**
 * Class description: This is an abstract comparable class. Same as its name, this is for shapes to extend.
 *
 * @author Weilong Mao
 */
public abstract class Shape implements Comparable<Shape> {
    /**
     * The height of Shape
     * @Fields height
     **/
    private double height;
    /**
     * The volume of Shape
     * @Fields volume
     **/
    private double volume;
    /**
     * The base area of Shape
     * @Fields baseArea
     **/
    private double baseArea;

    /**
     * Initializes the newly created com.aerith.sortingpolygons.modules.Shape
     */
    public Shape() {

    }

    /**
     * Set the height of Shape.
     * @Param height
     * @return void
     **/
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * Get the height of Shape.
     * @return double
     **/
    public double getHeight() {
        return height;
    }

    /**
     * Set the base area of Shape.
     * @Param baseArea
     * @return void
     **/
    protected void setBaseArea(double baseArea) {
        this.baseArea = baseArea;
    }

    /**
     * Get the base area of Shape.
     * @return double
     **/
    public double getBaseArea() {
        return baseArea;
    }

    /**
     * Set the volume of Shape.
     * @Param volume
     * @return void
     **/
    protected void setVolume(double volume) {
        this.volume = volume;
    }

    /**
     * Get the volume of Shape.
     * @return double
     **/
    public double getVolume() {
        return volume;
    }

    /**
     * To calculate the volume of Shape.
     * @return void
     **/
    protected abstract void calcVolume();

    /**
     * To calculate the base area of Shape.
     * @return void
     **/
    protected abstract void calcBaseArea();

    /**
     * Compare to another Shape object by height.
     * @Param that The Shape object compared.
     * @return int If greater than the other, return 1. If less than the other, return -1. If both are equal, return 0.
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
