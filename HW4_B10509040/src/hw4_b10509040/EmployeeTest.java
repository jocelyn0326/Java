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
public class EmployeeTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person person1 = new Person("Jocelyn Guo", "gyc1233@gmail.com", "基隆路4段43號", 19);
        Employee employee1 = new Employee(person1, Occupation.Engineer, 35000, new Date(1998, 03, 26));
        System.out.println(employee1);
    }
    
}
