/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugas2bilangancase;

/**
 *
 * Created By_22343062_Muhammad Zhidny Ilman
 * Tugas 2 - Bilangan ( SWITCH-CASE )
 */
import java.util.Scanner;

public class Tugas2BilanganCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka antara 1 hingga 10: ");
        int angka = input.nextInt();

        switch (angka) {
            case 1:
                System.out.println("Satu");
                break;
            case 2:
                System.out.println("Dua");
                break;
            case 3:
                System.out.println("Tiga");
                break;
            case 4:
                System.out.println("Empat");
                break;
            case 5:
                System.out.println("Lima");
                break;
            case 6:
                System.out.println("Enam");
                break;
            case 7:
                System.out.println("Tujuh");
                break;
            case 8:
                System.out.println("Delapan");
                break;
            case 9:
                System.out.println("Sembilan");
                break;
            case 10:
                System.out.println("Sepuluh");
                break;
            default:
                System.out.println("Invalid number");
                break;
        }
    }
}