/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sfauzi.uts_no2_a_3015;

/**
 *
 * @author S FAUZI
 */
public class CommisionEmployee_3015 extends Employee_3015 {
    public float Komisi_3015;
    public float TotalPenjualan_3015;
    public float Totalgaji_3015;
    
    public CommisionEmployee_3015(){
        
    }
    
    public float TotalGaji_3015(){
        Totalgaji_3015 = GajiPokok_3015 + (Komisi_3015 * TotalPenjualan_3015);
        return Totalgaji_3015;
    }
    
    public void TampilData_3015(){
        System.out.println("Commission Employee");
        Tampil();
        System.out.println("Total Gaji: " + Totalgaji_3015);
    }
}
