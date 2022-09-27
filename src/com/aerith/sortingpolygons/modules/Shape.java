package com.aerith.sortingpolygons.modules;


/**
 * Class description:
 *
 * @author Weilong Mao
 */
public abstract class Shape implements Comparable<Shape> {

    private double height;

    private double volume;

    private double baseArea;

    /**
     * Initializes the newly created com.aerith.sortingpolygons.modules.Shape
     */
    public Shape() {

    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return volume;
    }

    public double getBaseArea() {
        return baseArea;
    }

    protected void setBaseArea(double baseArea) {
        this.baseArea = baseArea;
    }

    protected void setVolume(double volume) {
        this.volume = volume;
    }

    protected abstract void calcVolume();

    protected abstract void calcBaseArea();

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
