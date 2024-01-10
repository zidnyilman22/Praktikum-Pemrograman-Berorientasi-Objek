/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugas2cetakangka;

/**
 *
 * Created By_22343062_Muhammad Zhidny Ilman 
 * Gunakan perulangan for, while, dan do-while untuk menghasilkan tampilan dari 
angka 100 sampai angka 1.
 */
public class Tugas2CetakAngka {

    public static void main(String[] args) {
        
        //menggunakan perulangann for
        System.out.println("Perulangan For:");
        for (int i = 100; i >= 1; i--) {
            System.out.println(i);
        }

        //menggunakan perulangann while
        System.out.println("Perulangan While:");
        int j = 100;
        while (j >= 1) {
            System.out.println(j);
            j--;
        }

        //menggunakan perulangann do-while
        System.out.println("Perulangan Do - While:");
        int k = 100;
        do {
            System.out.println(k);
            k--;
        } while (k >= 1);
    }
}
