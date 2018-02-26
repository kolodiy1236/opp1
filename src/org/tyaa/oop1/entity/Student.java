/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.oop1.entity;

/**
 *
 * @author student
 */
public class Student {
    
    private int id;
    private String firstName;
    private String lastName;
    private int groupId;

    public void setId(int id) throws Exception {
        
        if (id >= 0) {
            
            this.id = id;
        } else {
            
            throw new Exception("id должен быть больше или равен 0");
        }
    }
 
    //public void setId(int id) {
       // this.id = id;
   // }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

   
}
