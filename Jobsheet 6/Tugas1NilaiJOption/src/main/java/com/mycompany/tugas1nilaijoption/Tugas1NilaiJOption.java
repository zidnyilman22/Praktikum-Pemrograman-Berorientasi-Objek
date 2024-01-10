/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugas1nilaijoption;

/**
 *
 * Created By_22343062_Muhammad Zhidny Ilman 
 * Tugas 1 - JOptionPane
 */
import javax.swing.JOptionPane;

public class Tugas1NilaiJOption {
    public static void main(String[] args) {
        String input1 = JOptionPane.showInputDialog("Masukkan nilai ujian ke-1: ");
        double nilai1 = Double.parseDouble(input1);

        String input2 = JOptionPane.showInputDialog("Masukkan nilai ujian ke-2: ");
        double nilai2 = Double.parseDouble(input2);

        String input3 = JOptionPane.showInputDialog("Masukkan nilai ujian ke-3: ");
        double nilai3 = Double.parseDouble(input3);

        double rataRata = (nilai1 + nilai2 + nilai3) / 3;

        String output = "Rata-rata nilai ujian adalah: " + rataRata;

        if (rataRata >= 60) {
            output += " :-)";
        } else {
            output += " :-(";
        }

        JOptionPane.showMessageDialog(null, output);
    }
}