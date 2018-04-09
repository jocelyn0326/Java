/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw7_filetest;


import java.io.*;

public class Members implements Serializable {

    String name, id, birthday, isStudent;

    public Members(String member) {
        String students[] = member.split("\t");
        if (students[0].indexOf("Name") == -1 && students[1].indexOf("ID") == -1) {
            name = students[0];
            id = students[1];
            birthday = students[2].substring(0, 4) + "/" + students[2].substring(4, 6) + "/" + students[2].substring(6);
            if (students[3].equals("Y")) {
                isStudent = "yes";
            } else {
                isStudent = "no";
            }
        }
    }

    public String toString(int i) {
        String str = i + ".";
        str += "\r\nName：" + name;
        str += "\r\nID：" + id;
        str += "\r\nBirthday：" + birthday;
        str += "\r\nMemberIsStudent：" + isStudent;
        str += "\r\n";
        return str;
    }
}
