##############################################################################

##RESTful API Testing with REST Assured

##############################################################################

Rest merupakan standar arsitekyur komunikasi berbasis web yg sering diterapkan dalam pengembangan layanan berbasis web.
Umumnya menggunakan http sebagai protokol Untuk komunikasi data. REST juga merupakan salah satu Implementasi dark web service sebagai standar yg digunakan untuk pertukaran data antara aplikasi maupun sistem. Rest API berisi aturan atau batasan yg membatasi programmer untuk mengakses atau melakukan tindakan tindakan tertentu pada sebuah database. Jika API adalah penghubung, maka REST yg membuat aturan sesuai keinginan programmer dalam merancang web service. Kesimpulan nya terdapat req dan response pada data yg dikirimkan ataupun yg diterima, data yg digunakan dalam rest api umumnya berupa json.

#Fundamental API test process, test process dari APU yaitu
1. Definisikan api yg akan kita test
2. Inputkan data yg dibutuhkan baik di header maupun body request nya
3. Send req ke server
4. Melakukan Validasi terhadap response yg diberikan


#Test Pyramid

Test pyramid dikelompokkan kedalam berbagai kategori. Seperti Piramida nutrisi, jumlah test secara teoritis akan berkurang saat kita naik dalam kategori dan memiliki test setiap kategori akan memungkinkan kita untuk memiliki rangkaian pengujian yang menyeluruh.

Dari paling bawah ke atas:
1. Unit testing, merupakan pengujian perangkat lunak yg menguji setiap unit atau komponen dari sebuah perangkat lunak. Unit Testing dilakukan saat masa pengembangan atau pada saat menuliskan kode program dari sebuah perangkat lunak oleh developer. Komponen yg diuji pada unit testing adalah unit unit dari perangkat lunak, Dapat berupa function, modul, method, procedure, maupun Object. Tujuannya: untuk memvalidasi setiap unit dari kode perangkat lunak dapat berjalan seperti yg diharapkan.
2. Komponen testing, merupakan jenis pengujian perangkat lunak dimana pengujian dilakukan di setiap komponen individu secara terpisah tanpa mengintegrasikan dengan komponen lain. Umumnya perangkat lunak apapun secara keseluruhan terbuat  dari beberapa komponen. Pengujian tingkat komponen berkaitan dengan pengujian komponen-komponen ini satu persatu. Ini adalah salah satu jenis blackbox testing yang paling sering dilakukan oleh tim qe.
3. Integration testing, adalah pengujian dari hasil penggabungan unit unit yang ada di dalam software, qe biasanya menguji bagaimana unit unit tersebut bekerja sebagai suatu kombinasi bukan lagi suatu unit yg individu. Integration testing sebaiknya dilakukan secara bertahap untuk menghindari kesulitan penelusuran jika terjadi kesalahan error atau bug.
4. UI test atau end two end, adalah yang paling dekat dengan interaksi pengguna pada aplikasi web. Ini Harus memicu tindakan yg tepat, data harus disajikan kepada pengguna status UI harus berubah sesuai yg diharapkan. Ini adalah testing tingkat tertinggi dengan menggunakan tools atau framework end two end test memberitahu browser atau apps apa yg harus dilakukan, Contoh klik, ketik, expected result yg diharapkan melalui test tersebut.

Kesimpulan dari pyramid test ini:
1. Semakin tinggi level semakin sedikit test yg harus kita lakukan, karena untuk membuat test case menjalankan di dalam Pipeline dan memaintenance memerlukan biaya yg lebih mahal. Testing di level rendah dari sebuah test pyramid cenderung berjalan lebih cepat karena tidak memerlukan pedoman dom yg lengkap dan mudah di-maintenance karena pengujian masih berskala kecil.
2. Penulisan test tiap level berbeda dari tingkat detailnya, kita harus fokus pada unit test, unit test yg kecil dan cepat untuk mencakup semua cabang pernyataan kondisi input dan output fungsinya. Menulis beberapa integration test untuk memastikan aplikasi kita memiliki behavior dengan benar
 3. Meskipun kita dapat menampilkan semua aplikasi dan koneksi dari ujung ke ujung untuk di test kita tetap tidak dapat menguji semua tipe testing apakah UI nya cocok dengan desain, itulah mengapa test level tinggi harus fokus pada scenario yg penting


#BDD With Cucumber memiliki beberapa tahapan:
1. Menulis story
2. Map steps to java
3. Configure story
4. Menjalankan story
5. View reports

#Tahapan Fundamental API:
1. Merekam, mendefinisikan API Information
2. Parsing, Filter atau merekam API Data, lalu mengekstrak
3. Rekonstruksi API Calls, dan mengirimkan mereka dari seorang Simulate client
4. Validasi testing

#Yang termasuk dari REST Assured adalah:
1. Mendukung Method HTTP
2. Mendukung BDD, Bahasa Gherkin
3. User of Hamcrest matches for checks
4. User of Gpath untuk selecting element from JSON response

#Macam-macam integrasi Fundamental API:
1. Mobile App
2. API Server
3. Ext Process
4. API Testing


#Api automation tools

Selain katalon, ada beberapa tools lain seperti postman, karate labs, rest assured, soapui, dan lainnya.
Katalon merupakan sebuah automation testing software yg dikembangkan oleh katalon inc. Dan dibangun berdasarkan menggabungkan open source selenium, apapun dengan interface IDE khsuus dan membuatnya menjadi katalon. Katalon rilis internal tahun 2015, sedangkan rilis di public 2016. 

Key features:
1. Simple deployment
2. Quick easy & setup
3. Faster and better result
4. Flexible modes
5. Easy of use
6. Multi os application


