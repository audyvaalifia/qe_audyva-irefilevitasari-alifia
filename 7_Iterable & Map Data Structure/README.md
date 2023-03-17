#ITERABLE

Merupakan sekumpulan data atau struktur data yang dapat dilakukan iterasi atau perulangan kepadanya. Berikut ini adalah hierarki interface dari iterable yg ada pada Java. Disini interface iterable menjadi interface yg tertinggi dari struktur data yg lainnya spt collection dan juga list. Lalu dibawah iterable ada interface collection, kemudian dibawah interface collection ada set sortedset navigableset kemudian ada list lalu ada queue yg dibawahnya ada deque blockingqueue ada blockingdeque ada juga transfer queue.

Seluruh interface ini merupakan struktur data yg dapat dilakukan perulangan terhadap masing masing data yg disimpan.
Artinya jika kita ingin menggunakan struktur data dari Masing-masing implementasi bisa juga menggunakan interface set list atau deque ini sebagai tipe data dari variabel tempat kita menyimpan kumpulan data tersebut.

Method iterable ada for each, iterator, dan split iterator. Utk menggunakan iterable kita bisa gunakan iterable sebagai tipe data dari sebuah variabel.


#ITERATOR

Iterable memiliki sebuah method bernama iterator. Iterator adalah class yg memanage iterasi dari sebuah iterable. Iterator mengelola pada bagian mana kita sudah melakukan iterasi pada data iterable dan mengetahui data apa yg berikutnya dapat diambil dan bagaimana cara mengambilnya.


#COLLECTION

Collection merupakan kumpulan dari objek atau data yg diletakkan dalam satu tempat yg sama. Dan ini dikenal sebagai collection of objects atau sekumpulan objek atau data. Hierarki collection: collection turunan dari interface iterable, lalu ada banyak lagi interface yg menjadi turunan dr collection ini.

Method method collection: banyak, proses yg terjadi yaitu penambahan, penghapusan data, memeriksa isi dari data yg tersedia lalu method dari iterable spt iterator dan juga spliterator. Lalu ada method yg digunakan untuk melihat ukuran dari collection.

Untuk menggunakan collection kita lihat pada contoh code disini kita menggunakan salah satu collection yaitu arraylist.


#LIST
List merupakan sebuah interface yg menyediakan cara untuk menyimpan data secara linear. List merupakan turunan dari interface collection kemudian list juga dapat menerima nilai yg sama, sehingga jika kita menginputkan dua kali data yg bernilai sama pada list dapat dilakukan. Urutan data bergantung pada kapan data tsb dimasukkan pada list. Data yg pertama dimasukkan menjadi data urutan pertama, berikutnya ke urutan selanjutnya dst.

Method List: Method untuk menambah, menghapus, mengecek, mencocokkan, dan method2 lain pada sebuah collection 

Implementasi dari Java list: ada abstract list, array list, linkedlist, stack.


#ARRAY LIST

Array list menyediakan penyimpanan data yg dinamis (tidak terikat pada kapasitas data yg disimpan oleh array list tsb). Data yg disimpan oleh array list bisa sebanyak apapun selama memori pada komputer masih sanggup menyimpan data tersebut.

Workflow:
- Step1: pembuatan array list yg datanya masih kosong, 
- Step2: saat menambah elemen pada arraylist maka masing masing posisi akan terisi
- Step3: ketika data sudah penuh, lalu kita tetap memaksa untuk memasukkan data pada arraylist
- Step4: array list akan membuat array baru dan memindahkan seluruh data pada array tersebut
- Step5: akan dilakukan hal yg sama jika kapasitas penyimpanan sudah penuh
Panjang data pada array list terbatas, namun array list dapat memanjangkan dirinya seolah olah data yg dapat disimpan itu tidak terbatas 


#LINKEDLIST

Merupakan struktur data yg menyimpan setiap elemennya saling terhubung satu sama lain. Cara Linkedlist menghubungkan satu elemen dengan elemen lainnya adalah dengan menyimpan alamat memori dari masing masing elemen baik elemen setelah atau sebelumnya jadi jika ada sebuah elemen yg terdapat pada Linkedlist, pada elemen tersebut akan menyimpan alamat memori dari elemen yg sebelumnya. Lalu elemen sebelumnya juga akan menyimpan alamat memori dari elemen yg sebelumnya lagi sehingga pada list akan terjadi suatu koneksi/hubungan satu elemen dengan elemen yang lain.

Perbedaan arraylist dan linkedlist adalah:
Jika pada arraylist terbentuk ruang kosong lalu diisi data, pada Linkedlist bentuknya seperti gerbong kereta api. Pada bagian pertama sebuah elemen akan menyimpan nilai dari data yg disimpan, lalu selain nilai data disini akan menyimpan alamat memori dari data yg berikutnya, maka akan terhubung elemen 1 dengan yg lainnya.
Jika dilihat dari sisi time complexity, perbedaan antara arraylist dan juga linkedlist adalah pada saat mengambil data, pada array list, kita mendapatkan O(1) atau konstan, pada Linkedlist mendapatkan O(n) atau untuk mengambil elemen linkedlist memiliki kemungkinan untuk memerlukan waktu yg lebih lama.


