##SOFTWARE TESTING FUNDAMENTAL##
A. Software testing adalah Proses untuk melakukan analisis komponen software untuk mendeteksi perbedaan antara kondisi aktual dan kondisi yang diinginkan serta melakukan evaluasi fitur pada software. Orang yg berkecimpung di dunia QE kita harus memastikan bahwa sistem itu agar 100% bebas dari bug, kita harus memastikan setiap fitur yang sudah diuji yang kita ciptakan untuk dites agar dapat menemukan bug-bug mana yang akan ditemukan user nanti.

B. Banyak kejadian seperti catatan hitam sebagai software testing seperti hilangnya uang dari rekening bank, hal ini banyak kejadiannya. QE bisa lengah dari hilangnya uang dari rekening tersebut karena adanya tabrakan sebuah fitur. Ada fitur yang seharusnya mirip namun malah bertabrakan fungsinya, dimana itu dapat dicurangi oleh user. Maka dari itu adalah salah satu pentingnya keberadaan QE untuk mencegah hal tersebut terjadi.
Di bidang apapun apabila sudah berkaitan dengan sistem, seperti bisnis atau kesehatan atau lainnta, kita harus memerlukan testing. 

C. Keuntungan adanya Software Testing
Banyak yang menguntungkan apalagi dari segi bisnis, kita juga lebih hemat, kualitas produk terjamin, mengenai keamanan, kepuasan customer, dan banyak lainnya.

D. Testing platform terdiri dari API (namun kekurangannya adalah ini mahal), mobile (mobile juga dinilai lebih mahal dari web dan desktop), web, serta desktop.

E. Jenis-jenis Software testing:
1. Functional testing: mengetes semua fungsi-fungsi, apakah fungsi bekerja dengan baik atau tidak. Tipenya yakni: Manual, Automate, dan lainnya. Testing desain atau UI/UX berada pada kelompok functional testing ini.
2. Non functional: menguji seberapa besar load servernya. Tipenya yakni performance testing dan lain sebagainya. Performance testing adalah misalnya ketika ada event WIB nya Tokopedia otomatis dia akan banyak mengkonsumsi data karena pengguna nya banyak masuk ke sistem, sehingga seharusnya performa nya ditingkatkan saat event WIB tersebut agar sistem sanggup menerima banyaknya user ketika mengklik secara bersamaan di waktu tersebut secara real time.
3. Maintenance: apabila ada deployment, dan kita hendak mengecek fitur-fitur yang sebelumnya itu kita harus memastikan apakah tidak tersenggol dengan fitur yang baru. Tipenya yakni regression dan lain sebagainya. Contoh kasus pada Regression, misalnya terdapat 3 case (login, add product, dan logout), kemudian kita menemukan ada bug di logout, kita harus melakukan regression supaya dapat menyelesaikan bug logout, kemudian pada case login dan add barang harus diuji juga. Regression lebih struktur.

F. Perbedaan menguji manual dan automate tidak ada. Yang penting intinya main tujuan dapat digunakan. Jika kita pahami dari judul case-nya, precondisi nya hingga ke aktual research nya jika kita pahami dari awal hingga akhir seharusnya menjalankan automate tidak masalah.

G. Apakah automate bisa dieksekusi kalau tidak ada manual? Tidak. Manual merupakan proses yang pertama kita lakukan dab harus kita pahami barulah kita bisa melakukan testing automate itu.

H. Apapun fitur yang sudah kita perbaiki dan update, otomatis fitur yang sudah selesai dan masuk ke production tetap akan kita uji karena siapa tahu akan tertabrak/crash dengan fitur lain.

I. Level testing:
1. Unit testing: menguji tiap unit yang sudah dideploy, contohnya case login. Kita akan menguji unit login tersebut.
2. Integration testing: contohnya, setelah case login terdapat case add product, integrasi login ke add product perlu ditesting juga. 
3. System testing: Setelah adanya integragion testing maka terdapat testing lagi yakni system testing, dimana semua fitur yang ada di sebuah sistem harus diuji, dari login, add produk, bayar, cicil, dll, semua fitur yang ada di sistem ini harus diuji.
4. Acceptance testing: ini lebih ke kriteria fitur yang telah dibangun, mengobservasi dimana fitur yang lebih penting daripada fitur yang lain. Biasanya dilakukan di bagian production.

