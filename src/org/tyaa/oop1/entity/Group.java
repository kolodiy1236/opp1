/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.oop1.entity;

import java.math.BigDecimal;

/**
 *
 * @author student
 */
//Класс
public class Group {
    
    //Поля для экземпляров
    private int id;
    private String name;
    //public BigDecimal price;

    //Методы
    public int getId() {
        return id;
    }

    public void setId(int id) throws Exception {
        
        if (id >= 0) {
            
            this.id = id;
        } else {
            
            throw new Exception("id должен быть больше или равен 0");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
