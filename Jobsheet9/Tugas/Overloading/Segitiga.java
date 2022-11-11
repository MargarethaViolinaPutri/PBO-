/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Jobsheet9.Tugas.Overloading;

/**
 *
 * @author User
 */
public class Segitiga {
    private int sudut;
    
   public int totalSudut(int sudutA){         
        this.sudut = 180-sudutA;         
        return sudut;     
    }
   public int totalSudut(int sudutA, int sudutB){ 
        this.sudut = 180 - (sudutA+sudutB);         
        return sudut;
    }
    public int keliling(int sisiA, int sisiB, int sisiC){         
        return sisiA+sisiB+sisiC;
    }
    public double keliling(int sisiA, int sisiB){ 
         double c = Math.sqrt(Math.pow(((double)sisiA),2)
                 +Math.pow(((double)sisiB),2));
    return sisiA+sisiB+c;
    }
}
