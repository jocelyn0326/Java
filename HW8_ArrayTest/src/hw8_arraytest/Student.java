/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw8_arraytest;

/**
 *
 * @author gyc12
 */
public class Student {
    String name;
    String id;
    int grade;

    public Student(String name, String id, int grade) {
        this.name = name;
        this.id = id;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return name+" "+id+" "+grade+" ";
    }

}
