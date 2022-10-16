/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Jobsheet6.Percobaan2;

/**
 *
 * @author hp
 */
public class ClassB extends ClassA{
 private int z;
 
 public void setZ(int z){
 this.z = z;
 }
 public int getZ(){
 return z;
 }
 public void getNilaiZ(){
 System.out.println("nilai Z: "+z);
 }
 public void getJumlah(){
 System.out.println("jumlah : " + (getX()+getY()+z));
 }
}
    
