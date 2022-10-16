/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Jobsheet6.TugasJob6;

/**
 *
 * @author User
 */
public class Pegawai {
    public String nip;     
    public String nama;     
    public String alamat;     
    public int gaji;          
    
    Pegawai(String nip, String nama, String alamat){         
        this.nip = nip;
        this.nama = nama;        
        this.alamat = alamat; 
    }
    public String getNama(){         
        return nama;     
    }     
    public int getGaji(){         
        return gaji;     
    }
}
