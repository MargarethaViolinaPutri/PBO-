/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Jobsheet11_Interface.Tugas;

/**
 *
 * @author User
 */
public class BinatangMain {
    public static void main(String[] args){
        Keledai k = new Keledai("Keledai", 4, "Hehehe", "Abu-Abu");
        Gorilla g = new Gorilla("Gorilla", 4, "Haaum Hauum", "Hitam Manis");
        Singa s = new Singa("Singa", 4, "Roaar Roaarr", "Cokelat");
        
        k.displayData();
        g.displayData();
        s.displayData();
    }
}
