/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugas1nilai;

/**
 *
 * Created By_22343062_Muhammad Zhidny Ilman
 * Tugas 1 - BufferedReader
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tugas1Nilai {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Masukkan nilai ujian ke-1: ");
            double nilai1 = Double.parseDouble(reader.readLine());

            System.out.print("Masukkan nilai ujian ke-2: ");
            double nilai2 = Double.parseDouble(reader.readLine());

            System.out.print("Masukkan nilai ujian ke-3: ");
            double nilai3 = Double.parseDouble(reader.readLine());

            double rataRata = (nilai1 + nilai2 + nilai3) / 3;

            System.out.println("Rata-rata nilai ujian adalah: " + rataRata);

            if (rataRata >= 60) {
                System.out.println(":-)");
            } else {
                System.out.println(":-(");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}