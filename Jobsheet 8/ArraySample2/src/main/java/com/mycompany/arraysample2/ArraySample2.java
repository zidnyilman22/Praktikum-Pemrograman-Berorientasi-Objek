/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arraysample2;

/**
 *
 * Created By_22343062_Muhammad Zhidny Ilman
 */
public class ArraySample2 {

    public static void main(String[] args) {
        int[] ages = new int[100];
        
        for (int i = 0; i < ages.length; i++){
            ages[i] = i + 1;
        }
        for (int i = 0; i < ages.length; i++){
            System.out.println(ages[i] + " ");
        }
    }
}
