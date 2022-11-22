/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P11_Interface.CobaLain;

/**
 *
 * @author User
 */
public class Cow implements InterfaceAnimal, IAnimal_Food{

    @Override
    public void animalSound() {
       System.out.println("The Cow Says: moo moo moo");
    
}

    @Override
    public void sleep() {
        System.out.println("Sapi tidur Zzzzzz");
    }
    
     @Override
    public void makanan() {
        System.out.println("Sapi makan rumput");
    }
}
