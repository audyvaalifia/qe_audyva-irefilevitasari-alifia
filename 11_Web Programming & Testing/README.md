#####################################################################################################

WEB PROGRAMMING

#####################################################################################################
Proses web development sendiri terdiri menjadi 2: backend dan frontend.
Yg membedakan backend adalah bagian website yg tidak dapat berinteraksi langsung atau dilihat oleh user salah satu contohnya adalah database. Sedangkan yg lainnya yg dapat dilihat oleh user adalah frontend.

Frontend dibangun dari 3 komponen utama: html (sebagai struktur yg membangun komponen website yg kita buat) , css (yg membuat tampilan website menjadi lebih menarik), javascript (memberikan fungsi fungsi yg membuat website lebih interaktif dan hidup)

Html (hypertext markup language) bahasa yg menggunakan tag untuk membuat sebuah web. Kegunaan html: untuk menampilkan struktur konten yg ditampilkan pada halaman web, contoh table form gambar. Kegunaan HTML:
1. Membuat struktur halaman web
2. Membuat tabel, gambar, dan form
3. Mengatur tampilan
4. Mempublikasikan halaman web


Tools yg membantu: html editors (text editors) yg sebagai telat kita untuk mengedit code, contohnya notepad, vs code, atom, dll.

Tools kedua yaitu web browser yg berfungsi untuk menjalankan code html yg telah kita buat. 

Sintaks html menggunakan tag kurung siku.
- <title) untuk mengisikan nama web pada tab 
- <body> artinya badan html atau isinya
- <div> merupakan konten bagian html
- <h1> untuk heading 1 begitu pula hingga <h6>
- <p> untuk menuliskan paragraf
- <strong> untuk cetak tebal
- <em> untuk cetak miring
- <s> untuk baris tercoret
- <br> atau break untuk next line
- <a href="link> untuk membuat link
- <ing src="*.png"> untuk mengimpor gambar
- dll


#CSS

CSS atau Cascading Style Sheets digunakan untuk menghias halaman web seperti menghias color, size, font, backgrond, width, height, posisi halaman web. CSS dapat digunakan untuk membuat listing. CSS dapat digunakan pada html dengan eksternal, internal, dan inline. untuk memasukkan pada file yg sama dgn html, menggunakan tag <style> jika file yg berbeda, maka source letak css diimpor pada file html

#####################################################################################################

Web UI Testing 
#####################################################################################################

Merupakan melakukan testing pada web yg telah dibuat, qe mwmastikan yg dikerjakan software enginner sudah benar. ui test terpisah dari unit test oleh developer jadi qe tdk tergantung pada desktop yg digunakan developer. toolsnya seperti katalon, cypress, robot framework, testproject, dan serenity bdd. 

#Serenity BDD

merupakan lib opensource yg membantu tester dalam menulis automation advanced test yg leih struktur dan terawat lebih baik yg bisa menghasilkan laporan hasil pengujian yg menarik dan kaya makna. Arsitekturnya yaitu Pages, Steps, Requirements, Tests, Reports, dimana serenity bdd ini open source bdd framework. 

Untuk melakukan automation test, hal pertama yaitu:
1. define requirement, dimana kita membuat story nya dulu.
2. Ketika acceptance criteria kita sudah membuat feature dan scenario maka kita akna mendeskripsikan acceptance criteria di higlevel dan direkam, mengubah feature menjadi scenario.feature.
3. setelah membuat storynya, mengimplement test.
4. apabila di run akan muncul report dari testnya.

#BDD Framework with cucumber

BDD With Jbehave ditulis dalam bahasa java, sayangnya tersedia dalam bahasa java saja. 5 langkah:
1. Write story, dengan plain text agar mudah dipahami. bahasanya gherkin
2. Configure stories
3. Browser interaction
4. Run Stories
5. View Reports

