/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TgsUml;

/**
 *
 * @author User
 */
public class Toyota extends Mobil{
    public void tampilkan(){
        double besarsilinder;
        String bahanbakar;
        String kategori;

        besarsilinder=4;
        bahanbakar="Pertalite";
        kategori="Low Multi Purpose Vehicle (LMPV)";

        Mobil m = new Mobil();

        m.inputData("AVANZA", "Merah", "Ekonomis", 5);
        m.tampilkandata();

        System.out.println("silinder :"+besarsilinder);
        System.out.println("jenis bahan bakar :"+bahanbakar);
        System.out.println("jenis kategori :"+kategori);
    }
}
