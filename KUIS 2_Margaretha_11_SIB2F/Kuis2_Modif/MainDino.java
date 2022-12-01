/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kuis2;

import Kuis2.TyrannosaurusRex;
import Kuis2.Triceratops;
import Kuis2.Oviraptor;

/**
 *
 * @author User
 */
public class MainDino {
    public static void main(String[] args){
        Pemburu pm = new Pemburu();
        AnakPemburu apm = new AnakPemburu();
        
        TyrannosaurusRex ty = new TyrannosaurusRex("6,4 ton");
        ty.displayData();

        Triceratops tc = new Triceratops("12 ton");
        tc.displayData();
        
        Oviraptor ov = new Oviraptor("36 kg");
        ov.displayData();
        
        System.out.println();
        System.out.println("----Pemburu Dan Anak Pemburu----");
        pm.berburu(ty);
        System.out.println("================================");
        apm.mengambilTelur(ty);
        System.out.println("================================");
        apm.mengambilTelur(tc);
        System.out.println("================================");
        apm.mengambilTelur(ov);
    }
}
