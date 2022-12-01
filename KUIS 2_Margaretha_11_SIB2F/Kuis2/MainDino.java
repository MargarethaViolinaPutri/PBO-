/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kuis2_Margaretha;


/**
 *
 * @author User
 */
public class MainDino {
    public static void main(String[] args){
        Pemburu pm = new Pemburu();
        AnakPemburu apm = new AnakPemburu();
        
        TyrannosaurusRex ty = new TyrannosaurusRex();
        Triceratops tc = new Triceratops();
        Oviraptor ov = new Oviraptor();
        
        pm.berburu(ty);
        System.out.println("==============================");
        apm.mengambilTelur(tc);
        
        System.out.println();
        System.out.println("Pemburu dan Anak Pemburu Melihat Dinosaurus: ");
        System.out.println();
        System.out.println("1. TyrannosaurusRex");
        ty.makan();
        System.out.println("2. Triceratops");
        tc.makan();
        System.out.println("3. Oviraptor");
        ov.makan();
        ov.bertelur();
    }
}
