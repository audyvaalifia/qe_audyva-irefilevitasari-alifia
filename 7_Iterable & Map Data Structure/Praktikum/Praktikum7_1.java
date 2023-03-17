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
//PRAKTIKUM 7 NOMOR 1
/**
 *
 * @author VICTUS
 */
public class Praktikum7_1 {
    public static void main(String[] args) {
        System.out.println("\n#####################################################"
                    + "#######################################################\n\t\t\t\t"
                + "SELAMAT DATANG\n-------------------------------------------------------------"
                + "------------------------------"
                + "\nSistem ini akan menggabungkan 2 array yang diberikan, dan apabila terdapat nama yang sama di data akan sistem gabung");
		        	
        
        P7Nomor1 praktikum = new P7Nomor1();
        Scanner dyv = new Scanner(System.in);
        String opsi,jawab = "y";   
        while(jawab.equalsIgnoreCase("y") ) {  
	        System.out.println("\nIngin menambah data?(Y/N?)");
                opsi = dyv.nextLine();
	        
	        if( opsi.equals("y") ) {
                    praktikum.sistem();
                } else if( opsi.equals("n") ) {
                    praktikum.sistemTampil();
                    System.exit(0);
	        }	
        }
    }
        static class P7Nomor1{
            String data;
            Set<String> Data = new LinkedHashSet<String>();
            
                public void sistem() {
                    Scanner dyv = new Scanner(System.in);
                    System.out.print("Silakan masukkan data: ");
                    data = dyv.nextLine(); 
                    Data.add(data);
                }
                
                public void sistemTampil()  {
                    System.out.println("Daftar data yang telah Anda masukkan: \n"+Arrays.toString(Data.toArray()));
              
    		
    }
        }
}
          