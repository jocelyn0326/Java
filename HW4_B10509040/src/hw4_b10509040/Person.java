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
public class Person {
        String name;
    String email;
    String address;
    int age;

    public Person(String n, String e, String ad, int ag) {
        name = n;
        email = e;
        address = ad;
        age = ag;
    }

    public String toString()  {
        return "name:" + name+ " ;email:"+email+" ;address:"+ address+" ;age:"+ age;
                
    }
}
