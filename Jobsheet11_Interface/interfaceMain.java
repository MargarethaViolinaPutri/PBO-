/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Jobsheet11_Interface;
import Jobsheet11_Interface.ICumlaude;
import Jobsheet11_Interface.Mahasiswa;
import Jobsheet11_Interface.PascaSarjana;
import Jobsheet11_Interface.Rektor;
import Jobsheet11_Interface.Sarjana;

/**
 *
 * @author User
 */
public class interfaceMain {
    public static void main(String[] args){
        Rektor pakrektor = new Rektor();
        
        Mahasiswa mhsBiasa = new Sarjana("Charlie");
        Sarjana sarjanaCumlaude = new Sarjana("Dini");
        PascaSarjana masterCumlaude = new PascaSarjana("Elok");
        
//        pakrektor.beriSertifikatCumlaude(mhsBiasa);
        pakrektor.beriSertifikatCumlaude(sarjanaCumlaude);
        pakrektor.beriSertifikatCumlaude(masterCumlaude);

    }
}
