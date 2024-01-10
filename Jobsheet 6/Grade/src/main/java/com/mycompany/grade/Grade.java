/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.grade;

/**
 *
 * Created By_22343062_Muhammad Zhidny Ilman
 */

public class Grade {

    public static void main(String[] args) {
        double grade = 92.0;
        
        if(grade >= 90){
            System.out.print("Excellent");
        }
        /* Untuk menentukan kondisi yang mempunyai nilai rentangan maka 
        tentukan nilai batas atas dan batas setelah itu digabungkan dengan
        logika AND (&&)
        */
        else if((grade < 90) && (grade >= 80)) { // 80 s.d 89
            System.out.println("Good Job");
        }
        else if((grade < 80) && (grade >= 60)) { // 60 s.d 75
            System.out.println("Study Harder");
        }
        else {
            System.out.println("Sorry, You Failed");
        }
    }
}
