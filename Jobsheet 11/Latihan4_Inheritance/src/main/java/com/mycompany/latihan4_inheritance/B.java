/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.latihan4_inheritance;

/**
 *
 * Created By_22343062_Muhammad Zhidny Ilman 
 */
public class B extends A {
    private int b;
    
    public void setB(int nilai) {
        b = nilai;
    }
    
    public int getB() {
        return b;
    }
    //melakukan override terhadap method tampilkanNilai()
    //yang terhadap pada kelas A
    public void tampilkanNilai() {
        super.tampilkanNilai(); //memanggil method dalam kelas A
        System.out.println("nilai b = " + getB());
    }
}
