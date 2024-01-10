/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mobilutama;

/**
 *
 * Created By_22343062_Muhammad Zhidny Ilman 
 * Latihan 1
 * 
 */
public class MobilUtama {

    public static void main(String[] args) {
        Mobil Honda = new Mobil();
        Honda.merk = "Civic";
        Honda.warna = "Hitam";
        Honda.tahunProduksi = 2020;
        System.out.println("Merk\t " + Honda.merk);
        System.out.println("Warna\t " + Honda.warna);
        System.out.println("Tahun\t " + Honda.tahunProduksi);
        Honda.Maju();
        Honda.Maju();
        Honda.Mundur();
    }
}
