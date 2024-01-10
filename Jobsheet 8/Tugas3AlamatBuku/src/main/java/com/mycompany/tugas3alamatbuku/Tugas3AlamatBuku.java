/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugas3alamatbuku;

/**
 *
 * @Created By_22343062_Muhammad Zhidny Ilman
 */
public class Tugas3AlamatBuku {

    public static void main(String[] args) {
        String[][] entry = {
            {"Florence", "735-1234", "Manila"},
            {"Joyce", "983-3333", "Quezon City"},
            {"Becca", "456-3322", "Manila"}
        };

        //iterasi array dan mencetak setiap entri
        for (int i = 0; i < entry.length; i++) {
            String name = entry[i][0];
            String telNumber = entry[i][1];
            String address = entry[i][2];

            System.out.println("Name : " + name);
            System.out.println("Tel. # : " + telNumber);
            System.out.println("Address : " + address);
            System.out.println();
        }
    }
}
