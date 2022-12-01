/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kuis2;

/**
 *
 * @author User
 */
public class Oviraptor extends Dinosaurus implements IBertelur{
private String berat;
    
    public Oviraptor (String berat) {
        this.berat = berat;
    }
    
    @Override
    public void makan() {
       System.out.println("Oviraptor Makan Telur Dinosaurus");
    }
    @Override
    public void berjalan() {
        System.out.println("Berjalan Dengan 2 Kaki Belakang");
    }
    @Override
    public void bertelur() {
       System.out.println("Berkembang Biak Dengan Bertelur");
    }
    public void jenis() {
        System.out.println("Karnivora");
    }
    public void nama(){
        System.out.println("Oviraptor"); 
    }
    public void displayData() {
        System.out.println("---------Dinosaurus ---------");
        this.nama();
        this.jenis();
        this.bertelur();
        this.makan();
        System.out.println("Berat"+ this.berat);
        this.berjalan();
    }
}
