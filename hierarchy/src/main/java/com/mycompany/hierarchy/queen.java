/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hierarchy;

/**
 *
 * @author knownperson
 */
public class queen extends heroes {
    protected String specialArrowType;
    queen(String name,int hp,int dps,int level,int abilityLevel,String abilityName, String specialArrowType){
        this.specialArrowType = specialArrowType;
        super(name,hp,dps,level,abilityLevel,abilityName);
    }
}
