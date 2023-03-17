/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum7;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
//AUDYVA IREFILEVITASARI ALIFIA
//PRAKTIKUM 7 NOMOR 5
/**
 *
 * @author VICTUS
 */
public class Praktikum7_5 {
    public static void main(String[] args) {
        P7Nomor5 praktikum = new P7Nomor5();
        System.out.println("\n#####################################################"
                    + "#######################################################\n\t\t\t\t"
                + "SELAMAT DATANG\n-------------------------------------------------------------"
                + "------------------------------"
                + "\nSistem ini akan menampilkan jumlah data tanpa duplikat dari data yang Anda inputkan");
        praktikum.sistem();
        praktikum.sistemTampil();
		        
    }
    static class P7Nomor5{
            int data;
            Set<Integer> Data = new LinkedHashSet<Integer>();
            
                public void sistem() {
                    int n;  
                    Scanner dyv = new Scanner(System.in);  
                    System.out.print("\nMasukkan jumlah data yang hendak diinputkan: ");  
                    n = dyv.nextInt();   
                    System.out.println("Silakan masukkan data: ");
                    for(int i=0; i<n; i++)  
                    {  
                        data = dyv.nextInt();
                        Data.add(data);

                    }  
                    for (int i=0; i<n; i++) ; 
                }
                
                public void sistemTampil()  {
                    System.out.println("Daftar data yang telah Anda masukkan: "+Arrays.toString(Data.toArray()));
                    System.out.println("Jumlah data: "+(Data.toArray()).length);
              
    		
    }
        }
}          
    
    
        