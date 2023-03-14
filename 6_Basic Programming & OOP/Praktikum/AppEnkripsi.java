/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alterra.PraktikumAlterra;
import java.util.Scanner;
//AUDYVA IREFILEVITASARI ALIFIA
//SOAL EKSPLORASI BP
/**
 *
 * @author VICTUS
 */
public class AppEnkripsi {
    public static void main(String[] args) {
        System.out.println("\n#####################################################"
                    + "#######################################################\n\t\t\t\tSISTEM "
                + "ENKRIPSI PESAN SEDERHANA\n-------------------------------------------------------------"
                + "------------------------------"
                + "\nSistem ini akan mengenkripsi pesan Anda"
                + " dengan menggeser 10 huruf dari tiap huruf plaintext yang Anda masukkan");
        Enkripsi enc = new Enkripsi();
        enc.Enkripsi();
    }
        
        static class Enkripsi{
            int geser = 10;
            String AfterEnc = "";
            char alphabet;
            
            
            public void Enkripsi(){
                Scanner sc = new Scanner(System.in);
                System.out.print("Silakan masukkan pesan yang ingin Anda enkripsi : ");
                String BeforeEnc = sc.nextLine();
                for(int i=0; i < BeforeEnc.length();i++) 
                {
                    alphabet = BeforeEnc.charAt(i);

                    if(alphabet >= 'a' && alphabet <= 'z') 
                    {
                     alphabet = (char) (alphabet + geser);
                     if(alphabet > 'z') {
                        alphabet = (char) (alphabet+'a'-'z'-1);
                     }
                     AfterEnc = AfterEnc + alphabet;
                    }

                    else if(alphabet >= 'A' && alphabet <= 'Z') {
                     alphabet = (char) (alphabet + geser);    

                     if(alphabet > 'Z') {
                         alphabet = (char) (alphabet+'A'-'Z'-1);
                     }
                     AfterEnc = AfterEnc + alphabet;
                    }
                    else {
                     AfterEnc = AfterEnc + alphabet;   
                    }

            }
            System.out.println("Pesan Ciphertext Anda : " + AfterEnc +"\n\nTerima"
                    + " kasih telah menggunakan sistem enkripsi sederhana ini!"
                    + "\n#####################################################"
                    + "#######################################################");
          }
        }
                }
                
