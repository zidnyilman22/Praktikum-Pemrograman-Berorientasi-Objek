/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.latihan6_encapsulation;

/**
 *
 * Created By_22343062_Muhammad Zhidny Ilman 
 */
public class EncapsulationBuah {
    //data members of class EncapsulationBuah
    private String namaBuah;
    private String hargaBuah;
    private String warnaBuah;
    
    //declaration of contructor
    public EncapsulationBuah(String namaBuah, String hargaBuah, String warnaBuah) {
        this.namaBuah = namaBuah;
        this.hargaBuah = hargaBuah;
        this.warnaBuah = warnaBuah;
    }
    
    //declaring setter for all fields
    public void setName(String namaBuah) {
        this.namaBuah = namaBuah;
    }
    public void setPrice(String hargaBuah) {
        this.hargaBuah = hargaBuah;
    }
    public void setColor(String warnaBuah) {
        this.warnaBuah = warnaBuah;
    }
    //declaring getter for all fields
    public String getName() {
        return namaBuah;
    }
    public String getPrice() {
        return hargaBuah;
    }
    public String getColor() {
        return warnaBuah;
    }
}
