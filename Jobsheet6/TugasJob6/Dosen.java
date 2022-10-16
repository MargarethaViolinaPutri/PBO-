/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Jobsheet6.TugasJob6;

/**
 *
 * @author User
 */
public class Dosen extends Pegawai{
    public int jumlahSKS;     
    public int tarif_SKS;          
    
    public Dosen(String nip, String nama, String alamat, int jumlahSKS, int tarif_SKS){         
        super(nip, nama, alamat);         
        this.jumlahSKS = jumlahSKS;         
        this.tarif_SKS = tarif_SKS;     
    }     
    public void setSKS(int sks){         
        this.jumlahSKS = jumlahSKS;     
    }     
    public int getGaji(){         
        int gaji = (jumlahSKS * tarif_SKS);        
    return gaji; 
    }
}
