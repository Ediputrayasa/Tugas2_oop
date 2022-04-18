/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas2_oop;

/**
 *
 * @author I Kadek Edi Putrayasa_20103115
 */
public class Hitungvolume {
    private double panjang;
    private double lebar;
    private double tinggi;
    double volume;
    
    
    public void setPJ (double NPJ){
        this.panjang = NPJ;
    }
    public void setLB (double NLB){
        this.lebar = NLB;
    }
    public void setTG (double NTG){
        this.tinggi = NTG;
    }
public void Hitungvolume (double PJ, double LB, double TG){  
    this.setPJ (PJ);
    this.setLB (LB);
    this.setTG (TG);

    this.panjang = PJ;
    this.lebar = LB;
    this.tinggi = TG;
}
    
    private double volumebalok (){
        this.volume = this.panjang*this.lebar*this.tinggi;
        return this.volume;
    }
    
    public void printhasil(){
        this.volumebalok();
        System.out.println("Hitung Volume Balok");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Nilai Panjang       :"+this.panjang+"cm");
        System.out.println("Nilai Lebar         :"+this.lebar+"cm");
        System.out.println("Nilai Tinggi        :"+this.tinggi+"cm");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Jadi Volume Balok   :"+this.volume+"cm");
        
    }
}
