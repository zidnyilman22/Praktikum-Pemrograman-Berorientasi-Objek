/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arraysample;

/**
 *
 * Created By_22343062_Muhammad Zhidny Ilman
 */
public class ArraySample {

    public static void main(String[] args) {
        int[] ages = new int[100];
        for (int i = 0; i < 100; i++){
            ages[i] = i + 1;
        }
        for (int i = 0; i < 100; i++){
            System.out.print(ages[i] + " ");
        }
    }
}