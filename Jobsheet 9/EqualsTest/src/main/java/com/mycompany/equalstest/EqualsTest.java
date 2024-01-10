/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.equalstest;

/**
 *
 * Created By_22343062_Muhammad Zhidny Ilman
 */
public class EqualsTest {

    public static void main(String[] args) {
        String str1, str2;
        str1 = "Free the bound periodicals.";
        str2 = str1;
        System.out.println("String 1 : " + str1);
        System.out.println("String 2 : " + str2);
        System.out.println("Same object? " + (str1 == str2));
        
        System.out.println("Same value? " + str1.equals(str2));
    }
}