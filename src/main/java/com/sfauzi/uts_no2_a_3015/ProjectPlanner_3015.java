/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sfauzi.uts_no2_a_3015;

/**
 *
 * @author S FAUZI
 */
public class ProjectPlanner_3015 {
    String nama_3015;
    int nip_3015, total_hasil_proyek_3015;
    double gaji_pokok_3015, komisi_3015, gaji_3015, pajak_3015;
    
    public void tampilDataProject_Planner_3015(){
        System.out.println("Nama                : "+nama_3015);
        System.out.println("NIP                 : "+nip_3015);
        System.out.println("Total Hasil Proyek  : "+total_hasil_proyek_3015);
        System.out.println("Gaji Pokok          : "+gaji_pokok_3015);
        System.out.println("Komisi              : "+komisi_3015);
        
    }
        public double InfogajiProject_3015(){
        pajak_3015 = (0.05 * gaji_pokok_3015);
        gaji_3015 = gaji_pokok_3015 + (komisi_3015 * total_hasil_proyek_3015) - pajak_3015; 
        return gaji_3015;
        
        }
}
