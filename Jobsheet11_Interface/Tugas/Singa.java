/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Jobsheet11_Interface.Tugas;

/**
 *
 * @author User
 */
public class Singa extends Binatang implements Karnivora{
    private String suara, warnaBulu;

    
    public Singa(String nama, int jmlKaki, String suara, String warnaBulu) {
        super(nama, jmlKaki);
        this.suara = suara;
        this.warnaBulu = warnaBulu;
    }

    @Override
    public void displayMakan() {
        System.out.println("Makanan   : Daging");
    }
    public void displayBinatang() {
        System.out.println("Jenis     : Karnivora");
    }
    public void displayData() {
        System.out.println("---------Binatang---------");
        this.displayBinatang();
        this.displayMakan();
        super.displayBinatang();
        System.out.println("Suara      :"+ this.suara);
        System.out.println("Warna Bulu :"+ this.warnaBulu);
    }
}
