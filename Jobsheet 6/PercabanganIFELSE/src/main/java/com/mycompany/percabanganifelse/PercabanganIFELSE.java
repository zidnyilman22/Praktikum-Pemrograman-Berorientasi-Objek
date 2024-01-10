/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.percabanganifelse;

/**
 *
 * Created By_22343062_Muhammad Zhidny Ilman
 */

import java.util.Scanner;

public class PercabanganIFELSE {

    public static void main(String[] args) {
        double total_pembelian, diskon = 0;
        
        Scanner dataMasuk = new Scanner (System.in);
        System.out.println("Masukan Total Pembelian : Rp ");
        total_pembelian = dataMasuk.nextDouble();
        
        if(total_pembelian >= 5000)
            diskon = 0.1 * total_pembelian;
        else
            diskon = 0.2 * total_pembelian;
        
        System.out.println("Besarnya diskon : Rp " + diskon);
    }
}
