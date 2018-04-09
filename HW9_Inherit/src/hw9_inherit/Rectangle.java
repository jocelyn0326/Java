/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw9_inherit;

/**
 *
 * @author gyc12
 */
public class Rectangle extends Quadrilateral {

    double r_width, r_height, r_area;

    
    
    public Rectangle(double x1, double y1, double width, double height) {
        super(x1, y1, x1 + width, y1, x1+width, y1+height, x1 , y1+ height);
    }

    public double getWidth() {
        r_width = p2.x - p1.x;
        System.out.println(r_width);
        return r_width;
    }

    public double getHeight() {
        r_height =  p1.y-p4.y;
        return r_height;
    }

    public double getArea() {
        r_area = r_width * r_height;
        return r_area;
    }

    public String toString() {
        return p1 + "," + p2 + "," + p3 + "," + p4 + "\n" + "Width is:" + getWidth() + "\nHeight is:" + getHeight()+ "\nArea is:" + getArea();
    }

}
