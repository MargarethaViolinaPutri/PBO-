/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kuis1;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class PegawaiMain {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Pegawai p1 = new Pegawai();
        int menu;
        String nama, NIP;
        int angka;
        do{
          System.out.println("=============================");
          System.out.println("GAJI HARIAN PEGAWAI PT XYZ");
          System.out.println("=============================");
          System.out.println("Silahkan Pilih Menu : ");
          System.out.println("1. Masukkan Inputan");
          System.out.println("2. Tampilkan Hasil Gaji ");
          System.out.println("3. Keluar ");
          System.out.print("Masukkan Pilihan Menu : ");
          menu = sc.nextInt();
          switch(menu){
              case 1 : {
                      System.out.print("Masukkan NIP        : ");
                      NIP = sc.next();
                      System.out.print("Masukkan Nama       : ");
                      nama = sc.next();
                      System.out.print("Masukkan Jam Kerja  : ");
                      angka = sc.nextInt();
                      p1.setNIP(NIP);
                      p1.setNama(nama);
                      p1.setjumlahJamKerja(angka);
              }  
              break;
              case 2 : {
                  p1.hitungGajiHarian();
                  p1.cetakPenghasilan();
              } break;
          }
        }while (menu > 0 && menu <=2);
        System.out.print("THANK YOU:):)");
    }
}
