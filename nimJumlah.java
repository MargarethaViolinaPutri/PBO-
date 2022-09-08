/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P1_PBO;

/**
 *
 * @author User
 */
public class nimJumlah {
    public static void main(String[] args){
        int array[]={2,1,4,1,7,6,2,0,5,6};
        int jumlah = 0;
        
        for (int i=0; i<array.length; i++) {
        jumlah +=array[i];
    } //tambah nilai dari elemen array ke total
        System.out.println("Total NIM adalah = "+ jumlah);    
    }
}
