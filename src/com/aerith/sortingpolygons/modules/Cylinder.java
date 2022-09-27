package com.aerith.sortingpolygons.modules;

/**
 * Class description: This is a class for the shape of cylinder. This class extends Shape.
 *
 * @author Weilong Mao
 */
public class Cylinder extends Shape {
    /**
     * The radius of Cylinder.
     * @Fields radius
     **/
    private double radius;

    /**
     * The constructor of Cylinder. Calculate its base area and volume at the same time.
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
     * @return double
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Set the radius of Cylinder.
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Cylinder's volume = PI * r^2 * h
     */
    @Override
    protected void calcVolume() {
        setVolume(getBaseArea() * getHeight());
    }

    /**
     * Cylinder's base area = PI * r^2
     */
    @Override
    protected void calcBaseArea() {
        setBaseArea(Math.PI * radius * radius);
    }

}
