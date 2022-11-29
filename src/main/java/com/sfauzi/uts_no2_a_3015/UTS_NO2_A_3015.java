/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.sfauzi.uts_no2_a_3015;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author S FAUZI
 */
public class UTS_NO2_A_3015 {

    public static void main(String[] args) throws IOException{
        SalariedEmploye_3015 S = new SalariedEmploye_3015();
        CommisionEmployee_3015 C = new CommisionEmployee_3015();
        ProjectPlanner_3015 P = new ProjectPlanner_3015();
        
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
       try{
           S.nama_3015 = "Syahrul";
           S.nip_3015  = 21103015;
           S.upahmingguan_3015 = 900000;
          
           C.nama_3015 = "Fauzi";
           C.nip_3015  = 23543621;
           C.total_penjualan_3015 = 15;
           C.gaji_pokok_3015 = 1000000;
           C.komisi_3015 = 150000;
     
           P.nama_3015 = "S FAUZI";
           P.nip_3015 = 21124522;
           P.total_hasil_proyek_3015 = 50;
           P.gaji_pokok_3015 = 5000000;
           P.komisi_3015 = 3500000;
           
           S.tampilDataSalaried_Employee_3015();
           System.out.println(" ");
           C.tampilDataCommission_Employee_3015();
           System.out.println(" ");
           P.tampilDataProject_Planner_3015();
       }
       catch(Exception ex){
            System.out.println(ex);
        }
    }
}
