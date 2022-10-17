/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package retha.relasiclass.percobaan4;

/**
 *
 * @author User
 */
public class Penumpang {
    private String ktp;     
    private String nama;    

    Penumpang(String ktp, String nama){         
        this.ktp = ktp;         
        this.nama = nama;     
    }    
    void setKtp(String ktp){         
        this.ktp = ktp;     
    }     
    String getKtp(){         
        return ktp;     
    }     
    void setNama(String nama){         
        this.nama = nama;     
    }     
    String getNama(){         
        return nama;    
    }     
    String info(){         
        String info = "";        
        info += "Ktp: " + ktp + "\n";         
        info += "Nama: " + nama + "\n";         
        return info;      
    } 
}
