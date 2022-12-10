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
        SalariedEmploye_3015 SE = new SalariedEmploye_3015();
        CommisionEmployee_3015 CE = new CommisionEmployee_3015();
        ProjectPlanner_3015 PP = new ProjectPlanner_3015();
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        
        try{
            System.out.println("Data Pegawai");
            System.out.print("Nama: ");
            SE.Nama_3015 = br.readLine();
            System.out.print("NIP: ");
            SE.NIP_3015 = br.readLine();
            System.out.print("Gaji Pokok: ");
            SE.GajiPokok_3015 = Float.parseFloat(br.readLine());
            System.out.println("============================");
            SE.TampilData_3015();
            System.out.println(" ");
            
            System.out.print("Nama: ");
            CE.Nama_3015 = br.readLine();
            System.out.print("NIP: ");
            CE.NIP_3015 = br.readLine();
            System.out.print("GajiPokok: ");
            CE.GajiPokok_3015 = Float.parseFloat(br.readLine());
            System.out.print("Komisi: ");
            CE.Komisi_3015 = Float.parseFloat(br.readLine());
            System.out.print("Total Penjualan: ");
            CE.TotalPenjualan_3015 = Float.parseFloat(br.readLine());
            CE.TotalGaji_3015();
            System.out.println("============================");
            CE.TampilData_3015();
            System.out.println(" ");
            
            System.out.print("Nama: ");
            PP.Nama_3015 = br.readLine();
            System.out.print("NIP: ");
            PP.NIP_3015 = br.readLine();
            System.out.print("Gaji Pokok: ");
            PP.GajiPokok_3015 = Float.parseFloat(br.readLine());
            System.out.print("Komisi: ");
            PP.Komisi_3015 = Float.parseFloat(br.readLine());
            System.out.print("Total Hasil Proyek: ");
            PP.TotalHasilProyek_3015 = Float.parseFloat(br.readLine());
            PP.TotalGaji_3015();
            System.out.println("============================");
            PP.TampilData_3015();
            System.out.println(" ");
            
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
}
