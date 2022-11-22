/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P11_Interface.CobaLain;

/**
 *
 * @author User
 */
public class MainInterface {
    public static void main(String[] args){
        Pig pig = new Pig();
        Cow cow = new Cow();
        Crocodile cd = new Crocodile();
        
        pig.animalSound();
        pig.sleep();
        System.out.println("===========================");
        cow.animalSound();
        cow.sleep();
        cow.makanan();
        System.out.println("===========================");
        cd.animalSound();
        cd.sleep();
        cd.makanan();
    }
}
