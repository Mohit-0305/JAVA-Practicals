/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hierarchy;

/**
 *
 * @author knownperson
 */
public class heroes extends Army {
    protected int abilityLevel;
    protected String abilityName;
    heroes(String name,int hp,int dps,int level,int abilityLevel,String abilityName){
        this.abilityLevel = abilityLevel;
        this.abilityName = abilityName;
        super(name,hp,dps,level);
    }
}
