/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kuis2_Margaretha;

/**
 *
 * @author User
 */
public class Oviraptor extends Dinosaurus implements IBertelur{
    public void makan(){
        System.out.println("Oviraptor Pemakan Telur");
    }
    public void berjalan(){
        System.out.println("Oviraptor Berjalan Di Hutan");
    }
    
    @Override
    public void bertelur() {
       System.out.println("Berkembang Biak Dengan Bertelur");
    }
}
