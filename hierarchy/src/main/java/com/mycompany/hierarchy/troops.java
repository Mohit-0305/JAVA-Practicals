/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hierarchy;

/**
 *
 * @author knownperson
 */
public class troops extends Army {
    protected int housingSpace;
    troops(String name,int hp,int dps,int level,int houseingSpace){
        this.housingSpace = houseingSpace;
        super(name,hp,dps,level);
    }
}
