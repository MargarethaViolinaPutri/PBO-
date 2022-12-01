/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kuis2;

/**
 *
 * @author User
 */
public class TyrannosaurusRex extends Dinosaurus{
    private String berat;
    
    public TyrannosaurusRex (String berat) {
        this.berat = berat;
    }
    
    @Override
    public void makan() {
       System.out.println("TyrannosaurusRex Makanan Daging");
    }
    @Override
    public void berjalan() {
        System.out.println("Berjalan Dengan 2 Kaki Belakang");
    }
    public void jenis() {
        System.out.println("Jenis Karnivora");
    }
    public void berkembangBiak(){
        System.out.println("Berkembang Biak dengan Bertelur");
    }
    public void nama(){
        System.out.println("TyrannosaurusRex"); 
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
