/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latihan04c;
import java.util.Scanner;
/**
 *
 * @author Aspire
 */
public class Latihan04c {
    String nama;
    String progdi;
    int nilai;
    
    public void inputdata(){
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Nama    :");
    nama = keyboard.nextLine();
    System.out.print("Program Studi    :");
    progdi = keyboard.nextLine();
    System.out.print("Nilai    :");
    nilai = keyboard.nextInt();
    
    System.out.print("Nilai Huruf    :");
    String nilaihrf;
    if (nilai >= 85 && nilai <=100){
        nilaihrf = "A";
    }
    else if (nilai > 70 && nilai <85){
        nilaihrf = "B";
    }
    else if (nilai > 60 && nilai <70){
        nilaihrf = "C";
    }
    else if (nilai > 50 && nilai <60){
        nilaihrf = "D";
    }
    else if (nilai > 0 && nilai <50){
        nilaihrf = "E";
    }

    else {
        nilaihrf = "error";
    }
    }
   
    
}
