/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alterra.PraktikumAlterra;

import java.util.Scanner;
//AUDYVA IREFILEVITASARI ALIFIA
//SOAL PRIORITAS 2 NOMOR 2
/**
 *
 * @author VICTUS
 */
public class AppBintang {
    public static void main(String[]args){
    App akun1 = new App("Rita");
    akun1.jumlah();
}
    static class App{        
        int jumlah;
        String nama;
        
        App(String nama){
        this.nama = nama;
    }     
        
        public void jumlah(){
    
        Scanner dyv = new Scanner(System.in);
         System.out.println("Selamat datang, " + this.nama + ". \nAnda ingin menggambar segitiga dengan bintang?");
        System.out.print("Silakan masukkan jumlah panjang bintang ke bawah: ");
        jumlah = dyv.nextInt();
            for (int i = 1; i<=jumlah ; i++) { 
          for (int j = i; j<=jumlah; j++) {
             System.out.print(" ");
          }
          for (int j = 1; j< i; j++) { 
             System.out.print("*");
          }
          for (int j = 1; j<=i; j++) {
             System.out.print("*");
          }
          System.out.println();
}       
            }
        }
    }


