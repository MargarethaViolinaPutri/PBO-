/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package retha.relasiclass.percobaan4;

/**
 *
 * @author User
 */
public class Gerbong {
    private String kode;     
    private Kursi[] arrayKursi;          
    
    Gerbong(String kode, int jumlah){         
        this.kode = kode;         
        this.arrayKursi = new Kursi[jumlah];         
        this.initKursi();     
    }   
    private void initKursi(){         
        for(int i = 0; i < arrayKursi.length; i++){             
        this.arrayKursi[i] = new Kursi(String.valueOf(i+1));         
        }     
    }
    void setKode(String kode){
        this.kode = kode; 
    }
    String getKode(){         
        return kode;     
    }     
    void setPenumpang(Penumpang penumpang, int nomor){         
        if(this.arrayKursi[nomor-1].getPenumpang()!=null) {
            System.out.println("Maaf, Kursi telah dipesan!");
        } else{
            this.arrayKursi[nomor-1].setPenumpang(penumpang);
        }     
    }     
    Kursi[] getArrayKursi(){         
        return arrayKursi;     
    } 
    String info(){         
        String info = "";         
        info += "Kode: " +kode+"\n";         
            for(Kursi kursi : arrayKursi){             
                info+= kursi.info();         
            }         
    return info;     
    }
     
}
