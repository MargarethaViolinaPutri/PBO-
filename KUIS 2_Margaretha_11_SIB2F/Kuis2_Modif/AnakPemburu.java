/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kuis2;

/**
 *
 * @author User
 */
public class AnakPemburu extends Pemburu implements IMengambilTelur{

    @Override
    public void mengambilTelur(Dinosaurus dino) {
        System.out.println("Anak Pemburu Memantau Telur Dinosaurus!!");
        dino.makan();
    }
    
}
