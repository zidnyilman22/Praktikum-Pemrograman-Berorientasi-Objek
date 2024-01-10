/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.testor;

/**
 *
 * Created By_22343062_Muhammad Zhidny Ilman
 */
public class TestOR {

    public static void main(String[] args) {
        int i = 0;
        int j = 10;
        boolean test = true;
        
        //demontrasi ||
        test = ( i < 10 ) || ( j++ > 9 );
        System.out.println(i);
        System.out.println(j);
        System.out.println(test);
        
        // demontrasi |
        test = ( 1 < 10 ) | ( j++ > 9 );
        System.out.println(i);
        System.out.println(j);
        System.out.println(test);
        
    }
}
