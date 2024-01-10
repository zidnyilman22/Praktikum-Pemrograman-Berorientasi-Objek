/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.elevatortest;

/**
 *
 * Created By_22343062_Muhammad Zhidny Ilman 
 */
public class Elevator {
    public boolean doorOpen = false;
    public int currentFloor = 5;
    public final int TOP_FLOOR = 5;
    public final int BOTTOM_FLOOR = 1;

    public void openDoor(){
        System.out.println("\nOpening Door.");
        doorOpen = true;
        System.out.println("Door is open");
    }

    public void closeDoor(){
        System.out.println("\nClosing Door.");
        doorOpen = false;
        System.out.println("Door is close.");
    }

    public void goUp(){
        System.out.println("\nGoing Up One FLoor.");
        currentFloor++;
        System.out.println("Floor : "+ currentFloor);
    }
        
    public void goDown(){
        System.out.println("\nGoing Down One FLoor.");
        currentFloor--;
        System.out.println("Floor : "+currentFloor);
    }
        
    public void setFloor(int desiredFLoor){
        while (currentFloor != desiredFLoor){
            if (currentFloor < desiredFLoor){
                goUp();
            }
            else {
                goDown();
            }
        }
        }
    
    public int getFloor() {
        return currentFloor;            
    }
        
    public boolean chechDoorStatus() {
        return doorOpen;
    }
}