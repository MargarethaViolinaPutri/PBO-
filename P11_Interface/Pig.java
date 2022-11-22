/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P11_Interface;

/**
 *
 * @author User
 */
public class Pig extends AnimalHabits implements InterfaceAnimal{
    public Pig(String kebiasaan){
        super(kebiasaan);
    }
    @Override
    public void animalSound(){
        System.out.println("The pig says: wee wee");
    }
    @Override
    public void sleep(){
        System.out.println("ZZZzzzz");
    } 
}
