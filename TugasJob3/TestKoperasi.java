/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasJob3;

import java.util.Scanner;

/**
 *A
 * @author User
 */
public class TestKoperasi {
    public static void main(String[] args){
        Anggota donny = new Anggota("2141762056", "Donny", 5000000);
        Scanner sc = new Scanner(System.in);
        System.out.println("Nama Anggota: "+donny.getNama());
        char pilih = 0;
        int menu;
        do{
          System.out.println("Silahkan Pilih Menu : ");
          System.out.println("1. Tampilkan Data Anggota ");
          System.out.println("2. Jumlah Pinjaman ");
          System.out.println("3. Angsuran ");
          System.out.println("4. Keluar ");
          System.out.print("Masukkan Pilihan Menu : ");
          menu = sc.nextInt();
          switch(menu){
              case 1 : {
                  do{
                      System.out.println("Nama          : "+donny.getNama());
                      System.out.println("No. KTP       : "+donny.getNoKTP());
                      System.out.println("Limit Pinjaman: "+donny.getLimitPinjam());
                  } while (pilih == 'Y' || pilih == 'y');
              }
              break;
              case 2 : {
                  System.out.print("Jumlah Pinjaman Anda :");
                  int pinjam = sc.nextInt();
                  donny.pinjam(pinjam);
                  System.out.print("Jumlah Pinjaman Anda Saat Ini :"+donny.getJumlahPinjaman());
                  System.out.println("");
              } break;
              case 3 : {
                   System.out.print("Jumlah Angsuran Anda :");
                   int angsur = sc.nextInt();
                   donny.angsur(angsur);
                   System.out.println("Jumlah Pinjaman Anda Saat Ini :"+donny.getJumlahPinjaman());
              }break;
          }
        }while (menu > 0 && menu <=3);
    }
}
/*System.out.println("Limit Pinjaman: "+donny.getLimitPinjam());
        
        System.out.println("\nMeminjam uang 10.000.000... ");
        donny.pinjam(10000000);
        System.out.println("Jumlah Pinjam Saat Ini: "+donny.getJumlahPinjaman());
        
        System.out.println("\nMeminjam uang 4.000.000... ");
        donny.pinjam(4000000);
        System.out.println("Jumlah Pinjam Saat Ini: "+donny.getJumlahPinjaman());
    
        System.out.println("\nMembayar angsuran 150.000");
        donny.angsur(150000);
        System.out.println("Jumlah Pinjam Saat Ini: "+donny.getJumlahPinjaman());
        
        System.out.println("\nMembayar angsuran 3.000.000");
        donny.angsur(3000000);
        System.out.println("Jumlah Pinjam Saat Ini: "+donny.getJumlahPinjaman());*/
        
        
