/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Jobsheet6.TugasJob6;

/**
 *
 * @author User
 */
public class MainTugas {
    public static void main(String[] args) { 
      DaftarGaji dg = new DaftarGaji(2); 
      Dosen d1 = new Dosen("2131762056", "Marcella A.", "Malang", 8, 300000);
      Dosen d2 = new Dosen("2141762057", "Rudyantoro Siswa", "Surabaya", 5, 400000);
      dg.addPegawai(d1, d1);         
      dg.addPegawai(d2, d2);         
      dg.printSemuaGaji(); 
    }
}
