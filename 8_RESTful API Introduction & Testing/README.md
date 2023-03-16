###############################################################################

API & REST API

###############################################################################

API/application programming interface merupakan suatu penghubung yang memungkinkan suatu aplikasi untuk berinteraksi dengan aplikasi lainnya dan berbagi data, tujuan: untuk mempercepat proses development dengan menyediakan function secara terpisah sehingga developer tidak perlu membuat fitur yg serupa. Peran: membawa pesan yg menerima  permintaan dari pengguna dan memberitahukan sistem apa yg harus dilakukan lalu memberikan respon yg sesuai dengan permintaan tersebut.

Workflow:

Klien memberikan req ke waiter, waiter memberikan req ke chef, chef memberikan respon ke waiter dan waiter memberikan respon ke klien. Waiter adalah api, chef adalah sistem/server. Disini kita bisa melihat bahwa api berperan sbg pembawa pesan yg menerima permintaan klien dan memberitahukan sistem apa yg harus dilakukan,lalu memberikan respon sesuai dr req tsb.

REST API

REpresentational State Transfer merupakan standar aspek komunikasi berbasis web yg sering diterapkan dalam pengembangan layanan berbasis web. Umumnya menggunakan http sbg protokol utk komunikasi data. Data yg digunakan dalam rest api umumnya adalah json.


HTTP
HTTP dirancang utk memungkinkan komunikasi antar klien dan server. Fungsinya sbg protokol respon dari permintaan klien dan server. 
Contohnya klien mengirimkan req http ke server kemudian server mengembalikan respon ke klien. 


Http method yg dipake: 
1. Get (Membaca data)
2. PUT (Membuat atau mengganti data)
3. POST (Membuat data baru)
4. DELETE (Menghapus data yang ada)

Komponen REST API:
1. Method
2. URL: cara kita melakukan req
3. Header: berisi informasi otentikasi bahwa pesan itu susah
4. Body: mendefinisikan parameter yg akan dikirim ke server

JSON: javascript object notation adalah sebuah format data yg digunakan untuk pertukaran dan penyimpanan data, json: bagian dr javascript. Json dibaca dalam berbagai bahasa pemrograman. Json ideal utk pertukaran apk.

- 200: req yg dikirim sukses.
- 201: sukses dan resource berhasil dibuat, biasanya dipakai method post dan put
- 400: melakukan req post atau put tp data tidak sesuai dan ada kesalahan dalam formatnya.
- 404: resource yg diperlukan tidak ditemukan
- 401: kita tidak melakukan otentikasi terlebih dahulu sebelum melakukan req
- 405: http yg digunakan kita req tidak support atau salah http
- 500: karna ada kesalahan di server.


Salah satu tools api testing yakni Postman.
Praktik, download dan install postman.
Buat folder di collection, beri nama, folder tsb dibuatkan new request. Contohnya pakai method http, ada GET POST PUT DELETE, tiap method nanti memiliki respon yang berbeda beda. Masukkan url nya dahulu, lalu klik send (utk method GET dan DELETE) Apabila method POST dan PUT, masukkan kode pada body>raw dan ganti tipe teks jadi json, lalu send.




###############################################################################

#API TESTING

###############################################################################

API Testing adalah test yang dilakukan pada layer dimana API yang didesain untuk berinteraksi atau komunikasi pada aplikasi dipastikan fungsional test nya melalui rangkaian atau set dari sebuah tes

Tujuan: Meluaskan cakupan testing itu sendiri dan melakukan testing sedini mungkin dimana gui belum sepenuhnya siap untuk diikutsertakan dalam proses testing. Api testing dibedakan menjadi 3 macam:
- Functionality: Yakni ditujukan untuk memvalidasi suatu fitur apakah sudah berfungsi atau belum, 
- Load test: Load test tujuan menguji kekuatan suatu sistem apakah mampu mengolah data dari beban yang diberikan
- Security: Tes ini memiliki tujuan untuk menguji keamanan dari suatu sistem 

Ada beberapa tools yang sering dipakai untuk api testing: postman, frisby, jmeter, rest assured

Perbedaan unit test dan api test
- Unit test dilakukan developer sedangkan api test tidak, tester perform it
- Fungsi fungsi unit test terpisah, sedangkan api test end to end
- Pada unit test, developer bisa mengakses source code sedangkan api test developer tidak bisa, hanya fungsi api saja
- Pada unit test, hanya dasar functionality yang di test sedangkan api test semua functional issue ditest 
- Scope unit test terbatas sedangkan Scope api test lebih luas
- Biasanya unit test dilakukan sebelum build, sedangkan api test dilakukan setelah build 

Ada tahapan proses yg harus dilalui dalam melakukan api testing yakni
1. Spesification review: tujuan: mereview dari spesifikasi api dan use case document
2. Test spesification development. Tujuan: untuk memastikan detail dokumen mengenai test condition dan ekspektasi hasilnya di setiap test case
3. Test framework development. Kita harus memilih untuk memakai tools apa dalam api testing nanti
4. Test case development. Kita akan membuat test scenario maupun test casenya
5. Eksekusi test scenario yg telah kita buat. Lalu membuat report dari testing yang sudah kita lakukan

Contoh test case dalam api testing:
1. Apakag mendapatkan response yang sesuai dengan inputan?
2. Apakah memberikan response atau tidak?
3. Apakah mengganggu fitur yang lain atau tidak?
4. Update struktur data
5. Memodifikasi data yang ada

Best practice API testing:
1. Kelompokkan test case ke dalam beberapa kategori
2. Beri judul yang sesuai pada setiap test
3. Harus berhati-hati ketika melakukan test yang berhubungan dengan menghapus sesuatu
4. Ketika membuat test case harus dipikirkan juga segala kombinasi input pada api

Tipe output dari API:
1. Bisa berbentuk apa saja, namun pada umumnya JSON atau XML
2. Status response apakah passed atau fail
3. Memanggil fungsi API lain 

Tipe-tipe test yang umum pada API Testing:
1. Memverifikasi apakah kita mendapat respon dari API.
2. Memverifikasi apakah hasil input/request sudah sesuai atau belum
3. Memverifikasi apakah saya yang kita input/update sudah benar-benar berubah atau bertambah
4. Memverifikasi waktu response yang diberikan

Macam macam bug yang dideteksi API Testing:
1. Gagal melakukan error handling pada keadaan tertentu
2. Kesulitan untuk tersambung dan mendapat respon API
3. Isu keamanan
4. Performance issues
5. Eror atau warning yang tidak tepat
6. Struktur dari data respon tidak benar (JSON&XML)

Keuntungan dari API Testing:
1. Efisiensi waktu
2. Bahasa yang independen.
3. Mengurangi biaya testing
4. Mengurangi risiko

Tantangan melakukan API Testing:
1. Kombinasi parameter, pemilihan parameter
2. Tidak ada GUI
3. Kita harus mengetahui terlebih dahulu parameter
4. Perlu juga mengetest error handling dari setiap API


Kesimpulan:

Api terdiri dari kumpulan class atau function ataupun prosedur yang mana merepresentasikan buisness logic. Jika api tidak ditest sebaik mungkin itu akan menyebabkan masalah pada api. Bahkan bisa juga pada aplikasi nya. Api testing ini sangat diperlukan dalam software engineering.




