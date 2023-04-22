/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alterra.PraktikumAlterra;
//AUDYVA IREFILEVITASARI ALIFIA
//SOAL PRIORITAS 2 NOMOR 1
/**
 *
 * @author VICTUS
 */
//Buatlah sebuah program kalkulator sederhana dengan fungsi penjumlahan, pengurangan, 
//perkalian dan pembagian. Input angka berada pada fungsi utama dan fungsi operasi diletakkan terpisah dengan fungsi utama.
// Saya menggunakan Inheritance ya bang
public class AppKalkulator {
    public static void main(String[] args) {
        System.out.println("Selamat datang di Sistem Kalkulator! Berikut ini adalah hasil hitung dari yang telah Anda inputkan!");       
        Addition a = new Addition(90,9);
        System.out.println(a.hasilHitung());
        Substraction b = new Substraction(12,42);
        System.out.println(b.hasilHitung());
        Multiply c = new Multiply(100,321);
        System.out.println(c.hasilHitung());
        Divide d = new Divide(729,8);
        System.out.println(d.hasilHitung());
        System.out.println("##############################################\nTerima kasih telah menggunkana sistem kami");
        
    }
    
    interface Hitung{
        double menghitung();
    }    

    static class Kalkulator {
        double angka1, angka2, hasil;
        
        public Kalkulator (double angka1, double angka2){
            this.angka1=angka1;
            this.angka2=angka2;
            }
    
        void setAngka1(double angka1){
            this.angka1= angka1;
        }
        double getAngka1(){
            return this.angka1;
        }
        
        void setAngka2(double angka2){
            this.angka2= angka2;
        }
        double getAngka2(){
            return this.angka2;
        }
        
    }
        
        
     static class Addition extends Kalkulator implements Hitung{
        public Addition(double angka1, double angka2){
            super(angka1, angka2);
     }
        @Override
        public double menghitung(){
            return angka1+angka2;
        }
            
        
        public String hasilHitung(){
            return "Penjumlahan: "+menghitung();
        }
    }
     
     static class Substraction extends Kalkulator implements Hitung{
        public Substraction(double angka1, double angka2){
            super(angka1, angka2);
     }
        @Override
        public double menghitung(){
            return angka1-angka2;
        }
            
        
        public String hasilHitung(){
            return "Pengurangan: "+menghitung();
        }
    }
     
     static class Multiply extends Kalkulator implements Hitung{
        public Multiply(double angka1, double angka2){
            super(angka1, angka2);
     }
        @Override
        public double menghitung(){
            return angka1*angka2;
        }
            
        
        public String hasilHitung(){
            return "Perkalian: "+menghitung();
        }
    }
     
     static class Divide extends Kalkulator implements Hitung{
        public Divide(double angka1, double angka2){
            super(angka1, angka2);
     }
        @Override
        public double menghitung(){
            return angka1/angka2;
        }
            
        
        public String hasilHitung(){
            return "Pembagian: "+menghitung();
        }
    }
     
     
        
    
 

    }
