/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alterra.PraktikumAlterra;
import java.util.ArrayList;
import java.util.Scanner;
//AUDYVA IREFILEVITASARI ALIFIA
//SOAL EKSPLORASI OOP
/**
 *
 * @author VICTUS
 */
public class AppBukuCRUD {
    public static void main(String[] args) {
        BukuSaya book = new BukuSaya();
        Scanner dyv = new Scanner(System.in);
        String opsi,jawab = "y";   
        while(jawab.equalsIgnoreCase("y") ) {        	
        	   System.out.println("\n\n========================================================================================"
                           + "\nSelamat Datang\n\t\t\t      SISTEM DATA BUKU PERPUSTAKAAN UNIV KITA"
                           + "\n========================================================================================"
                           + "\n\nInformasi Opsi Menu :\n");
        
	        System.out.println("Ketik '1' untuk menambah data buku ");
	        System.out.println("Ketik '2' untuk menghapus data buku tertentu ");	
	        System.out.println("Ketik '3' untuk mencari data buku tertentu");
	        System.out.println("Ketik '4' untuk melihat data buku ");
	        System.out.println("Ketik '5' apabila Anda ingin keluar dari sistem ");	        
	    
	        System.out.println("\nMasukkan opsi menu Anda : ");
	        opsi = dyv.nextLine();
	        
	        if( opsi.equals("1") ) {
                    System.out.println("\n\n========================================================================================");
                    book.Add();
                } else if( opsi.equals("2") ) {
                    System.out.println("\n\n========================================================================================");
                    book.Delete();
                } else if( opsi.equals("3") ) {
                    System.out.println("\n\n========================================================================================");
                    book.Cari();
                } else if( opsi.equals("4") ) {
                    System.out.println("\n\n========================================================================================");
                    book.View();
                } else if( opsi.equals("5") ) {
                    System.out.print("Bye...");
                    System.exit(0);
	        }	
		        	
	        System.out.println("\n############################################################################"
                        + "\nApakah Anda masih tetap ingin melanjutkan "
                        + "dalam menggunakan sistem?\nY = Ya\nN = Keluar dari sistem");
	        jawab = dyv.nextLine();
	       	System.out.println("############################################################################");
        }
    }

    
    
    
       
        //MEMBUAT ABSTRAKSI: ABSTRACT CLASS
        abstract static class TambahBuku{  
            String id, title, author, category;
                
            
        }
        //PENERAPAN INHERITANCE      
        static class BukuSaya extends TambahBuku{
            //UNTUK MENYIMPAN DATA DENGAN ARRAY LIST
            ArrayList<String> Id = new ArrayList<>();  
            ArrayList<String> Title = new ArrayList<>();
            ArrayList<String> Author = new ArrayList<>();
            ArrayList<String> Category = new ArrayList<>();
            
                                 
                
                public void Add() {
                    
                    Scanner dyv = new Scanner(System.in);
                System.out.println("\t\t\t\tTAMBAH DATA BUKU"
                        + "\n----------------------------------------------------------------------------------------");    		
    		System.out.print("Masukkan Id Buku\t\t: ");
    		id = dyv.nextLine(); 
    		System.out.print("Masukkan Title Buku\t\t: ");
    		title = dyv.nextLine(); 
    		System.out.print("Masukkan Nama Author\t\t: ");
    		author = dyv.nextLine();
                System.out.print("Masukkan Category Buku\t\t: ");
    		category = dyv.nextLine();
    		
            //MENYIMPAN DATA PAKE ARRAY
            Id.add(id);
            Title.add(title);
            Author.add(author);
            Category.add(category);

        }
                
                
          public void Cari() {
              String simpan;
              Scanner dyv = new Scanner(System.in);
              
              System.out.println("\t\t\t\tPENCARIAN DATA BUKU"
                        + "\n----------------------------------------------------------------------------------------");  
              System.out.print("Masukkan id buku yang ingin Anda cari: ");
              simpan = dyv.nextLine();
               System.out.println("----------------------------------------------------------------------------------------"
                      + "\n###Informasi Buku :###");
              for(int i=0;i<Id.size();i++) {
                  if (Id.get(i).equals(simpan))
                  {
                      System.out.println("Id Buku\t\t\t: "+Id.get(i));
                      System.out.println("Title Buku\t\t: "+Title.get(i));
                      System.out.println("Nama Author\t\t: "+Author.get(i));
                      System.out.println("Category Buku\t\t: "+Category.get(i));
                  }
          }
          }
    
          
          public void View()  {
              System.out.println("\t\t\t\t\t\t\t\tDATA SELURUH BUKU"
                        + "\n----------------------------------------------------------------------------------------"
                      + "-------------------------------------------");  
              System.out.println("==========================================="
                      + "========================================================================================");
              System.out.println("-----------------------------------------"
                      + "------------------------------------------------------------------------------------------");
              System.out.println("\t\t     ID  \t\t\t\tTITLE\t\t\t\tAUTHOR\t\t\t\tCATEGORY ");
              System.out.println("---------------------------------------------------------------------------------"
                      + "--------------------------------------------------");

              for(int i=0;i<Id.size();i++) {
                  System.out.println("    "+Id.get(i)+"\t\t  "+Title.get(i)+"   \t"
                  +Author.get(i)+"      \t\t "+Category.get(i));
              }
              System.out.println("----------------------------------------------------------------------------------------"
                      + "-------------------------------------------");
//      	
    		
    }
          public void Delete() {
    		Scanner dyv = new Scanner(System.in);
    		String hapus;
                
                System.out.println("\t\t\t\tHAPUS DATA BUKU"
                        + "\n----------------------------------------------------------------------------------------");
                System.out.println("Masukkan id buku yang ingin Anda hapus: ");
    		hapus =  dyv.nextLine();
                
    		for(int i=0;i<Id.size();i++) {
                  if (Id.get(i).equals(hapus))
                  {
                      Id.remove(i);
                      Title.remove(i);
                      Author.remove(i);  
                      Category.remove(i);                      
                      System.out.println("Data Buku dengan id "+hapus +" berhasil dihapus!");
                  
                  }
                  else if(!Id.get(i).equals(hapus)){
                      System.out.println("Tidak ada data buku dengan id "+hapus+"!");
                  }
          }
        }
        }
}
        


