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
public class Employee {
   Person person;
   int salary;
   Date entry;
   Occupation occupation;
    public Employee(Person p, Occupation o, int s, Date d){
        person = p;
        salary = s;
        entry = d;
        occupation = o; 
    }
    public String toString(){
        return person + "  "+ occupation;
    }
}

