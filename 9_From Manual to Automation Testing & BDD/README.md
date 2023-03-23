#######################################################################################################

Introduction to automation testing

#######################################################################################################

Yang kita ketahui dalam melakukan testing atau pengujian kita bisa melakukan nya dengan dua cara yaitu secara manual dan secara otomatis.

1. Manual testing

Sebuah testing yang kita lakukan secara manual. Tujuan: untuk exploratory artinya untuk mengeksplor, mengobservasi semua fitur yang telah dikembangkan pada sebuah aplikasi. Kita menggunakan manual testing karena:
- exploratory, untuk menjelajah fitur fitur apa saja yg sudah dikembangkan pada sebuah aplikasi
- sangat cepat untuk dilakukan jika terdapat perubahan kecil pada sebuah aplikasi. Kita bisa menguji fitur yg baru mengalami perubahan sedikit tadi secara langsung 
- digunakan untuk pengujian usability, untuk memastikan sebuah aplikasi dapat digunakan dengan nyaman oleh pengguna.

Keuntungan:
- manual testing dapat mendapatkan feedback secara cepat dan akurat. Karena kita cukup menjalankan testing secara manual tanpa perlu mempersiapkan skrip tertentu
- lebih murah karena kita tidak perlu menyiapkan budget untuk beli automation tools
- sangat cocok untuk menguji perubahan yg sifatnya minim atau kecil karena dengan manual testing ini kita bisa menguji langsung perubahan tersebut tanpa perlu mempersiapkan skripnya.

Kelemahan:
- sering terjadi error atau kesalahan
- tidak bisa direkam, jika akan menjalankan testing tersebut maka kita harus menjalankan test tersebut secara manual



2. Automation testing

Sebuah pengujian atau testing yg kita lakukan secara otomatis, caranya kita menggunakan sebuah automation tool, contohnya jmeter, selenium, katalon, dsb.
Tujuan: efisiensi karena automation testing sangat cocok untuk mengeksekusi test case yg sangat banyak secara otomatis. Bisa kita gunakan untuk mengukur coverage, mengukur seberapa banyak fitur yg telah kita uji.
Kita menggunakan automation testing karena:
- flexibility, karena di automation testing kita bisa menggunakan kembali testing yg telah kita buat sebelumnya
- sangat cepat untuk menguji fitur yg banyak dan kompleks.
- untuk mengukur coverage atau seberapa banyak fitur yg telah kita uji
- potensi terjadinya eror atau kesalahan bisa diminimalisasi

Test case yg cocok untuk dilakukan automasi:
- test case yg dieksekusi secara berulang
- test case yg mungkin jika dilakukan secara manual akan sedikit susah, sehingga hal tsb dapat kita atasi dgn Automation testing
- test case yg mungkin memakan waktu yg cukup banyak jika dilakukan secara manual, proses untuk menjalankan testcase bisa dijalankan secara efektif dan efisien dgn menggunakan automation testing

Testcase yg tidak cocok untuk dilakukan automasi:
- test case yg baru saja dirancang, yg belum dieksekusi secara manual
- test case yg mungkin memiliki kebutuhan yg sering berubah sehingga kurang cocok jika dilakukan Otomasi

Proses dalam melakukan automation testing:
1. Pemilihan test tool
Pastikan disesuaikan dengan kebutuhan nya, faktor2 yg diperhatikan:
- sisi usability apakah test tool tersebut dapat digunakan dengan baik dan cocok dengan requirement nya atau kebutuhan nya
- apakah test tool tersebut simple atau tidak terlalu ribet
- Pastikan test tool yang kita gunakan memiliki budget yg cukup

2. Mendefinisikan lingkup atau scoop yg akan diotomasi
Kita harus menentukan test case apa saja yg cocok untuk dilakukan pengujian secara otomatis.

3. Melakukan perencanaan, desain, dan menulis sebuah skrip untuk melakukan automation testing

5. Eksekusi test
Setelah buat skripnya, kita eksekusi test tersebut. 

6. Maintenance
Setelah mengeksekusi test tersebut, melakukan maintenance, yaitu kita review, melakukan perubahan, agar proses Automation testing nya bisa berjalan lebih efektif dan lebih efisien.

Praktik terbaik dalam melakukan automation testing:
- kita harus memerlukan scoop untuk dilakukan automation testing, untuk mendefinisikan scoop harus detail dan cocok dengan test case nya
- kita harus memilih automation tools yang sesuai dengan kebutuhan kita
- dalam menulis skrip selayaknya kita menulis sebuah kode program kita harus memenuhi standard dalam menulis skrip agar nantinya dapat dilakukan refactoring dengan lebih mudah, selain itu dengan menulis skrip sesuai standar maka skrip tsb dapat berjalan efektif dan efisien
- pastikan setelah kita melakukan automation testing, kita harus mengukur metric metric nya


