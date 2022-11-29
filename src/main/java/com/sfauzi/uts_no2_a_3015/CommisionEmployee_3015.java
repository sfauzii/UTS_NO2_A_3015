/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sfauzi.uts_no2_a_3015;

/**
 *
 * @author S FAUZI
 */
public class CommisionEmployee_3015 {
     String nama_3015;
    int nip_3015, total_penjualan_3015;
    double gaji_pokok_3015, komisi_3015, gaji_3015;
    
    public void tampilDataCommission_Employee_3015(){
        System.out.println("Nama                : "+nama_3015);
        System.out.println("NIP                 : "+nip_3015);
        System.out.println("Total Penjualan     : "+total_penjualan_3015);
        System.out.println("Gaji Pokok          : "+gaji_pokok_3015);
        System.out.println("Komisi              : "+komisi_3015);
    }
    
    public double InfogajiCommission_3015(){
        gaji_3015 = gaji_pokok_3015 + (komisi_3015 * total_penjualan_3015);
        return gaji_3015;
    }
}
