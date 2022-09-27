package com.aerith.sortingpolygons.modules;

/**
 * Class description: This Prisms class extends Shape class.
 *
 * @author Weilong Mao
 */
public abstract class Prism extends Shape {
    /**
     * The side length of Prism
     *
     * @Fields side
     **/
    private double side;

    /**
     * Get the side length of Prism
     *
     * @return double
     */
    public double getSide() {
        return side;
    }

    /**
     * Set the side length of Prism
     *
     * @param side
     */
    public void setSide(double side) {
        this.side = side;
    }

    /**
     * Calculate the volume of Prism.
     * All prisms' volume = baseArea * height;
     */
    @Override
    protected void calcVolume() {
        setVolume(getBaseArea() * getHeight());
    }
}
