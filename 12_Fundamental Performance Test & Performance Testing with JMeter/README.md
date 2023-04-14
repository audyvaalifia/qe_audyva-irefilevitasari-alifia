##############################################################################

FUNDAMENTAL PERFORMANCE TEST

##############################################################################

#Performance test adalah sebuah teknik non functional testing yg mengukur kualitas atribut dari sistem seperti stabilitas, ketahanan (reliability-misal kita mengetes apakah sistem ini bekerja dengan baik meskipun diberikan req atau beban kerja yg banyak), dan mengukur penggunaan sumber daya dari sebuah sistem(misalkan mengukur sistem dapat bekerja dgn baik dgn menggunakan sumber daya yg efektif dan seefisien mungkin).

#Apa yg diukur dr performance test?
1. Performa suatu apk sampai suatu batas tertentu
2. Dapat dalam berbagai macam bentuk lainnya (bisa mengamati response time dan melihat suatu sistem berinteraksi seperti apa)

#Mengapa performance test jarang dilakukan? Karena membutuhkan biaya yg cukup mahal, karena kita harus memisahkan environment untuk testing dan lingkungan khusus untuk production. Jadi ketika sebuah testing dilakukan performance testing yg cukup intens dan mengalami crash maka sistem yg ada di production tetap berjalan dengan baik,.


#Yang perlu diperhatikan pada performance test:
1. throughput
2. response data


#Misalkan ada sebuah sistem yg di-launch di production lalu kita hendak melakukan performance testing untuk mengetahui throughput dan response timenya.
langkahnya yaitu:
1. kita membuat rencananya dulu
2. membuat skrip
3. melakukan performance test
4. analisis dari hasil performance test


#Metode yg bisa digunakan dalam performance testing:
saat membuat test plan ada 2 hal penting:
1. kita harus mengetahui endpoint apa yg akan di testing
2. kita harus mengetahui kebutuhan masing masing endpoint


#Menentukan metode dalam performance testing

Biasanya kita bisa memilih berdasarkan kondisi apakah sudah ditest sebelumnya atau belum. Kita bisa mengawali dgn load test untuk mengetahui kondisi sistemnya. Kemudian kita bisa memilih situasi yg akan dihadapi, misalkan fitur x nantinya akan digunakan oleh user yg cukup banyak maka kita bisa menggunakan metode load test dan metode tambahannya yaitu stress testing



#Ada berbagai macam tipe performance testing:
1. Load testing

Adalah pengujian pada suatu fitur yg dilakukan dgn memberikan beban kerja tertentu, biasanya diberikan beban dalam jumlah wajar. Hasilnya untuk mengukur proses transaksinya seperti apa. misal fitur pembelian pulsa, kita bisa mengecek apa dampaknya pada database, application server, atau pendukung lainnya.
Jika sistem belum masuk ke production, untuk mengetahui ini sistem ideal atau tidak, maka kita dapat mengacu pada acuan table tier.


2. Endurance testing/soak test

Kita lakukan dgn memberikan beban kerja yg cukup banyak dalam waktu yg panjang. Contohnya kita memberikan workload banyak user dengan jumlah 20+ dalam waktu panjang misal 1 jam atau lebih. Dengan ini kita bisa mengetahui apakah sistem ini terdapat bug, apakah ada kondisi  pada race condition, memory leaks, db connection dsb.
Jika dilakukan pada production maka kita harus melakukannya pada jam-jam sepi agar tidak terganggu pada saat proses test dilakukan.


3. Stress testing

Adalah sebuah testing yg digunakan untuk mengamati kemampuan dan kestabilan sistem pada saat kondisi ekstrem. cara kerjanya kita memberikan workload pada normal. lalu kita naikkan lag, lalu naikkan lagi hingga puncak. setelah kita sudah berikan workload yg cukup banyak kita berikan mekanisme skilldown untuk menurunkan work loadnya untuk melihat proses recovery dari sistem tersebut


