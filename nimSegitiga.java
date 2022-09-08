/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P1_PBO;

/**
 *
 * @author User
 */
public class nimSegitiga {
        public static void main (String[] args){
        int array[] = {2,1,4,1,7,6,2,0,5,6};   
        int i =0;
        while (i<array.length){
            int j=array.length;
            while (j > i){
                System.out.print(j);
                j--;    
            }
            int k = 1;
            while ( k <= 1){
                System.out.println(i + " ");
                k++;
            }
            System.out.println();
            i++;
        }
         System.out.println();
        }
    }
/*public static void main(String[] args) {
    int rows = 3, k = 0, hitung = 0, hitung1 = 0;

    for (int i = 1; i <= rows; ++i) {
      for (int space = 1; space <= rows - i; ++space) {
        System.out.print("  ");
        ++hitung;
      }

      while (k != 2 * i - 1) {
        if (hitung <= rows - 1) {
          System.out.print((i + k) + " ");
          ++hitung;
        } else {
          ++hitung1;
          System.out.print((i + k - 2 * hitung1) + " ");
        }

        ++k;
      }
      hitung1 = hitung = k = 0;

      System.out.println();
    }
  }*/
    
