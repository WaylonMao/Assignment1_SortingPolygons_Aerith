package com.aerith.sortingpolygons.modules;

/**
 * Class description: This is a class for the shape of cone. This class extends Shape.
 *
 * @author Hoa Le
 * @author Weilong Mao
 * @author Hu Peng
 * @author Chris Wang
 *
 * @version 1.0 October 07, 2022
 *
 */
public class Cone extends Shape {
    /**
     * The radius of Cone.
     *
     * @Fields radius the radius of Cone
     **/
    private double radius;

    /**
     * The constructor of Cone. Calculate its base area and volume at the same time.
     *
     * @param height the height of cone
     * @param radius the radius of cone
     */
    public Cone(double height, double radius) {
        super();
        setHeight(height);
        setRadius(radius);
        calcBaseArea();
        calcVolume();
    }

    /**
     * Get the radius of Cone.
     *
     * @return double  a radius of Cone
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Set the radius of Cone.
     *
     * @param radius the radius of Cone
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Method to calculate volume of Cone
     * Cone's volume = 1/3 * PI *r^2 * h
     */
    @Override
    protected void calcVolume() {
        setVolume(getBaseArea() * getHeight() / 3.0);
    }

    /**
     * Method uses to calculate base area of Cone
     * Cone's base area = PI * r^2
     */
    @Override
    protected void calcBaseArea() {
        setBaseArea(Math.PI * radius * radius);
    }
}
