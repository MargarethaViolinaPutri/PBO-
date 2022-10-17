/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package retha.relasiclass.percobaan3;

/**
 *
 * @author User
 */
public class Pegawai {
    private String nip;
    private String nama;
    
    Pegawai(String nip, String nama){
        this.nip=nip;
        this.nama=nama;
    }
    void setNip(String nip){
        this.nip=nip;
    }
    String getNip(){
        return nip;
    }
    void setNama(String nama){
        this.nama=nama;
    }
    String getNama(){
        return nama;
    }
    String info(){
       String info = " ";
       info += "Nip : " + this.nip + "\n";
       info += "Nama : " + this.nama + "\n";
       return info;
    }
}
