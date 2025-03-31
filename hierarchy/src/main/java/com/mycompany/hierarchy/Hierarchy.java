/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hierarchy;

/**
 *
 * @author knownperson
 */
public class Hierarchy{

    public static void main(String[] args) {
        System.out.println("Hello World!");
        //barbarian(String name,int hp,int dps,int level,int houseingSpace,int movementSpeed){
        barbarian b = new barbarian("barbarian 23",100,50,5,1,20);
        System.out.println("Army Details: " + b);
        System.out.println("Hit Point : " + b.HP);
        System.out.println("Damage Per Seconds : " + b.DSP);
        System.out.println("Level : " + b.level);
        System.out.println("Name : " + b.name);
        System.out.println("Housing Space : " + b.housingSpace);
        
    }
}