4. Spike testing
Sama seperti stress testing namun kenaikan work loadnya langsung drastis, tidak bertahap. Contohnya flash sale di e-commerce, begitu flash sale diselenggarakan maka workload nya akan naik secara drastis tanpa bertahap.


4. Peak testing
5. Smoke testing

adalah sebuah testing pemanasan, memastikan skrip yg sudah kita buat benar atau belum, memastikan apakah sistem ini dapat menghandle load dgn jumlah minimal, biasanya 1-2 virtual user saja





##############################################################################

INTRODUCTION JMETER AND TUTORIAL RECORD WITH JMETER

##############################################################################

#Ada beberapa tools yg dapat kita gunakan untuk melakukan pengujian ini, salah satunya JMETER, sedangkan tools lainnya ada: grafana k6, locust, BlazeMeter, LoadNinja.


#Kenapa kita memilih JMETER?

jmeter adalah software berlisensi apache yang merupakan sebuah perangkat lunak yg merupakan sumber terbuka sehingga semua orang dapat ikut serta dalam mengembangkan aplikasi jmeter ini. jmeter terbuat dari aplikasi desktop berbasis java yg dirancang untuk menguji perilaku dari sebuah website sehingga pengguna dapat melihat apakah website tersebut memiliki fungsionalitas dan kinerja yg sudah sesuai. selain jmeter untuk pengujian website sdh berkenbang pada pengujian fungis fungsi lainnya.


#Keuntungan jmeter:
- Open source, sehingga kita dapat melihat kode dari aplikasi JMETER ini, jika ada masalah, maka kita bisa melihat sendiri terjadi di bag ana
- Dibuat dalam user interface dan tanpa user interface, jika dgn UI maka kita bisa mendapatkan aplikasi yg berjalan seperti aplikasi pada desktop seperti pada  umumnya. jika non GUI maka kita dapat menggunakannya pada sistem berbasis CLI


#Bagaimana proses instalasi JMETER?
1. menyiapkan jdk (java development kit)
2. mencari dan mendownload JMETER bentuk zip
3. membuka file yg ada di dalam zip tersebut
4. membuka terminal
5. pada terminal kita akan berpindah pada folder jmeter yg telah diekstrak (cd /path to jemeter folder/bin)
6. menjalankan jmeter dengan .\jmeter.bat


#Instalasi plugin
1. cari dan download plugin
2. letakkan pada lib/ext yg ada di folder jmeter
3. setelah plugin terinstall maka kita bisa membuka ulang jmeter


#Melakukan testing sederhana
1. membuka jmeter yg sudah kita install


#Komponen dari JMETER:
1. test plan, merupakan rencana besar dari sebuah pengujian yg akan dilakukan
2. thread groups, terdiri dari beberapa thread yang dapat digunakan untuk menjalankan skenario yang sama
3. sampler, sebuah req yg dikirimkan ke server web
4. config element, elemen elemen yg digunakan untuk o=konfigurasi sehingga jika kita ingin memodifikasi sampler maka kita dapat memanfaatkan config element ini
5. listener, untuk merekam apapun yg terjadi saat test dilakukan
6. timer, digunakan untuk mencatat waktu saat testing dilakukan
7. assertion, adalah sebuah kegiatan yg menguji kriteria apakah sudah sesuai dgn kenyataan terjadi atau belum
8. pre-post processor, tugasnya memodifikasi atau memproses respon sebelum dan sesudah test dilakukan


#Untuk melakukan test:
1. Kita mengklik icon pojok kiri atas namanya template, kita klik template bernama recording > create > masukkan alamat web yg ingin kita test cukup host saja > klik create
2. Di bagian kiri terdapat https test script recorder abu abu artinya belum aktif, untuk mengaktifkannya > klik https test script recorder > klik icon toggle sehingga jadi putih tulisannya
3. Ke target controller > pilih test plan thread group recording controller.
4. Klik start


