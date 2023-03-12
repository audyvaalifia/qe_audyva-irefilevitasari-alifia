/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alterra.PraktikumAlterra;

import java.util.Scanner;
//AUDYVA IREFILEVITASARI ALIFIA
//SOAL PRIORITAS 1 NOMOR 2

/**
 *
 * @author VICTUS
 */
public class AppPenjualan {
    public static void main(String[]args){
        App akun1 = new App("Dani");
        App akun2 = new App("Rita");
        App akun3 = new App("Iggy");
        akun1.jualbeli();
        System.out.println("#######################################");
        akun2.jualbeli();
        System.out.println("#######################################");
        akun3.jualbeli();
    }
}
   class App {
    String Nama;
    int hargaBeli;
    int hargaJual;

    App(String nama){
        this.Nama = nama;
    }

    public int setHargaBeli(int hargaBeli){
        return this.hargaBeli;
    }
    
    public int getHargaBeli(){
        return hargaBeli;
    }
    
    public int setHargaJual(int hargaJual){
        return this.hargaJual;
    }
    
    public int getHargaJual(){
        return hargaJual;
    }

    
    public void jualbeli() {

        System.out.println("Selamat datang, " + this.Nama + ". \nAnda kebingungan apakah Anda rugi atau tidak?"
                + " Silakan menggunakan sistem ini!");
        
        Scanner dyv = new Scanner(System.in);
        System.out.print("Silakan masukkan harga beli barang : ");
        hargaBeli = dyv.nextInt();

        System.out.print("Silakan masukkan harga jual barang : ");
        hargaJual = dyv.nextInt(); 

        if (hargaJual < hargaBeli ) {
            System.out.println("Sayang sekali, "+this.Nama+", Anda rugi sebesar Rp"+(hargaJual-hargaBeli));
            
        }
        else if(hargaJual > hargaBeli){
            System.out.println("Wah, Anda penjual yang keren, "+this.Nama+"! Anda memiliki keuntungan sebesar Rp"+(hargaJual-hargaBeli));
          }
        else {
            System.out.println("Anda tidak untung dan tidak rugi, coba lagi agar jualan Anda tidak sia-sia dan memiliki laba!");
        }
    }
}


