/*
B10509040_郭宜萱
 */
package hw10_polymorphism;

public class Sphere implements ThreeDimensionalShape {

    double radius;

    public Sphere(double r) {
        setRadius(r);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double r) {
        if (r >= 0) {
            radius = r;
        }
    }

    @Override
    public double getSurfaceArea() {
        return 4 * radius * radius * Math.PI;
    }

    @Override
    public double getVolume() {
        return   radius * radius * radius * Math.PI *4/3;
    }

    @Override
    public String toString() {
        return " is a Sphere:------------\nradius is " + getRadius() + "\nSurface Area is " + getSurfaceArea() + "\nVolume is " + getVolume();
    }
}
