/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw4_b10509040;

/**
 *
 * @author gyc12
 */
public class Date {
        int year, month, day;

    public Date(int y, int m, int d) {
        year = y;
        month = m;
        day = d;
    }

    @Override
    public String toString() {
        return String.format("%04d/%02d/%02d",year,month,day);
    }

}
