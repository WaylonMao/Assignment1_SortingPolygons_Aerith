package com.aerith.sortingpolygons.modules;

/**
 * Class description: This is a class for the shape of Cylinder. This class extends Shape.
 *
 * @author Hoa Le
 * @author Weilong Mao
 * @author Hu Peng
 * @author Chris Wang
 *
 * @version 1.0 October 07, 2022
 *
 */
public class Cylinder extends Shape {

    /**
     * The radius of Cone.
     *
     * @Fields radius
     *
     **/

    private double radius;

    /**
     * The constructor of Cylinder. Calculate its base area and volume at the same time.
     *
     * @param height
     * @param radius
     */

    public Cylinder(double height, double radius) {
        super();
        setHeight(height);
        setRadius(radius);
        calcBaseArea();
        calcVolume();
    }

    /**
     * Get the radius of Cylinder.
     *
     * @return double a radius of Cone
     */

    public double getRadius() {
        return radius;
    }

    /**
     * Set the radius of Cylinder.
     *
     * @param radius the radius of Cone
     */

    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Method uses to calculate volume of Cylinder
     *
     * Cylinder's volume = PI * r^2 * h
     */
    @Override
    protected void calcVolume() {
        setVolume(getBaseArea() * getHeight() );
    }
    /**
     * Method uses to calculate base area of Cylinder
     *
     * Cylinder's base area = PI * r^2
     */

    @Override
    protected void calcBaseArea() {
        setBaseArea(Math.PI * radius * radius);
    }

}

