/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package retha.relasiclass.percobaan3;

/**
 *
 * @author User
 */
public class KeretaApi {
    private String nama;
    private String kelas;
    private Pegawai masinis;
    private Pegawai asisten;
    
    KeretaApi(String nama, String kelas, Pegawai masinis){
        this.nama = nama;
        this.kelas = kelas;
        this.masinis = masinis;
    }
    KeretaApi(String nama, String kelas, Pegawai masinis, Pegawai asisten){         
        this.nama = nama;         
        this.kelas = kelas;         
        this.masinis = masinis;         
        this.asisten = asisten;     
    }     
    void setNama(String nama){         
        this.nama = nama;    
    }     
    String getNama(){         
        return nama;     
    }     
    void setKelas(String kelas){         
        this.kelas = kelas;     
    }     
    String getKelas(){         
        return kelas;     
    }     
    void setMasinis(Pegawai masinis){         
        this.masinis = masinis;     
    }     
    Pegawai getMasinis(){         
        return masinis;     
    }     
    void setAsisten(Pegawai asisten){         
        this.asisten = asisten;     
    }     
    Pegawai getAsisten(){         
        return asisten;     
    }     
    String info(){         
        String info = "";         
        info += "Nama: " + this.nama + "\n";         
        info += "Kelas: " + this.kelas + "\n";         
        info += "Masinis: " + this.masinis.info() + "\n";         
        info += "Asisten: " + this.asisten.info() + "\n";         
        return info;     
    } 
    String info2(){
        String info2= "";
        info2 += "Nama: " + this.nama + "\n";         
        info2 += "Kelas: " + this.kelas + "\n";         
        info2 += "Masinis: " + this.masinis.info() + "\n";                
        return info2;  
    }
}
