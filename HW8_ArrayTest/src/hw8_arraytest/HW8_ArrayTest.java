/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw8_arraytest;

import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author gyc12
 */
public class HW8_ArrayTest {

    static class CompareName implements Comparator< Student> {

        public int compare(Student x, Student y) {
            int diff = x.name.compareTo(y.name);
            if (diff != 0) {
                return diff;
            }
            return x.name.compareTo(y.name);
        }
    }

    static class CompareId implements Comparator< Student> {

        public int compare(Student x, Student y) {
            int diff = x.id.compareTo(y.id);
            return x.id.compareTo(y.id);
        }
    }
    static class CompareGrade implements Comparator< Student> {

        public int compare(Student x, Student y) {
            int diff = y.grade- x.grade ;
            if (diff != 0) {
                return diff;
            }
            return y.grade - x.grade;
        }
    }
    

    public static void main(String[] args) {
        Student students[] = {
            new Student("Caleb", "104992", 99),
            new Student("Derek", "102113", 88),
            new Student("Dylan", "101111", 12),
            new Student("Anthony", "009123", 13),
            new Student("Bruce", "102334", 12),
            new Student("Spike", "110222", 1)
        };
        display(students); 
        CompareName comp_name = new CompareName();
        Arrays.sort(students, comp_name);
        System.out.println("---------------------------------------After sorting Student's name---------------------------------------");
        display(students);
        CompareId comp_id = new CompareId();
        Arrays.sort(students, comp_id);
        System.out.println("---------------------------------------After sorting studeny's ID---------------------------------------");
        display(students);
         CompareGrade comp_grade = new CompareGrade();
        Arrays.sort(students, comp_grade);
        System.out.println("---------------------------------------After sorting Student's Grade---------------------------------------");
        display(students);

    }

    private static <T> void display(T x[]) {
        System.out.print("[");
        for (int i = 0; i < x.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(x[i]);
        }
        System.out.println("]");
    }

}
