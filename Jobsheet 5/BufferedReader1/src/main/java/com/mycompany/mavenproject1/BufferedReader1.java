/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

/**
 *
 * Created By_22343062_Muhammad Zhidny Ilman 
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BufferedReader1 {

    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));

        String a, b;
        float angka1, angka2, jumlah;
        System.out.println("Program Penjumlahan Dua Buah Bilangan :");

        try {
            System.out.print("Masukkan Angka Pertama : ");
            a = dataIn.readLine();

            // Data yang akan diproses aritmatika harus dikonversikan dulu
            // dari tipe data String ke tipe data angka yang diperlukan.
            // Data yang diperoleh dari inputan kelas BufferedReader tipe datanya selalu string
            angka1 = Float.parseFloat(a); // konversi string ke float

            System.out.print("Masukkan Angka Kedua : ");
            b = dataIn.readLine();
            angka2 = Float.parseFloat(b); // konversi string ke float

            jumlah = angka1 + angka2;
            System.out.println("Jumlah : " + jumlah);
        } catch (IOException e) {
            System.out.println("Gagal Membaca Keyboard");
        }
    }
}