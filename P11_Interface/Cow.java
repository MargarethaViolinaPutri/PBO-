/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P11_Interface;

/**
 *
 * @author User
 */
public class Cow extends AnimalHabits implements InterfaceAnimal {
    
    public Cow(String kebiasaan){
        super(kebiasaan);
    }
    
    @Override
    public void animalSound(){
        System.out.println("The cow says: mooo mooo");
    }
    @Override
    public void sleep(){
         System.out.println("Zzzz");
    }
}
