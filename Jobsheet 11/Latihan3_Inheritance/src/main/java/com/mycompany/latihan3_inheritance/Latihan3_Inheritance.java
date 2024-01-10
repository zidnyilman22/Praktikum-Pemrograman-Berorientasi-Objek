/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latihan3_inheritance;

/**
 *
 * Created By_22343062_Muhammad Zhidny Ilman 
 */
public class Latihan3_Inheritance extends Hewan {
    //meng-overwrite method pada class Hewan
    public static void testClassMethod() {
        System.out.println("The Class MEthod in Hewan");
    }
    
    public void testInstanceMethod() {
        System.out.println("The Instance Method in Gajah");
    }

    public static void main(String[] args) {
        Latihan3_Inheritance myLatihan3_Inheritance = new Latihan3_Inheritance();
        Hewan myHewan = myLatihan3_Inheritance;
        Hewan.testClassMethod();
        myHewan.testInstanceMethod();
    }
}
