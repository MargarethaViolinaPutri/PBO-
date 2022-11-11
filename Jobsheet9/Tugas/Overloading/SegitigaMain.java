    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Jobsheet9.Tugas.Overloading;

/**
 *
 * @author User
 */
public class SegitigaMain {
    public static void main(String[] args){ 
        Segitiga stg = new Segitiga(); 
        System.out.println("==== Tugas Overloading Segitiga ====");
        System.out.println("Total sudut 1 parameter:  "+stg.totalSudut(60));
    
        System.out.println("Total sudut 2 parameter: "+stg.totalSudut(60, 70));
        
        System.out.println("Keliling 2 parameter   : "+stg.keliling(6, 8)); 
        System.out.println("Keliling 3 parameter   : "+stg.keliling(6, 8, 10)); 
    }
}
