/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.latihan4_abstractclass;

/**
 *
 * Created By_22343062_Muhammad Zhidny Ilman 
 */
abstract class Orang {
    public String namaAyah = " R Ade Garbada GN";
    abstract void makan();
    public void minum(){
        System.out.println("Minum Air Teh dan Kopi");
    }
}

class AnakUmur1Tahun extends Orang {
    
    public void namaAyahKu(){
        System.out.println("Nama Ayahku Adalah " + namaAyah);
    }
    
    @Override
    public void makan() {
        System.out.println("Anak Umur 1 Tahun Makan Asi");
    }
    
    @Override
    public void minum() {
        System.out.println("Anak Umur 1 Tahun Minum Asi");
    }
}