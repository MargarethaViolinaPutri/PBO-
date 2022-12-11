/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Job12_Retha.Tugas;

/**
 *
 * @author User
 */
public class Plant {
    public void doDestroy(IDestroyable d) {
        if (d instanceof WalkingZombie) {
            ((WalkingZombie) d).destroyed();
        }else if (d instanceof JumpingZombie) {
            ((JumpingZombie) d).destroyed();
        }else if (d instanceof Barrier) {
            ((Barrier) d).destroyed();
        }
    }
}
