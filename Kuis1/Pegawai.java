/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kuis1;

/**
 *
 * @author User
 */
public class Pegawai {
    private String nama;
    private String NIP;
    private double gajiPokok=2000;
    private double uangLembur=0;
    private double uangMakan=0;
    private double uangTransport=0;
    private double totalHomePay;
    private int jumlahJamKerja;
    
    Pegawai(String nama, String NIP, int jumlahJamKerja){
        this.nama = nama;
        this.NIP = NIP;
        this.jumlahJamKerja = jumlahJamKerja;
    }
    Pegawai (){ 
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setNIP(String NIP){
        this.NIP = NIP;
    }
    public void setjumlahJamKerja(int angka){
        jumlahJamKerja = angka;
    }
    public String getNama(){
        return nama;
    }
    public String getNIP(){
        return NIP;
    }
    public int getJumlahJamKerja(){
        return jumlahJamKerja;
    }
    public double getGajiPokok(){
        return gajiPokok;
    }
    public double getUangLembur(){
        return uangLembur;
    }
    public double getUangMakan(){
        return uangMakan;
    } 
    public double getUangTransport(){
        return uangTransport;
    }
    public void hitungGajiHarian(){
        if(jumlahJamKerja >= 9){
            uangLembur = (jumlahJamKerja - 7)*gajiPokok*1.5;
            uangMakan = 3500;
            uangTransport=4000;
            totalHomePay = uangLembur+uangMakan+uangTransport+(gajiPokok*7);
        } else if(jumlahJamKerja >= 8) {
            uangMakan=3500;
            uangLembur = (jumlahJamKerja - 7)*gajiPokok*1.5;
            totalHomePay = uangLembur+uangMakan+(gajiPokok*7);
        } else if(jumlahJamKerja == 7){
            totalHomePay=gajiPokok*7;
        } else if(jumlahJamKerja < 7){
            totalHomePay = 0;
    }
    }
    public void cetakPenghasilan(){
        System.out.println("Nama                : "+ nama);
        System.out.println("NIP                 : "+ NIP);
        System.out.println("Jam Bekerja         : "+ jumlahJamKerja);
        System.out.println("Gaji Pokok          : "+ gajiPokok*7);
        System.out.println("Uang Lembur         : "+ uangLembur);
        System.out.println("Uang Makan          : "+ uangMakan);
        System.out.println("Uang Transport      : "+ uangTransport);
        System.out.println("Take Home Pay       : "+ totalHomePay);
    }

}
