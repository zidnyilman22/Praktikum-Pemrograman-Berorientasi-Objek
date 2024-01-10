/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latihan1_inheritance;

/**
 *
 * Created By_22343062_Muhammad Zhidny Ilman 
 */
public class LATIHAN1_Inheritance {

    public static void main(String[] args) {
        // Membuat objek kendaraan roda dua
        RodaDua sepeda = new RodaDua();
        // Membuat objek kendaraan roda empat
        RodaEmpat mobil = new RodaEmpat();
        
        sepeda.tampilkanHarga();
        sepeda.hargaAkhir();
        
        mobil.tampilkanHarga();
        mobil.hargaAkhir();
    }
}
