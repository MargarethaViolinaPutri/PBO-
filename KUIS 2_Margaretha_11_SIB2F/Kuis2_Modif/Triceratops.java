/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kuis2;

/**
 *
 * @author User
 */
public class Triceratops extends Dinosaurus{
 private String berat;
    
    public Triceratops (String berat) {
        this.berat = berat;
    }
    
    @Override
    public void makan() {
       System.out.println("Triceratops Makanan Tumbuhan");
    }
    @Override
    public void berjalan() {
        System.out.println("Berjalan Dengan 4 Kaki");
    }
    public void jenis() {
        System.out.println("Jenis Herbivora");
    }
    public void berkembangBiak(){
        System.out.println("Berkembang Biak dengan Bertelur");
    }
    public void nama(){
        System.out.println("Triceratops"); 
    }
    public void displayData() {
        System.out.println("---------Dinosaurus ---------");
        this.nama();
        this.jenis();
        this.berkembangBiak();
        this.makan();
        System.out.println("Berat"+ this.berat);
        this.berjalan();
    }
}
