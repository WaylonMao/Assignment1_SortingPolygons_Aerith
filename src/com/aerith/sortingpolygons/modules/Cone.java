package com.aerith.sortingpolygons.modules;

/**
 * Class description: This is a class for the shape of cone. This class extends Shape.
 *
 * @author Weilong Mao
 */
public class Cone extends Shape {
    /**
     * The radius of Cone.
     *
     * @Fields radius
     **/
    private double radius;

    /**
     * The constructor of Cone. Calculate its base area and volume at the same time.
     *
     * @param height
     * @param radius
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
     * @return double
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Set the radius of Cone.
     *
     * @param radius
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Cone's volume = 1/3 * PI *r^2 * h
     */
    @Override
    protected void calcVolume() {
        setVolume(getBaseArea() * getHeight() / 3.0);
    }

    /**
     * Cone's base area = PI * r^2
     */
    @Override
    protected void calcBaseArea() {
        setBaseArea(Math.PI * radius * radius);
    }
}
