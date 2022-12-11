/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Job12_Retha.Tugas;

/**
 *
 * @author User
 */
public class WalkingZombie extends Zombie{
    public WalkingZombie(int health, int level) {
    this.health = health;
    this.level = level;
}
    
@Override
    public void heal(){
        if(level == 1){
            health += (health * 2/100);
        }else if(level == 2){
            health += (health * 3/100);
        }else{
            health += (health * 4/100);
        }
    }

@Override

    public void destroyed() {
    health -= (health * 20/100);
}
    public String getZombieInfo() {
    return "Walking Zombie Data = \nHealth = " + this.health 
            + " \nLevel = " + this.level + "\n";
    }
}
