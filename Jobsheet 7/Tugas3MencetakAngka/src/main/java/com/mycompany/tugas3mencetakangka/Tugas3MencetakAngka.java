/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugas3mencetakangka;

/**
 *
 * Created By_22343062_Muhammad Zhidny Ilman
 * Dengan menggunakan perulangan bersarang (nested loop) buatlah program yang 
hasil tampilannya seperti di bawah ini :
1
22
333
4444
55555
 */
public class Tugas3MencetakAngka {

    public static void main(String[] args) {
         int n = 5; //baris yang ingin dicetak

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
