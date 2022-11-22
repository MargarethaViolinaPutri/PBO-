/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P11_Interface.CobaLain;

/**
 *
 * @author User
 */
public class Crocodile implements InterfaceAnimal, IAnimal_Food{
    
    @Override
    public void animalSound() {
       System.out.println("The Crocodile Says: hallo hallo hallo");
    
}
    @Override
    public void sleep() {
        System.out.println("Aku tidur dulu yah");
    }
    
    @Override
    public void makanan() {
        System.out.println("Aku makan dulu yah");
    }
}
