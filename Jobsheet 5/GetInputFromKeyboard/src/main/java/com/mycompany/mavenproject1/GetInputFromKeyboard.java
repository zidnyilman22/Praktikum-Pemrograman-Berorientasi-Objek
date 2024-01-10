/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

/**
 *
 * Created By_22343062_Muhammad Zhidny Ilman 
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
  
public class GetInputFromKeyboard {

    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader (new InputStreamReader (System.in));
        
        String name = "", hoby = "";
        
        try {
            System.out.println("Nama Anda : ");
            name = dataIn.readLine();
            System.out.println("Hobi Anda : ");
            hoby = dataIn.readLine();
        }
        
        catch (IOException e) {
            System.out.println("Gagal Membaca Keyboard");
        }
        System.out.println("Jadi Hobi Anda " + hoby + ". Hobi Yang Bagus " + name);
    }
}
