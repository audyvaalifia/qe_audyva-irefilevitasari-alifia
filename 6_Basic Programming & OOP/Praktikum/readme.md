#BASIC PROGRAMMING
Di awal praktik programming Java, kita perlu menginstall IDE dan JDK terlebih dahulu. JDK sangat berguna untuk developoing, debugging, dan monitoring.

IDE ada berbagai macam, seperti BlueJ, NetBeans, Eclipse, dan Intellij. Pada kali ini saya(praktikan) menggunakan Netbeans.

Pada basic programming, yang dipelajari adalah tipe data, percabangan, perulangan, operator, dan input output.

Java memiliki beberapa tipe data: 
1. Integer (angka bilangan bulat)
2. Float (angka yang dapat juga diinput desimal)
3. Double (dapat diinput desimal yang lebih rumit lagi)
4. Boolean (akan memberikan output dari true atau false)
5. Char (satu huruf)
6. String (seluruh inputan dapat diterima, seperti kata, angka, simbol, dll)

Array untuk menyimpan data indeks.

Operator berbagai macam, adapun operator aritmatika, kondisional, unary, assignment, equality dan relational.

Percabangan menggunakan if else atau switch case

Looping dapat menggunakan for, while, atau do-while


#########

OOP

Penerapan Object Oriented Programming atau Pemrograman Berorientasi Objek memiliki banyak ciri: object, class, inheritance, method, enkapsulasi, atribut, abstrak, polimorfism.

Sudah tentu tahu bahwa class merupakan suatu entitas. 

Selanjutnya adapun tiap class akan ada Object yang dapat dideklarasi, diinstansiasi, dan diinisialisai.

Contoh: Mobil mobil = new Mobil();

Pada class ada variabel ada juga method.

Method dapat ada pada class. Method biasa diakhiri () di akhir nama method, ini untuk mendeklarasikan sebuah  kode program kemudian method akan dipanggil pada main 
class untuk menampilkan hasil dari code program yang dimasukkan pada method tersebut sebelumnya.

Akses modifier ada 5: public, default, private, protected.

Class dapat mengimplementasikan kelima akses modifier tersebut, sedangkan package hanya dapat public, default atau protected. Kemudian subclass dapat public atau protected. Terakhir global hanya dapat public.

Variabel sendiri yaitu properti dari entitas apa saja dan dideklarasikan, contohnya String nama; int jumlah; dll.


INHERITANCE

Sesuai dengan namanya, pewarisan sifat, Inheritance terdiri dari komponen wajib yaitu class parent dan class child, dimana class child akan mewarisi sifat dari class parent. Mewarisi sifat disini berarti dapat mewarisi atribut maupun method dari class parent, sehingga perlu diadakannya constructor. Untuk dapat mewarisi, class child harus menggunakan extend pada penamaannya. Contoh: public class HewanBerkaki extends Hewan{}


