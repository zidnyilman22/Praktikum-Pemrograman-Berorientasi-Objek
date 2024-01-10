/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.latihan3_polymorphismdynamic;

/**
 *
 * Created By_22343062_Muhammad Zhidny Ilman 
 */
public class Bank {
    float sukuBunga(){
        return 0;
    }
}

class BRI extends Bank {
    //overreding sukuBunga method
    float sukuBunga(){
        return 5.5f;
    }
}

class BNI extends Bank {
    // overriding sukubunga method
    float sukuBunga(){
        return 10.6f;
    }
}

class Mandiri extends Bank {
    // overriding sukuBunga method
    float sukuBunga(){
        return 9.4f;
    }
}