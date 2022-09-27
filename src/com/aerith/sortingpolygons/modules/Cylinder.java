package com.aerith.sortingpolygons.modules;

/**
 * Class description:
 *
 * @author Weilong Mao
 */
public class Cylinder extends Shape {

    private double radius;

    public Cylinder(double height, double radius) {
        super();
        setHeight(height);
        setRadius(radius);
        calcBaseArea();
        calcVolume();
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    protected void calcVolume() {
        // volume = PI * r^2 * h
        setVolume(getBaseArea() * getHeight());
    }

    @Override
    protected void calcBaseArea() {
        // base area = PI * r^2
        setBaseArea(Math.PI * radius * radius);
    }

}
