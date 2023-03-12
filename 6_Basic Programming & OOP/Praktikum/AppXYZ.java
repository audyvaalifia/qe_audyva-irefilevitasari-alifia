/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alterra.PraktikumAlterra;

import java.util.Scanner;
//AUDYVA IREFILEVITASARI ALIFIA
//SOAL PRIORITAS 2 NOMOR 1
/**
 *
 * @author VICTUS
 */
//Buatlah sebuah function dengan nama drawXYZ yang menjalankan proses dengan 
//menggunakan looping dan menerima satu parameter bernama height. Buatlah sebuah 
//pola kemunculan simbol X, Y, dan Z di print, dimana Y mewakili kelipatan ganjil, 
//Z mewakili kelipatan genap dan X khusus urutan kelipatan 3.
public class AppXYZ {
    public static void main(String[]args){
    App akun1 = new App("Dani");
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
         System.out.println("Selamat datang, " + this.nama + ". \nAnda ingin menggambar persegi dengan huruf XYZ?");
        System.out.print("Silakan masukkan jumlah panjang huruf yang mau di-looping : ");
        jumlah = dyv.nextInt();
            for(int i=1;i<=jumlah;i++){
                for(int j=1;j<=jumlah;j++){
                    if(j%3==0){
                        System.out.print("X");
                    }
                    else if(j%2!=0){
                        System.out.print("Y");
                    }
                    else if(j%2==0){
                        System.out.print("Z");
                    }
                }
   System.out.println(" ");
}       
            }
        }
    }