#Mengatur web browser kita
1. firefox > setting > network setting > manual proxy configuration > ketik localhost > ketik port 8888 (global setting di jmeter). klik ok
2. akses web yg akan kita test

#Lanjutan test
1. di jmeter pada bagian view  result tree, terdapat icon tameng dan centang -1, menunjukkan terjadi sebuah req pada url berikut ini dgn response seperti ini. kita bisa menjalankan test
2. untuk menjalankan test, kita stop dulu > masuk ke bagian thread group >  ketik 3 number of thread > menu > start > save project
3. menu view result tree terdapat 3 req terhadap -1, menunjukkan bahwa thread akan melakukan tes  terhadap https test recorder.

#Menjalankan tanpa GUI, yaitu dgn CLI
1. Buka terminal
2. ./jmeter -n t -/path file yg sudah kita save projeknya -l -/path dan simpan nama yg diinginkan test1.csv
3. Buka csv
dari file csv yg sudah kita buat yaitu kita bisa hitung summary reportnya, summary report biasanya yg diperlukan ayaotu success rate = (jumlah_response2xx / jumlah thread) *100%. Jika semua req nya bernilai 200, berarti success ratenya 100%, jika terjadi masalah maka akan berkurang success ratenya



##############################################################################

POST PROCESSOR

##############################################################################

#Post processor adalah bagian dari test plan yg merupakan sebuah aksi yg berjalan saat proses setelah dilakukan. proses ini sendiri adalah proses req ke sebuah alamat web. prose yg dipakai pada post processor ini pada umumnya untuk mengekstrak value yang didapatkan dari hasil  mengakses sebuah alamat web, seperti data data pad json, psda session, pada bagian response yg lainnya. Salah satu post processor di jmeter: json extractor, selain itu ada extractor lain dalam post processor. Pada JSON extractor kita dapat menggunakan JSON path untuk mengambil nilai nilai  terdapat pada data json yg dihasilkan dari response saat kita melakukan req. 


#Untuk memanfaatkan json extractor:

1. jmeter kosong > klik icon template > recording > create > req ke web reqres.in > output file recrod3 > create
2. thread group > klik kanan > add > sampler > http request 
3. http req klik > protokol https > server name reqres,in > get > .api/users  > parameter > name page value 2
4. menu run > start
5. view result tree > tameng dan centabg > tab request benar parameter benar
6. tab response data > response berbentuk json
7. klik  kanan http req > add > post prosector > json extractor
8. isi nama variabel misal ID atau (ID; email) pada data json tadi di response data > isi path $.data..id atau ($.data..id; $.data..email)misal > default value > NOT_FOUND > RUN > start
9. view result tree ada http req baru tdk ada yg berbeda
untuk melihat hasil post processor kita > klik kanan thread group > add > sampler > debug sampler >run > start
10. view result tree muncul debug sampler disini akan muncul ID=12. sehingga post processor kita sudah berhasil mendapatkan id yg diambil adalah id 12 kenapa? > json extractor disini ada opsi match no yg tdk terisi maka jmeter akan mengambil secara random, namun jika kita isikan misal 1 , maka hasil yg didapat id=7 karena 7 urutan pertama. isi field itu adalah urutannya. jika kita isi -1 maka yg muncul adalah semua id, jika kita isi 0 maka random.


#JSON Path

Terkait json path , berikut adalah aturan aturan yg digunakan 
- $ adalah root element, maksudnya seluruh data json yg didapatkan itu adalah dolar
-  . untuk mengakses child dari sebuah objek
- [] untuk mengakses elemen array berdasarkan indeksnya, lalu ditengah tengahnya kita bisa letakkan indeks dari elemen array tersebut
- .. untuk operasi rekursif, misalkan ada objek di dalam array, seandainya kita ingin mengambil semua objek dalam array disini kita bisa menggunakan tanda .. tanpa menulis indeks daaka array tsb
- * untuk mengakses secara keseluruhan (wildcard)
- [start:end] kita bisa memotong array dari indeks sekian ke sekian
