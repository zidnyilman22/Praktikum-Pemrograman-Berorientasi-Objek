/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugas2programmahasiswaclassandobject;

/**
 *
 * Created By_22343062_Muhammad Zhidny Ilman 
 * Tugas 2
 * 
 */

import java.util.Scanner;

class Mahasiswa {
    private final String nama;
    private final String nim;
    private final String semester;
    private final double ip;

    public Mahasiswa(String nama, String nim, String semester, double ip) {
        this.nama = nama;
        this.nim = nim;
        this.semester = semester;
        this.ip = ip;
    }

    public int hitungSksYangDapatDiambil() {
        if (ip >= 3.5) {
            return 24;
        } else if (ip >= 3.0) {
            return 22;
        } else if (ip >= 2.5) {
            return 20;
        } else if (ip >= 2.0) {
            return 18;
        } else {
            return 15;
        }
    }

    public void tampilkanInfo() {
        System.out.println("Nama Mahasiswa : " + nama);
        System.out.println("Nim : " + nim);
        System.out.println("Semester : " + semester);
        System.out.println("IP Semester Ini : " + ip);
        System.out.println("Anda Dapat Mengontrak  " + hitungSksYangDapatDiambil() + " SKS Pada Semester " + semester);
    }
}

public class Tugas2ProgramMahasiswaClassandObject {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Nama Mahasiswa : ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan NIM : ");
        String nim = scanner.nextLine();

        System.out.print("Masukkan Semester : ");
        String semester = scanner.nextLine(); // Menggunakan String untuk input semester

        System.out.print("Masukkan IP Semester Ini : ");
        double ip = scanner.nextDouble();

        Mahasiswa mahasiswa = new Mahasiswa(nama, nim, semester, ip);
        mahasiswa.tampilkanInfo();
    }
}
