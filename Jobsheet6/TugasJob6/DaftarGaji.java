/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Jobsheet6.TugasJob6;

/**
 *
 * @author User
 */
public class DaftarGaji {
   public Pegawai[] listPegawai;     
   public int jumlah;     
   public Dosen[] dosen;
   
    DaftarGaji(int jumlah){ 
        this.listPegawai = new Pegawai[jumlah];         
        this.dosen = new Dosen[jumlah]; 
    }
    public void addPegawai(Pegawai pegawai, Dosen dosen){ 
        this.listPegawai[jumlah] = pegawai; 
        this.dosen[jumlah] = dosen;
        jumlah++;
    }
    public void printSemuaGaji(){
        for(int i = 0; i < jumlah; i++){
          System.out.println("CETAK GAJI PEGAWAI"); 
          System.out.println("NIP        : "+listPegawai[i].nip); 
          System.out.println("Nama       : "+listPegawai[i].nama);
          System.out.println("Alamat     : "+listPegawai[i].alamat);
          System.out.println("---------------------------------");
          System.out.println("Total gaji : "+dosen[i].getGaji());
          System.out.println();    
        }
    }
}
