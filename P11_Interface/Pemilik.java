/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P11_Interface;

/**
 *
 * @author User
 */
public class Pemilik {
    public void beriMakan(InterfaceAnimal AnimalHabits){
       System.out.println("Suara Hewan Ini"); 
       AnimalHabits.animalSound();
       System.out.println("Hewan ini sedang tidur");
       AnimalHabits.sleep();
    
    }
}
