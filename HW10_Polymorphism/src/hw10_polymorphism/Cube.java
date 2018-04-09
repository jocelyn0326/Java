/*
B10509040_郭宜萱
 */
package hw10_polymorphism;

/**
 *
 * @author gyc12
 */
public class Cube implements ThreeDimensionalShape {

    double length;

    public Cube(int l) {
        setLength(l);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double l) {
        if (l >= 0) {
            length = l;
        }
    }

    @Override
    public double getSurfaceArea() {
        return 6 * length * length;
    }

    @Override
    public double getVolume() {
        return  length * length * length;
    }

    @Override
    public String toString() {
        return " is a Cube:------------\nlength is " + getLength() + "\nSurface Area is " + getSurfaceArea() + "\nVolume is " + getVolume();
    }
}
