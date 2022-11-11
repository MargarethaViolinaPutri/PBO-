/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Jobsheet9.Tugas.Overriding;

/**
 *
 * @author User
 */
public class Stereotype {
    public static void main(String[] args){ 
        Manusia manusia = new Manusia();
        Manusia mhs = new Mahasiswa();
        Manusia dsn = new Dosen();
        
        Mahasiswa mhs1 = new Mahasiswa();
        Dosen dsn1 = new Dosen();
        
        manusia.bernafas();
        manusia.makan();
        
        mhs.makan();
        mhs1.tidur();
        
        dsn.makan();
        dsn1.lembur();
    }
}
