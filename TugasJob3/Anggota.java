/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasJob3;

/**
 *
 * @author User
 */
public class Anggota {
    private String noKTP;
    private String nama;
    private int limitPinjam;
    private int jumlahPinjam;
  
    
    Anggota(String noKTP, String nama, int limitPinjam){
        this.noKTP = noKTP;
        this.nama = nama;
        this.limitPinjam = limitPinjam;
    }
    
    public String getNama(){
        return nama;
    }
    public String getNoKTP(){
        return noKTP;
    }
    public int getLimitPinjam(){
        return limitPinjam;
    }
    public int getJumlahPinjaman(){
        return jumlahPinjam;
    }
    public void pinjam(int angka){
        if(angka > limitPinjam){
            System.out.println("Maaf, jumlah pinjaman melebihi limit.");
        } else {
            jumlahPinjam=angka;
        }
    }
    public void angsur (int angka){
        if(angka >= 0.1 *jumlahPinjam && jumlahPinjam !=0){
            jumlahPinjam -= angka;
        } else{
            System.out.println("Maaf, Angsuran Harus 10% Dari Jumlah Pinjaman");
        }
    }
}
