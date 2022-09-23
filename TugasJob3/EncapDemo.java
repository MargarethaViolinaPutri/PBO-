/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasJob3;

/**
 *
 * @author User
 */
public class EncapDemo {
    private String name;
    private int age;
    
    public String getName(){
        return name;
    }
    public void setName(String newName){
        name = newName;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int newAge){
        if(newAge >=18 && newAge <= 30){
          age = newAge;
          System.out.println("Umur Anda Sesuai 18-30 Tahun!");
        }
        else if(newAge < 18){
           System.out.println("Maaf Umur Anda Kurang Dari 18 Tahun!"); 
        } else if(newAge > 30){
            System.out.println("Maaf Umur Anda Lebih Dari 30 Tahun!");  
        }       
    }     
}
