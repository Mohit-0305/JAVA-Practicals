/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hierarchy;

/**
 *
 * @author knownperson
 */
public class airType extends troops {
    protected int flySpeed;
    airType(String name,int hp,int dps,int level,int housingSpace,int flySpeed){
        this.flySpeed = flySpeed;
        super(name,hp,dps,level,housingSpace);
    }
}
