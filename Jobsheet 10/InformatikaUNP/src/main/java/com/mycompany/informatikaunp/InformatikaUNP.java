/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.informatikaunp;

/**
 *
 * Created By_22343062_Muhammad Zhidny Ilman
 * Latihan 3
 * 
 */
public class InformatikaUNP {

    public static void main(String[] args) {
        Mahasiswa informatika = new Mahasiswa();
        Mahasiswa elektronika = new Mahasiswa();
        
        informatika.nama = "Dian Islamiati";
        informatika.nim = 1;
        informatika.jur = " S1 Informatika";
        informatika.univ = " Universitas Negeri Padang";
        
        elektronika.nama = "Muhammad Zhidny Ilman";
        elektronika.nim = 2;
        elektronika.jur = " S1 Elektronika";
        elektronika.univ = " Universitas Negeri Padang";
        
        System.out.println("Data Mahasiswa Informatika");
        System.out.println("Nama\t : " + informatika.nama);
        System.out.println("Nim\t : " + informatika.nim);
        System.out.println("Jurusan\t : " + informatika.jur);
        System.out.println("Status\t : " + informatika.univ);
        
        System.out.println("======================================");
        
        System.out.println("Data Mahasiswa Elektronika");
        System.out.println("Nama\t : " + elektronika.nama);
        System.out.println("Nim\t : " + elektronika.nim);
        System.out.println("Jurusan\t : " + elektronika.jur);
        System.out.println("Status\t : " + elektronika.univ);
    }
}
