/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P11_Interface.CobaLain;

/**
 *
 * @author User
 */
public class Pig implements InterfaceAnimal{
    
    @Override
    public void animalSound() {
       System.out.println("The Pig Says: grokk grokk grokk");
    
}

    @Override
    public void sleep() {
        System.out.println("Babi tidur Zzzzzz");
    }
}
