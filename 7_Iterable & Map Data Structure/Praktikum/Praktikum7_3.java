/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum7;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
//AUDYVA IREFILEVITASARI ALIFIA
//PRAKTIKUM 7 NOMOR 3
/**
 *
 * @author VICTUS
 */
public class Praktikum7_3 {
    public static void main(String[] args) {
        System.out.println("\n#####################################################"
                    + "#######################################################\n\t\t\t\t"
                + "SELAMAT DATANG\n-------------------------------------------------------------"
                + "------------------------------"
                + "\nSistem ini akan menampilkan dua angka dari array yang Anda inputkan dimana apabila dijumlahkan hasilnya adalah target yang Anda inputkan");
        
        Scanner dyv = new Scanner(System.in);
        System.out.print("Masukkan jumlah angka yang ingin Anda masukkan: ");
        int n = dyv.nextInt();
        System.out.print("Masukkan data angka: ");
        int[] tambah = new int[n];

        for(int i = 0; i < n; i++) {
            tambah[i] = dyv.nextInt();
        }
        System.out.print("Masukkan target: ");
        int target = dyv.nextInt();

        dyv.close();

        int[] indices = P7Nomor3(tambah, target);

        if (indices.length == 2) {
            System.out.println(indices[0] + " " + indices[1]);
        } else {
            System.out.println("Error");
        }
    }
    
    private static int[] P7Nomor3(int[] tambah, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < tambah.length; i++) {
            int complement = target - tambah[i];
            if (numMap.containsKey(complement)) {
                return new int[] { numMap.get(complement), i };
            } else {
                numMap.put(tambah[i], i);
            }
        }
        return new int[] {};
    }



    
}
    

