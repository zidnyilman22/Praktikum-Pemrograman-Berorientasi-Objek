/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latihan5_inheritance;

/**
 *
 * Created By_22343062_Muhammad Zhidny Ilman 
 */
public class Latihan5_Inheritance {

    public static void main(String[] args) {
        //membuat objek busMini dari kelas Bus
        Bus busMini = new Bus();
        
        /*
            memasukkan nilai jumlah penumpang dan
            penumpang maksimal ke dalam obkel busMini
        */
        busMini.penumpang = 5;
        busMini.maxPenumpang = 15;
        
        //memanggil method cetak pada kelas Bus
        busMini.cetak();
        
        //menambahkan jumlah penumpang pada busMini
        busMini.penumpang = busMini.penumpang + 5;
        //memanggil method cetak pada kelas Bus
        busMini.cetak();
        
        //mengurangi jumlah penumpang pada busMini
        busMini.penumpang = busMini.penumpang - 2;
        //memanggil method cetak pada kelas Bus
        busMini.cetak();
        
        //menambahkan jumlah penumpang pada busMini
        busMini.penumpang = busMini.penumpang + 8;
        busMini.cetak();
    }
}
