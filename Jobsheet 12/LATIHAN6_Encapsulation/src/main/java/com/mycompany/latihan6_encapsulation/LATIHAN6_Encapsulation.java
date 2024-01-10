/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latihan6_encapsulation;

/**
 *
 * Created By_22343062_Muhammad Zhidny Ilman 
 */
public class LATIHAN6_Encapsulation {

    public static void main(String[] args) {
        // menggunakan contructor untuk menginisialisasi
        EncapsulationBuah Apel = new EncapsulationBuah("Apel","Rp. 3000","Merah");
        // menggunakan getter ke nilai
        System.out.println("Nama Buah : " + Apel.getName() + "\nHarga : " + Apel.getPrice() + "\nWarna : " + Apel.getColor());
        // update harga dan warna menggunakan setter
        Apel.setColor("Hijau");
        Apel.setPrice("Rp. 7000");
        System.out.println("\nInformasi Terkait Apel Setelah Di Update");
        // menggunakan getter untuk mendapatkan nilai
        System.out.println("Nama Buah : " + Apel.getName() + "\nHarga : " + Apel.getPrice() + "\nWarna : " + Apel.getColor());
    }
}
