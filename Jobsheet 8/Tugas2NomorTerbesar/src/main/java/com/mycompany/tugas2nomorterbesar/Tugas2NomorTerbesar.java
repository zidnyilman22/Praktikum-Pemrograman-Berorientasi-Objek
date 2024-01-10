/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugas2nomorterbesar;

/**
 *
 * Created By_22343062_Muhammad Zhidny Ilman 
 */

import javax.swing.JOptionPane;

public class Tugas2NomorTerbesar {

    public static void main(String[] args) {
        int n = 10; //jumlah angka yang akan dimasukkan
        int[] numbers = new int[n]; //array untuk menyimpan angka-angka

        for (int i = 0; i < n; i++) {
            String input = JOptionPane.showInputDialog("Masukkan Angka Ke- " + (i + 1) + ":");
            try {
                numbers[i] = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Input Tidak Valid. Masukkan Angka Lagi.");
                i--; 
            }
        }

        int max = numbers[0]; //inisialisasi dengan elemen pertama
        for (int i = 1; i < n; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        JOptionPane.showMessageDialog(null, "Angka terbesarnya adalah: " + max);
    }
}