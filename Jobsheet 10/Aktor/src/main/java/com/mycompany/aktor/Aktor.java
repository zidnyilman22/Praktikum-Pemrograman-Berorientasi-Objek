/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aktor;

/**
 *
 * Created By_22343062_Muhammad Zhidny Ilman 
 * Latihan 3
 * 
 */
public class Aktor {
    String nama;
    int umur;
    
    Aktor(String n, int u){ // aktor adalah constructor
        nama = n;
        umur = u;
    }
    
    void tampilAktor(){
        System.out.println("Namaku\t : " + nama);
        System.out.println("Umurku\t : " + umur + " tahun");
    }

    public static void main(String[] args) {
        Aktor a;
        
        a = new Aktor("Ronaldo", 33);
        a.tampilAktor();
        System.out.println("=====================");
        
        a = new Aktor("Messi", 34);
        a.tampilAktor();
        System.out.println("=====================");
    }
}