#IMMUTABLE LIST

Immutable list merupakan bagian dari list tetapi ini tidak dapat diubah datanya, sehingga ketika kita memiliki immutable list maka untuk proses add nya tidak diizinkan karena tidak akan dapat diubah datanya, kalau di run akan eror bahwa operasi tidak diizinkan


#STACK

Stack akan menambah data secara linear dan pengambilan datanya bersifat LIFO (Last In First Out).

Method stack: pop, push, peek


#SET
Set merupakan sebuah struktur data yg dapat menyimpan sekumpulan data secara linear sama seperti list tetapi set tidak menerima data duplikat, apabila memasukkan data kembar maka set akan menganggap satu data saja.

Hierarki: pada bagian abstract terdapat abstract collection dan abstract set, lalu pada bagian implementasinya terdapat enumset, hashset, treeset, linkedhashset, lalu pada interface lainnya dibawah set terdapat sortedset dan navigable set.

1. HashSet. Uniknya, hash set merupakan struktur data yg menyediakan cara tercepat untuk proses pencarian data.
2. Linkedhashset. Linkedhashset menyimpan insertion order artinya data yg diinput terlebih dahulu maka akan terdapat pada urutan paling depan.
3. Enumset. Set jenis ini digunakan untuk menyimpan nilai Enum, untuk urutannya mengikuti urutan dari enum tersebut.
4. Sortedset. Ini dapat mengelola urutan dari data, methodnya , yang berbeda memiliki method bernama headSet dan tailSet dimana kita bisa melihat bagian kepala dan ekor elemen set tersebut.
5. Implementasi sortedset yaitu terdapat navigableset dan treeset. Tetapi navigableset berupa interface sehingga implementasi yg bisa kita gunakan adalah treeset. Untuk membuat sortedset kita bisa membuat variabel yang berisi treeset dan bertipe sortedset. 


#QUEUE

Queue mengimplementasi mekanisme first in first out artinya data yg terlebih dahulu dimasukkan akan terlebih dahulu diambil. 
Untuk mengambil data pada queue, menggunakan deque. Deque akan mengambil data paling depan dari sebuah queue, lalu untuk menambahkan data dapat menggunakan enqueue, ini akan menambahkan data pada bagian belakang.

Implementasi queue: terdapat priorityqueue, arraydequeue, dan linkedlist.

Dequeue atau double ended queue merupakan sebuah queue tapi memiliki dua ujung.
Method dequeue: menambah menggunakan addFirst atau addLast, getFirst atau getLast (double ended queue).


#MAP

Map merupakan struktur data yg ada di Java yg digunakan untuk menyimpan banyak data di dalamnya. Data data yg tersimpan di dalam map diidentifikasi menggunakan key dan setiap key akan memiliki datanya sendiri yg disebut value. Jadi dengan bentuk seperti ini map disebut juga dengan penyimpanan data berbasis key value.
Method map umumnya digunakan untuk menambah, menghapus, mengubah, dan juga untuk memeriksa isi dari map.

Bentuk map yg terdapat di Java, terdapat beberapa: hashmap, weakhashmap, identityhashmap, Linkedhashmap, dan enumhashmap.

1. Hashmap. Hashmap merupakan implementasi dari map yg menggunakan algoritma struktur data hash table. 
2. Weakhashmap. Weakhashmap masih menggunakan hash table, tetapi bedanya pada bagian weakhashmap, key itu dapat dihilangkan jika sudah tidak digunakan. 
3. Identityhashmap. Identityhashmap masih menerapkan hashtable tetapi jika key memiliki referensi pada memori yg berbeda maka akan dianggap sebagai data yg berbeda. 
4. Linkedhashmap. Linkedhashmap tidak ada perbedaan yg signifikan dengan hashmap biasa tetapi secara internal Linkedhashmap menerapkan doubly Linked list dan juga hash table sebagai struktur data di dalam mapnya.
5. Immutablemap. Dari namanya sendiri, immutable tidak dapat diubah, sehingga map dalam bentuk apapun tidak dapat diubah isinya, baik ditambah atau mengubah data yg sudah ada. Apabila kode dijalankan akan eror.
6. Sortedmap. Sortedmap artinya map yg dapat diurutkan, baik secara ascending maupun descending. Masing masing penerapan dari sortedmap memiliki cara sorting sendiri sendiri. 

Method pada sortedmap: terdiri dari method yang untuk mengurutkan key dan method firstKey/lastKey untuk mendapatkan key urutan pertama atau yg terakhir.
- With comparator. Jika kita menggunakan data yg kompleks sebagai key. Kemudian kita akan memerlukan comparator yg kompleks juga untuk membandingkan mana key yg memiliki urutan terlebih dahulu dan juga sebaliknya.
- Navigablemap. Navigablemap masih termasuk sortedmap tetapi dengan  method method untuk menavigasi yang lebih lengkap mulai dari key yg paling rendah hingga key yang paling tinggi, lalu key yg paling awal dan key paling akhir.
