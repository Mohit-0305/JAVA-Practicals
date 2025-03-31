/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hierarchy;

/**
 *
 * @author knownperson
 */
public class Army {
    protected String name;
    protected int HP;
    protected int DSP;
    protected int level;
    Army(String name,int hp, int dsp,int level){
        this.name = name;
        HP = hp;
        DSP = dsp;
        this.level = level;
    }
}
