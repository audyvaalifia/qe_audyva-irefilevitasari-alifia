/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alterra.PraktikumAlterra;
//AUDYVA IREFILEVITASARI ALIFIA
//SOAL PRIORITAS 1 NOMOR 1
/**
 *
 * @author VICTUS
 */
//Buatlah sebuah program untuk menyimpan data sebuah produk dalam bentuk class. Kriteria dari program yang dibuat adalah sebagai berikut:
public class AppProdukMinuman {
    public static void main(String[] args) {
        Product a = new Product("Soda", "Soda ini sangat manis, tidak cocok untuk umur di atas 60",15000, 100);
        System.out.println(a.getInfo());
        System.out.println();
        Product b = new Product("Milkshake", "Memiliki banyak varian rasa yang enak ditambah campuran susu. Para remaja sangat menyukai ini!",9000, 401);
        System.out.println(b.getInfo());
        System.out.println();
        Product c = new Product("Bir Pletok", "Ini halal! Bukan minuman beralkohol, bir pletok adalah minuman manis khas Indonesia loh",30000, 3);
        System.out.println(c.getInfo());
        System.out.println();
        Product d = new Product("Sirup", "Meskipun lebih manis daripada soda, sirup ini memiliki kandungan 90% madu yang baik untuk kesehatan",19000, 12);
        System.out.println(d.getInfo());
        System.out.println();
    }
    

    
    
    static class Product {
        String Nama, deskripsi;
        double harga;
        int stok; 
        public Product (String Nama, String deskripsi, double harga, int stok){
            this.Nama=Nama;
            this.deskripsi=deskripsi;
            this.harga=harga;
            this.stok=stok;
            }
        
        
        
        void setNama(String Nama){
            this.Nama= Nama;
        }
        String getNama(){
            return this.Nama;
        }
        void setHarga(double harga){
        this.harga= harga;
        }
        double getHarga(){
        return this.harga;
        }
        void setStok(int stok){
        this.stok= stok;
        }
        int getStok(){
        return this.stok;
        }
        void setDeskripsi(String deskripsi){
        this.deskripsi= deskripsi;
        }
        String getDeskripsi(){
        return this.deskripsi;
        }
 

        public String getInfo(){
        return "INFO PRODUK MINUMAN CAFE AUDYVA\nNama: " +Nama +"\nDeskripsi: " +deskripsi +"\nHarga: Rp" +harga +
                "\nJumlah Stok: "+stok+"\n#######################################################";
        }
       }
}
 
    