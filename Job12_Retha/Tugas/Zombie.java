/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Job12_Retha.Tugas;

/**
 *
 * @author User
 */
abstract class Zombie implements IDestroyable{
    protected int health;
    protected int level;
    protected String ZombieInfo;
    
    public abstract void heal();
    public abstract void destroyed();
    public String getZombieInfo() {
    return ZombieInfo;
    }
}
