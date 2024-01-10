/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.testpastbyvalue;

/**
 *
 * Created By_22343062_Muhammad Zhidny Ilman
 */
public class TestPastByValue {

    public static void main(String[] args) {
        int i = 10;
        System.out.println(i);
        
        test(i);
        System.out.println(i);
    }
    
    public static void test(int j){
        j = 33;
    }
}