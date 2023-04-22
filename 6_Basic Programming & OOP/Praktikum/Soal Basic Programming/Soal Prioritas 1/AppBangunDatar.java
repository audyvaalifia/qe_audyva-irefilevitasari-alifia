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
public class AppBangunDatar {
    
    public static void main(String[] args) {
                BangunDatar bd[] = new BangunDatar[3];
                bd[0] = new Segitiga("Segitiga", 20, 25);
                bd[1] = new Lingkaran("Lingkaran", 90);
                bd[2] = new PersegiPanjang("Persegi Panjang", 40, 6);                

                
                BangunDatar b = new fungsiBangunDatar("") {};
                b.info();
                for(int i = 0; i < bd.length; i++) {
                System.out.printf("____________________________________________________________"
                        + "\n====================== Bangun Datar %d ======================\n", i+1);
                        bd[i].info();
                }
    }
}

    interface Hitung{
        float hitungLuas();
    }    


    abstract class BangunDatar{
        private String nama;
        int counter;
        static String listBangunDatar[] = new String[3];
        
        BangunDatar(String nama){
            this.nama=nama;
            for (int i =0;i< listBangunDatar.length;i++){
            if (listBangunDatar[i]==null){
                listBangunDatar[i]=this.nama;
                break;
            }
            }
        }        
        void setnama(String Nama){
        this.nama= nama;
    }
        String getnama(){
            return this.nama;
        }
        
        public static BangunDatar getInstanceBangunDatarOf(Hitung bangun){
            System.out.println("____________________________________________________________"
                        + "\n============================================================\n");
        BangunDatar bangunDatar = null;
        if(bangun instanceof PersegiPanjang)
            bangunDatar = (PersegiPanjang)bangun;
        else if(bangun instanceof Segitiga)
            bangunDatar = (Segitiga) bangun;
        else if(bangun instanceof Lingkaran)
            bangunDatar = (Lingkaran) bangun;
            return bangunDatar;
        
        }


        
        abstract void info();
        
        public void search(String namaBD) {
            boolean running = true;
        int counter = -1;
        int sudut=0;
        int sisi=0;
        int tanda = 0;
        
        
        for (int i = 0; i<listBangunDatar.length; i++){
            if (listBangunDatar[i] == null){
                break;
            }
            if (listBangunDatar[i].toLowerCase().equals(namaBD.toLowerCase())){
                counter++;
                tanda = i;
            }
        }
        

        while( running ) {
            System.out.print("\n_____________________________________________________________"
                    + "\n#############################################################\n"
                    + "Masukkan nama bangun datar yang ingin anda cari : "+namaBD+"\n");

            if( namaBD.equalsIgnoreCase("Segitiga") ){
                System.out.println("Bangun Datar yang Anda cari tersedia ");
                running = false;
            }else if ( namaBD.equalsIgnoreCase("Persegi")){
                running = false;
                System.out.println("Bangun Datar yang Anda cari tersedia "); 
            }else if ( namaBD.equalsIgnoreCase("Lingkaran")){
                running = false;
                System.out.println("Bangun Datar yang Anda cari tersedia "); 
            }else{
                System.out.println("Bangun Datar yang Anda cari tidak tersedia");
                running = false; 
            }
            counter++;
        }
        switch (namaBD.toUpperCase()){            
            case "SEGITIGA" :
                sudut = 3;
                sisi = 1;
                System.out.println("Jumlah bangun datar dalam list sebanyak " + counter+" buah");
                System.out.println("\nTahukah kamu?\n"+namaBD+" memiliki :");
                System.out.println("1. Sisi bangun datar sebanyak " + sisi+" buah");
                System.out.println("2. Sudut bangun datar sebanyak " + sudut+" buah");
                break;
                
            case "PERSEGI" :
                sudut = 4;
                sisi = 4;
                System.out.println("Jumlah bangun datar dalam list sebanyak " + counter+" buah");
                System.out.println("\nTahukah kamu?\n"+namaBD+" memiliki :");
                System.out.println("1. Sisi bangun datar sebanyak " + sisi+" buah");
                System.out.println("2. Sudut bangun datar sebanyak " + sudut+" buah");
                break;
                
           case "LINGKARAN" :
                sudut = 0;
                sisi = 1;
                System.out.println("Jumlah bangun datar dalam list sebanyak " + counter+" buah");
                System.out.println("\nTahukah kamu?\n"+namaBD+" memiliki :");
                System.out.println("1. Sisi bangun datar sebanyak " + sisi+" buah");
                System.out.println("2. Sudut bangun datar sebanyak " + sudut+" buah");
                break;
                
            default :
                break;
        }
        
    }
        }        
    
    
    class fungsiBangunDatar extends BangunDatar{ 
        public static <T> int count(T[] array)  {
        return array.length;
    }
    fungsiBangunDatar(String nama) {
        super(nama);
    }
        @Override
    public void info() {
        System.out.println("------------------ Informasi Bangun Datar ------------------");
        for (int i=0; i<listBangunDatar.length; i++){
            System.out.println(i+1 +". " +listBangunDatar[i]);
        }
        
    }

}
class Segitiga extends BangunDatar implements Hitung{
        private float alas;
        private float tinggi;
        
        Segitiga(String nama, float alas, float tinggi){
            super(nama);        
            this.alas=alas;
            this.tinggi=tinggi;        
    }

        @Override
        public float hitungLuas() {
            return (float) (0.5*alas*tinggi);
        }
        
        @Override
        public void info(){
        System.out.println("Nama Bangun Datar\t: "+getnama()+"\nPanjang Alas\t\t: "
                + alas+"\nTinggi Segitiga\t\t: "+tinggi+"\nLuas Segitiga\t\t: "
                +String.format("%.2f", hitungLuas()));
    }
}
    
    class PersegiPanjang extends BangunDatar implements Hitung{
        private float panjang;
        private float lebar;
        
        PersegiPanjang(String nama, float panjang, float lebar){
            super(nama);
            this.panjang=panjang;
            this.lebar=lebar;
        }

        @Override
        public float hitungLuas() {
            return (panjang * lebar);
        }
        
        @Override
        public void info(){
        System.out.println("Nama Bangun Datar\t: "+getnama()+"\nPanjang\t\t\t: "
                + panjang+"\nLebar\t\t\t: "+lebar+"\nLuas Persegi\t\t: "+String.format("%.2f", hitungLuas()));
    }
    }
    
    class Lingkaran extends BangunDatar implements Hitung{
        private float jari2;
        private final float pi=(float) 3.14;
        
        Lingkaran(String nama, float jari2){
            super(nama);
            this.jari2=jari2;
        }               

        @Override
        public float hitungLuas() {
            return (float) (pi*Math.pow(jari2,2));
        }

        @Override
        public void info(){
        System.out.println("Nama Bangun Datar\t : "+getnama()+"\nPanjang jari-jari\t : "
                + jari2+"\nLuas Lingkaran\t\t : "+String.format("%.2f", hitungLuas()));
    }
    }
    

