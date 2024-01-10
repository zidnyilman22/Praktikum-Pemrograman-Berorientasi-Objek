/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latihan4_abstractclass;

/**
 *
 * Created By_22343062_Muhammad Zhidny Ilman 
 */
public class LATIHAN4_AbstractClass {

    public static void main(String[] args) {
        // object induk tidak bisa di buat disini
        
        // buat object anak umur 1 tahun baru
        AnakUmur1Tahun a1 = new AnakUmur1Tahun();
        
        // panggil method anak umur 1 tahun
        a1.makan();
        a1.minum();
        a1.namaAyahKu();
        System.out.println();
    }
}
