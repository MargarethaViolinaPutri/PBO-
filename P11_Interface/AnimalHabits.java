/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P11_Interface;

/**
 *
 * @author User
 */
public class AnimalHabits {
    protected String kebiasaan;
    
    public AnimalHabits(String kebiasaan){
        this.kebiasaan=kebiasaan;
    }
    public void kebiasaan(){
        System.out.println("Aku hewan yang memiliki kebiasaan "+ this.kebiasaan);
        System.out.println("Aku bahagia sekali menjadi hewan");
    }
}
