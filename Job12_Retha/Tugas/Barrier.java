/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Job12_Retha.Tugas;

/**
 *
 * @author User
 */
public class Barrier implements IDestroyable{
    private int strength;
    
    public Barrier(int strength){
        this.strength = strength;
    }
    public void setStrength(int strength){
        this.strength=strength;
    }
    public int getStrength(){
        return strength;
    }
    public String getBarrierInfo(){
        return "Barrier Strength ="+strength;
    }
    @Override
    public void destroyed() {
        strength -=(strength*0.1);
    }

}
