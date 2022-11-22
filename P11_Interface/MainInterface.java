/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P11_Interface;
import P11_Interface.AnimalHabits;
import P11_Interface.Cow;
import P11_Interface.InterfaceAnimal;
import P11_Interface.MainInterface;
import P11_Interface.Pemilik;
import P11_Interface.Pig;
/**
 *
 * @author User
 */
public class MainInterface {
    public static void main(String[] args) {

      Pemilik p = new Pemilik();
      AnimalHabits ah = new AnimalHabits("Suka Berkelompok");
      Cow cw = new Cow("Suka Berkelompok");
      Pig pg = new Pig("Suka Berkelompok");
    
      p.beriMakan(cw);
      p.beriMakan(pg);
    }
}
