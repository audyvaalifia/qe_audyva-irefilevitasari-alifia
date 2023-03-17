/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum7;
import java.util.*;
//AUDYVA IREFILEVITASARI ALIFIA
//PRAKTIKUM 7 NOMOR 3
/**
 *
 * @author VICTUS
 */
public class Praktikum7_6 {
    public static void main(String[] args) {
        System.out.println("\n#####################################################"
                    + "#######################################################\n\t\t\t\t"
                + "SELAMAT DATANG\n-------------------------------------------------------------"
                + "------------------------------"
                + "\nSistem ini akan menampilkan hasil dari penjumlahan angka dalam array dimana banyaknya angka yang dijumlahkan tergantung oleh inputan k Anda");
        
        Scanner dyv = new Scanner(System.in);
        System.out.print("Masukkan jumlah angka yang ingin Anda masukkan: ");
        int n = dyv.nextInt();
        System.out.println("Masukkan data angka: ");
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = dyv.nextInt();
        }
        System.out.print("Masukkan k: ");
        int k = dyv.nextInt();

        dyv.close();
        int z = arr.length;
        int jumlahMaks = P7Nomor6(arr, z, k);
        System.out.println(jumlahMaks);
    }
    
    private static int P7Nomor6(int arr[], int n, int k)
    {
        int jumlahMaks = 0;
        for (int i = 0; i + k <= n; i++) {
            int iter = 0;
            for (int j = i; j < i + k; j++) {
                iter += arr[j];
            }
            if (iter > jumlahMaks)
                jumlahMaks = iter;
        }
  
        return jumlahMaks;
    }



    
}
  

