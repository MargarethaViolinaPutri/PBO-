/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Jobsheet11_Interface.Tugas;

/**
 *
 * @author User
 */
public abstract class Binatang {
     protected String nama;
    protected int jmlKaki;
    
    Binatang (String nama, int jmlKaki){
        this.nama = nama;
        this.jmlKaki = jmlKaki;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public String getNama(){
        return nama;
    }
    public void setKaki(int jmlKaki){
        this.jmlKaki = jmlKaki;
    }
    public int getKaki(){
        return jmlKaki;
    }
    public void displayBinatang(){
        System.out.println("Nama       : "+this.nama);
        System.out.println("Jumlah Kaki: "+this.jmlKaki);
    }
}
