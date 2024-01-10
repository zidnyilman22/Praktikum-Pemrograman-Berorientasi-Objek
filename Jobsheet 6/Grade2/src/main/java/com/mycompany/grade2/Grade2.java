/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.grade2;

/**
 *
 * Created By_22343062_Muhammad Zhidny Ilman 
 */
public class Grade2 {

    public static void main(String[] args) {
        int grade = 92;
        
        switch(grade / 10) { // jika grade tidak sama dengan salah satu dari nilai dibawah, itu akan mencetak "Sorry, you Failed"
            case 10:
                System.out.println("Excellent");
                break;
            case 9:
                System.out.println("Good Job");
                break;
            case 8:
                System.out.println("Study Harder");
                break;
            default:
                System.out.println("Sorry, you Failed");
        }
    }
}
