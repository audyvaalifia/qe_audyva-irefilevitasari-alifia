/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum7;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
//AUDYVA IREFILEVITASARI ALIFIA
//PRAKTIKUM 7 NOMOR 2
/**
 *
 * @author VICTUS
 */
public class Praktikum7_2 {
    public static void main(String[] args){
        System.out.println("\n#####################################################"
                    + "#######################################################\n\t\t\t\t"
                + "SELAMAT DATANG\n-------------------------------------------------------------"
                + "------------------------------"
                + "\nSistem ini akan menampilkan data single (yang muncul 1 kali) dari data yang Anda inputkan");
		        
            int n;  
            Scanner dyv = new Scanner(System.in);  
            System.out.print("\nMasukkan jumlah data yang hendak diinputkan: ");  
            n = dyv.nextInt();  
            int[] arr = new int[n];  
            System.out.println("Masukkan data berupa angka: ");  
            for(int i=0; i<n; i++)  
            {  
            arr[i] = dyv.nextInt();  
            }  
            for (int i=0; i<n; i++)   
            {  
            }
            System.out.println(Arrays.toString(arr));    
		Arrays.sort(arr);
		int single = P7Nomor2(arr);
		if (single == -1) {
			System.out.println("Semua data double");
		}
		else {
			System.out.println("Data Anda yang muncul 1 kali: " + single);
		}
	}
        
    
	public static int P7Nomor2(int[] arr)
	{
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			int jmlh = map.getOrDefault(arr[i], 0);
			map.put(arr[i], jmlh + 1);
		}
		for (int i = 0; i < arr.length; i++) {
			if (map.get(arr[i]) == 1) {
				return arr[i];
			}
		}
		return -1; 
	}

	
}
