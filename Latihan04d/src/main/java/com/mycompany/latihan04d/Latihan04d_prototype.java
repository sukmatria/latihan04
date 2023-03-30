/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.latihan04d;
import java.util.Scanner;
/**
 *
 * @author Aspire
 */
public class Latihan04d_prototype {
    public void pelanggan (){
        String nama, nopel;
        int pemakaianAir;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Nama  :");
        nama = keyboard.nextLine();
        
        System.out.print("No.Pelanggan  :");
        nopel = keyboard.nextLine();
        
        System.out.print("Pemakaian Air  :");
        pemakaianAir = keyboard.nextInt();
        
        int biayapakai = 0;
        
        
        if (pemakaianAir < 10)
        {
            biayapakai = pemakaianAir * 1000;
        }
        else if (pemakaianAir > 10 && pemakaianAir <=20)
        {
            biayapakai = ((pemakaianAir - 10)* 2000)+ (10*1000);
        }
        else if (pemakaianAir > 20)
        {
            biayapakai = ((pemakaianAir - 20)* 5000)+(10* 2000)+ (10*1000);
        }
        System.out.println("Biaya Pemakaian: " + biayapakai);
    }
}
