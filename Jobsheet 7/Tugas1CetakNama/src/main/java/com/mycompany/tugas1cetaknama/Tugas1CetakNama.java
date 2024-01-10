/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugas1cetaknama;

/**
 *
 * Created By_22343062_Muhammad Zhidny Ilman 
 * Buatlah program untuk mencetak nama masing-masing sebanyak 100 kali dengan 
menggunakan pernyataan perulangan for, while, dan do-while.
*/

public class Tugas1CetakNama {

    public static void main(String[] args) {
        String nama = "Zhidny";
        
        //menggunakan perulangann for
        System.out.println("Perluangan For :");
        for (int i = 1; i <=100; i++){
            System.out.println(i + ". " + nama);
        }
        
        //menggunakan perulangan while
        System.out.println("Perulangan While :");
        int j = 1;
        while ( j <= 100){
            System.out.println(j + ". " + nama);
            j++;
        }
        
        //menggunakan perulangan do-while
        System.out.println("Perulangan Do - While :");
        int k = 1;
        do{
            System.out.println(k + ". " + nama);
            k++;
        } while ( k <= 100);
    }
    }
