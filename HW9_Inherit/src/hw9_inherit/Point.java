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
public class Point {

     double x, y;

    public Point(double xCoordinate, double yCoordinate) {
        setX(xCoordinate);
        sety(yCoordinate);
    }

    public void setX(double x) {
        x = x;
    }

    public void sety(double yCoordinate) {
        y = yCoordinate;
    }

    public double getx() {
        return x;
    }

    public double gety() {
        return y;
    }

    public String toString(){
        return "(" + getx() + ","+ gety() + ")";        
    }
    
}
