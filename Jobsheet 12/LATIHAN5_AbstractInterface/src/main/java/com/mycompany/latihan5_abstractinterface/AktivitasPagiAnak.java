/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.latihan5_abstractinterface;

/**
 *
 * Created By_22343062_Muhammad Zhidny Ilman 
 */
class AktivitasPagiAnak implements AktivitasPagi {
    @Override
    public void lari() {
        System.out.println("Aktivitas Pertama Pagi Ini Adalah Lari Pagi");
    }

    @Override
    public void berenang() {
        System.out.println("Aktivitas Kedua Pagi Ini Adalah Berenang");
    }
}

interface AktivitasPagi {
    void lari();
    void berenang();
}
