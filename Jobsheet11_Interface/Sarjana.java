/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Jobsheet11_Interface;

/**
 *
 * @author User
 */
public class Sarjana extends Mahasiswa implements ICumlaude, IBerprestasi{
    public Sarjana (String nama){
        super(nama);
    }
    @Override
    public void lulus(){
        System.out.println("Aku sudah menyelesaikan SKRIPSI");
    }

    @Override
    public void meraihIPKTinggi() {
        System.out.println("IPK-ku lebih dari 3,51");
    }
    @Override
    public void kuliahDiKampus() {
        super.kuliahDiKampus();
    }
     @Override
    public void menjuaraiKompetisi() {
      System.out.println("Saya telah menjuarai kompetisi NASIONAL");
    }

    @Override
    public void membuatPublikasiIlmiah() {
        System.out.println("Saya menerbitkan artikel di jurnal NASIONAL");
    }
}