##########################################################################################

#BDD

##########################################################################################

TDD (Test Driven Development) merupakan proses software development yang menerapkan penulisan test case sebelum developer menuliskan preaction codenya. Proses TDD sendiri berfokus pada komponen komponen dalam sistem dan testcase ditulis dalam berbahasa pemrograman, serupa dengan TDD, BDD (Behavior Driven Development) juga melakukan konsep test first, namun dengan fokus yg berbeda, dalam BDD Test, tim developer akan menuliskan berbagai scenario yang menjelaskan behavior system dari perspektif pengguna, scenario dituliskan menggunakan format bahasa yang sudah dipahami oleh seluruh stakeholder dalam pengembangan sistem. 

Tujuan BDD: untuk meningkatkan komunikasi dan kolaborasi antara seluruh stakeholder inbusiness maupun technical yang terlibat dalam pengembangan sistem, hal ini dapat membantu memastikan bahwa fitur fitur dalam sistem dapat dipahami dengan baik oleh seluruh anggota tim. Komunikasi yang baik dapat menyatukan persepsi stakeholder yg berbeda-beda dalam suatu pemahaman dan ekspektasi yang sama, serta fitur fitur dalam sistem dapat memenuhi kebutuhan pengguna.

Prinsip dasar dari BDD adalah deskripsikan behavior dari sebuah sistem tanpa melibatkan penjelasan implementasinya secara rinci. Terdapat pemisahan antara keduanya dalam pendekatan BDD seluruh stakeholder technical maupun nontechnical saling berkolaborasi untuk mendeskripsikan kebutuhan pengguna dan kebutuhan fungsional sistem yang dituliskan melalui feature files. Deskripsi yang ada dalam feature files berperan sebagai test logic yang kemudian akan menjadi dasar bagi quality assurance. Dalam menuliskan test script untuk implementasi pengujian dan dasar bagi developer dalam menuliskan implementation codenya untuk membangun sistem.

Feature files dalam BDD dituliskan menggunakan bahasa Gherkin dengan format berbahasa Inggris yang mudah dipahami oleh siapapun. Terlepas dari technical knowledge yg dimiliki, dengan demikian non technical stakeholder dapat cepat memahami test logic tanpa perlu memahami implementasi menggunakan code pemrograman yg lebih kompleks. Begitu pula sebaliknya, technical stakeholder atau developer dapat turut memahami aspek bisnis dari sistem yang mereka implementasikan. Secara mendasar terdapat tiga tahapan untuk melakukan test dalam BDD:
1. Menentukan user story nya, untuk menjelaskan kebutuhan pengguna dan fungsionalitas sistem yang diharapkan.
2. Menuliskan scenario dalam feature files. Menggunakan Gherkin syntax berdasarkan user storynya
3. Mengimplementasikan test script dalam state files berdasarkan scenario, contoh: user story memiliki format standar yaitu 
(As a, i want, so that) dalam menjelaskan kebutuhan pengguna untuk login dalam suatu akun, user story yang terbentuk adalah (as an existing user, i want to login to my account, so that i can see my homepage). Selanjutnya user story dituliskan dalam scenario sebuah feature files terdiri dari satu atau lebih scenario yg menjelaskan apa saja yang seharusnya dilakukan oleh sistem dalam situasi tertentu. Terdapat 3 keyword sebagai elemen utama dalam scenario BDD: 
- given (menjelaskan konteks dari scenario)
- when (menjelaskan tindakan yg dilakukan oleh user)
- then (menjelaskan outcome dari tindakan yg dilakukan oleh user)
Contoh menggunakan bahasa Gherkin:
- Feature: login 
- Scenario: login 
As an existing user, given i go to my application login page, when i feel incorrect username and password and click login, then i see my homepage. 

Scenario dalam feature files tersebut kemudian akan digunakan sebagai panduan untuk mengimplementasikan test script yang disebut dengan steps dalam BDD.


CUCUMBER

Untuk melakukan serangkaian behavior test ada sebuah tools yg disebut cucumber. Cucumber adalah sebuah tools yg mendukung BDD. Cucumber membaca semacam ketentuan yg dapat dieksekusi dimana ditulis menggunakan teks biasa dan ketentuan tersebut memvalidasi bahwa sistem atau aplikasi melakukan apa yang dituliskan dalam ketentuan tersebut. Ketentuan tersebut terdiri dari beberapa scenario.
