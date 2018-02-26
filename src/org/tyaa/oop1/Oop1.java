/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.oop1;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.tyaa.oop1.entity.*;

/**
 *
 * @author student
 */
public class Oop1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        
        //int x = 10;
        //String s = "sdafsd";
        //String s2 = new String("sdafsd");
        
        Group group = new Group();
        try {
            //group.id = -23;
            group.setId(23);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        group.setName("group1");
        
        Group group2 = new Group();
        try {
            group2.setId(24);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        group2.setName("group2");
        
        System.out.println(group.getId());
        
        Student student = new Student();
        student.setId(-12);
        student.setFirstName("st1");
        student.setLastName("l_st1");
        student.setGroupId(23);
        
        Student student2 = new Student();
        student2.setId(13);
        student2.setFirstName("st2");
        student2.setLastName("l_st2");
        student2.setGroupId(23);
        
        Student student3 = new Student();
        student3.setId(14);
        student3.setFirstName("st3");
        student3.setLastName("l_st3");
        student3.setGroupId(24);
        
        //System.out.println(student.id);
    }
}