***********************************************************************************************************************************************************************
##SOFTWARE TESTING AS A CAREER PATH##
A. Apa yang dilakukan software tester?
1. Mengerti kebutuhan dokumen
2. Membuat test case
3. Mengeksekusi pengujian
4. Melaporkan dan menguji ulang bug
5. Menghadiri rapat dengan stakeholder lain
Yang pertama kita harus mengerti requirement dokumennya seperti flow bisnis, database apa yang dipakai, dan segala macemnya. Setelah kita paham segala macamnya, kita membangun test case-nya secara maksimal, kita tidak akan sia-sia jika kita sudah mengerti apa yang dibangun. Setelah itu barulah mengeksekusi testingnya apabila sudah lancar tanpa bug. Selanjutnya kita membuat laporan namun misalnya ada bug maka kita lakukan pengujian lagi sampai bug selesai baru buat laporan kembali. Terakhir, kita  men-demo-kan hasilnya ke stakeholder yang bersangkutan terhadap fitur anyg kita bangun. Apabila telah clear maka layak rilis. Perlu diketahui bahwa setiap perusahaan terdapat prosedur yang berbeda, namun poin pentingnya yakni adanya kelima hal ini.

B. Kebutuhan untuk jadi software testing ada 2: Non-techinal skill dan techinal skill
1. Non technical skill:
a. Analytical skill: kita sejatinya memiliki sifat seperti ini, rasa ingin tahu, dan pemikiran-pemikiran secara teori. Kita dapat dengan sendirinya menganalisis untuk dapat membangun suatu testcase agar semakin maksimal lagi. 
b. Communication skill: skill ini lebih ke arah kerjasama. Dimana ada task-task kita yang membutuhkan sebuah tim atau teman, baik itu sesama QE, developer, sistem analis, tim produk, atau owner-nya. Sering lah berbicara. 
c. Time management and organization skill: kita bekerja secara terorganisir, ada birokrasi, ada waktu, dan ada tuntutan waktu dalam bekerja. Skill ini riskan untuk kita ketahui. Skill ini telah dipelajari selama kehidupan sehari-hari saat perkuliahan tentunya.
d. Great Attitude: attitude itu 80% dipakai saat kita bekerja apapun pekerjaan nya. Pada kasus QE, great attitude dilakukan contohnya saat berkomunikasi terhadap sesama stakeholder dan saat melaporkan bug. Attitude yang baik membuat kita nyaman saat bekerja. 
e. Passion: kita harus bersemangat terlebihi dahulu dengan QE, inilah passion dengan QE , kecintaan terhadap pekerjaan muncul ketika kita sangat paham tentang pekerjaan nya. Passion perlu dan pekerjaan harus dicintai.

2. Technical skill: 
a. Basic knowledge of Unix/Linux commands.
b. Test management tool
c. Tracking management tool
d. Automation testing tool
Basic knowledge sederhana saja, namun penting, knowledge merupakan nilai plus apabila bekerja sebagai QE. Lebih penting query daripada basic knowledge. Pada Test management tools, ketika kita paham akan sebuah informasi maka penggunaan test management tool juga akan sama. Tracking management tool perlu dipahami setiap pekerjaan yang kita terima karena yang penting paham berapa apapun agar di-tracking management. Automation testing tool saat dipahami adalah nilai plus, tapi yang ditekankan adalah harus paham manual testing dahulu dalam mengeksekusi testingnya.

C. Software Tester Career Path mulai dari:
1. Junior QE (Fresher), 
2. QE (1-2 tahun), 
3. Senior QE (>3 tahun)
4. QE Lead (5-6 tahun)
5. QE Manager (8-11 tahun) 
Namun Banyak orang yang tidak memiliki pengalaman lama namun karena sudah sangat passion dengan QE, dia bisa saja menjadi senior. Untuk QE manager merupakan posisi yang yakni seperti supervisornya QE.

D. Alternatif Career Tracks as a Software Tester. Ada 4:
1. Performance Tester
2. Penetration Tester
3. System Analyst
4. Scrum Master
Mengapa bisa menjadi sistem analis dan scrum master? Karena kita telah paham produk yang kita uji, inilah yang menjadi nilai plus secara tidak langsung. Kita telah terbiasa melihat diagram, dokumen, serta memahami sebuah produk, akhirnya analisis kita terhadap sistem tersebut dengan mudah terasah, jadi akan mudah untuk menjadi System Analyst.

E. Faktanya software tester digaji sama adil dengan software developer, Software tester tidak pernah dicap sebagai kedua.
