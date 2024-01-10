/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latihan3_polymorphismdynamic;

/**
 *
 * Created By_22343062_Muhammad Zhidny Ilman 
 */
public class LATIHAN3_PolymorphismDynamic {

    public static void main(String[] args) {
        // Creating variabel of Bank Class
        Bank B;
        B = new BRI();
        System.out.println("Tingkat Suku Bunga BRI Adalah : " + B.sukuBunga());
        B = new BNI();
        System.out.println("Tingkat Suku Bunga BNI Adalah : " + B.sukuBunga());
        B = new Mandiri();
        System.out.println("Tingkat Suku Bunga Mandiri Adalah : " + B.sukuBunga());
    }
}
