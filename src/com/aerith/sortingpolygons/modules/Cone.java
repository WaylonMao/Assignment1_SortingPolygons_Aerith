package com.aerith.sortingpolygons.modules;

/**
 * Class description:
 *
 * @author Weilong Mao
 */
public class Cone extends Shape {

    private double radius;

    public Cone(double height, double radius) {
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
        // volume = 1/3 * PI *r^2 * h
        setVolume(getBaseArea() * getHeight() / 3.0);
    }

    @Override
    protected void calcBaseArea() {
        // base area = PI * r^2
        setBaseArea(Math.PI * radius * radius);
    }
}
