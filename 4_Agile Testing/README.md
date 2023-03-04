#AGILE TESTING

SDLC (Software Development Life Cycle) merupakan proses yg digunakan untuk merancang mengembangkan dan menguji software berkualitas tinggi.

Tujuan: untuk menyediakan alur terstruktur dalam membantu organisasi menghasilkan software berkualitas tinggi yg diselesaikan dalam perkiraan waktu yg singkat dan biaya yang lebih rendah namun tetap memenuhi atau melebihi harapan pelanggan, dimulai dari mengevaluasi sistem yg ada untuk mendefinisikan sistem yg baru

Fungsi SDLC:
1. Sebagai sarana komunikasi dari tim developer dengab pemegang kepentingan 
2. Membagi peranan dan tanggungjawab yg jelas antara developer designer buisness analyst dan juga manajer proyek
3. Dapat memberikan gambaran input dan output yg jelas dari satu tahap menuju tahap selanjutnya

Tahapan:
1. Requirement gathering (perencanaan, analisis kebutuhan: kelebihan dan kekurangan)
2. Design (model, cara kerja, aspek: komunikasi, programming, arsitektur, user interface, platform, security, membuat prototipe)
3. Development/code (program/code ditulis jika kecil 1 developer, jika besar beberapa tim, memakan waktu lebih panjang)
4. Testing (testing: kualitas kode, functional testing, integration testing, performance testing, dan security testing. Menggunakan perangkat continuous integration)
5. Deployment (tersedia pada user untuk digunakan, bisa saja melakukan pembaruan, menerima feedback user)
6. Maintenance (sudah selesai, namun pengguna dapat menemukan bug yg tidak ditemukan saat pengujian)

Model sdlc:
1. Waterfall model (tertua, jika fase satu selesai fase selanjutnya harus dimulai, kekurangan: jika ada satu detail kecil tertinggal maka keseluruhan berantakan)
2. Agile model (memisahkan produk dengan proses dan waktu pengerjaan secara tepat, sangat efektif dalam keberhasilan produk, kekurangan: memicu proyek ke arah yg salah dan tidak sesuai dengan kemauan dan ekspektasi customer)
3. Iterative model (repetesi tinggi, developer menciptakan versi cepat dan murah, akan merevisi jika ada kesalahan, kekurangan: dapat mengonsumsi bahan baku jika ada salah satu detail yang tertinggal untuk dikerjakan)
4. Visit model (lanjutan dari waterfall model, model ini akan mencoba tiap fase dalam proses pengembangan suatu produk
5. Bigband model (model ini model yg diklaim memiliki risiko tinggi saat dijalankan, hal ini dikarenakan tim akan menginvestasikan semua bahan baku pada pengerjaan proyek tersebut sehingga berhasil apabila proyeknya kecil tapi bahaya apabila proyeknya besar)
6. Spiral model (fleksibel, mirip iterative model, fokus pada repetisi dalam pengerjaan)

#Agile Testing Manifesto
Salah satu pengaruh dari testing manifesto: dgn adanya kondisi kebutuhan untuk mengukur dan meningkatkan upaya pengujian kita sebagai seorang qe dapat mengevaluasi dan meningkatkan seberapa baik kita melakukan software testing
Yang salah dan jauh dari agile testing manifesto: Qe tidak bisa bekerja hingga proses development selesai 

5 kunci:
1. Testing is an activity not a phase (qe bekerja beriringan dengan proses development, tidak terpisah atau membentuk fase sendiri)
2. Prevent bugs rather than finding bugs (bug muncul karena requirement yg kurang lengkap, cegah dgn kita tulis dulu seperti apa requirement dari fitur yang akan kita kerjakan sebelum menulis code)
3. Don't be a checker be a tester (memberikan feedback dengan apa yg sedang kita test)
4. Don't try to break the system, instead help build the best possible system (qe melakukan positive test dan negative test, namun kita harus mengetahui tujuan utama: menciptakan produk yg berkualitas, maka qe seharusnya memposisikan dirinya sebagai user dan menilai produk sesuai perspektif user)
5. The whole team is responsible for quality, not just the tester (seluruh tim bertanggung jawab dengan quality system, tidak dibebankan ke salah satu anggota saja misal ditemukan bug setelah launching, itu bukan dibebankan ke qe atau developer saja tapi semua tim harus tanggung jawab)

#Testing Pyramid

Testing Pyramid adalah strategi yang dapat membantu tim development dan automation dalam membuat software testing yg berkualitas tinggi dan andal.
Tiga level testing Pyramid dari paling bawah ke atas: 
1. Unit test (untuk memvalidasi setiap unit dari code perangkat lunak dapat berjalan seperti yg diharapkan)
2. Integration testing (pengujian dari hasil penggabungan unit2 yg ada di dalam software, sebaiknya dilakukan secara bertahap untuk menghindari kesulitan penelusuran jika terjadi kesalahan eror)
3. Ui test (yg paling dekat dengan interaksi pengguna pada apk web maupun mobile, user input harus memicu tindakan yg tepat)

Berdasarkan testing Pyramid kita dapat memperhatikan beberapa hal penting seperti:
1. Semakin tinggi level semakin sedikit test yg harus kita lakukan, karena semakin tinggi memerlukan biaya lebih mahal. Testing lebih rendah dari testing Pyramid cenderung berjalan lebih cepat karena tidak memerlukan pedomandom yg lengkap dan mudah di-maintenance karena testing berskala kecil.
2. Penulisan test tiap level berbeda tingkat detailnya
3. Meskipun kita dapat menampilkan semua aplikasi dan koneksi dari ujung ke ujung untuk dites, kita tetap tidak dapat menguji semua tipe testing apakah UI nya cocok dengan design, itulah mengapa test level tinggi harus fokus pada scenario yg penting

