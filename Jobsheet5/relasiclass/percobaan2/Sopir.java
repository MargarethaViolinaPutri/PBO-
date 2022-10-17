/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package retha.relasiclass.percobaan2;

/**
 *
 * @author User
 */
public class Sopir {
    private String nama;
    private int biaya;
    
    Sopir(){
    }
    void setNama(String nama){
        this.nama = nama;
    }
    String getNama(){
        return nama;
    }
    void setBiaya(int biaya){
        this.biaya = biaya;
    }
    int getBiaya(){
        return biaya;
    }
    int hitungBiayaSopir(int hari){
        return biaya * hari;
    }
}
