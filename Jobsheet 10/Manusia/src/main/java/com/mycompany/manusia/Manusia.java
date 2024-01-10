/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.manusia;

/**
 *
 * Created By_22343062_Muhammad Zhidny Ilman 
 * Latihan 2
 * 
 */
import java.util.Scanner;

public class Manusia {
    String nama, tempat_lahir, tgl_lahir;
    int berat_badan, tinggi_badan;
    
    public void inputdata(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan Nama Lengkap\t: ");
        nama = scanner.nextLine();
        System.out.println("Masukkan Tempat Lahir\t: ");
        tempat_lahir = scanner.nextLine();
        System.out.println("Masukkan Tanggal Lahir\t: ");
        tgl_lahir = scanner.nextLine();
        System.out.println("Masukkan Berat Badan\t: ");
        berat_badan = scanner.nextInt();
        System.out.println("Masukkan Tinggi Badan\t: ");
        tinggi_badan = scanner.nextInt();
    }
    
    public void identitas(){
        System.out.println("Nama Saya\t :" + nama);
        System.out.println("Tempat Lahir\t :" + tempat_lahir);
        System.out.println("Tanggal Lahir\t :" + tgl_lahir);
        System.out.println("Berat Badan\t :" + berat_badan);
        System.out.println("Tinggi Badan\t :" + tinggi_badan);
    }

    public static void main(String[] args) {
        Manusia A = new Manusia();
        A.inputdata();
        A.identitas();
    }
}