BASIC LINUX COMMAND

Basic Linux command adalah sebuah utilitas dari sistem operasi Linux, semua tugas dasar dan lanjutan akan dilakukan dengan menjalankan commands. Commands dijalankan di terminal Linux. Terminal merupakan antarmuka baris perintah untuk berinteraksi dengan sistem yang mirip dengan command prompt di OS windows. Command di linux sensitif dengan huruf besar dan huruf kecil.
Command di linux penuh dengan text-based dan lebih cepat dibandingkan menggunakan GUI.

Kelebihan:
1. Less resource, lebih ringan resource nya dibanding windows. Tanpa ssd Linux kenceng. Linux dulu digunakan utk mencukupi kebutuhan spek spek low
2. Repetitive Task Friendly, Multi tasking, lebih cepat
3. Powerful, karena hanya menggunakan text jadi lebih stabil daripada UI

Struktur command Linux yaitu Linux command penulisannya didahului oleh command nya option lalu parameter

command [options] [parameters]

Macam-macam command:
1. ls sendiri digunakan untuk melihat list file dan direktori pada sistem kita. ls -a akan menampilkan seluruh file termasuk yang tersembunyi.
2. cal merupakan command untuk memperlihatkan kalender bulan ini,
3. date merupakan command untuk menunjukkan tanggal dan waktu saat ini.
4. touch dan cat merupakan command yang sama-sama digunakan untuk membuat sebuah file. Namun bedanya, cat juga dapat berfungsi untuk membuat file baru yang berasal dari menggabungkan dua file yang diperintahkan.
5. mkdir digunakan untuk membuat sebuah direktori baru. 
6. cp digunakan untuk menyalin langsung sebuah file ke sebuah direktori yang hendak dituju.
7. mv digunakan untuk memindahkan sebuah file langsung ke direktori yang hendak dituju.
8. rm digunakan untuk menghapus sebuah file. 
9. cd untuk berpindah ke direktori yang dituju, cd .. untuk ke direktori sebelumnya
10. rmdir digunakan untuk menghapus sebuah direktori kosong. 
11. pwd command digunakan untuk mengetahui path direktori kita saat ini. 
12. top memunculkan daftar proses yang sedang berlangsung dan detail kapasitasnya/ruangnya. 
13. history menampilkan riwayat command yang sudah dijalankan sebelumnya. 
14. clear digunakan untuk menghapus seluruh command pada terminal. 
15. which untuk mengetahui dan mengidentifikasi lokasi executable tertentu yang dijalankan saat kita mengetikkan nama perintah di terminal. 
16. chmod digunakan untuk mengatur izin akses file mulai dari view edit dan eksekusi.
17. chown digunakan untuk mengubah atau mentransfer kepemilikan sebuah file ke pengguna lain. 
18. sudo untuk menjalankna program-program hak keamanan pengguna lain, ini dijalankan sebagai root
19. find digunakan untuk mencari file berada di direktori mana dan subdirektori mana

Struktur Bagan dari sebuah output command:

1. rwx merupakan permission
2. Angka setelahnya merupakan jumlah file
3. Nama orang setelahnya merupakan nama user
4. Nama setelah nama orang merupakan grup
5. Angka setelahnya merupakan ukuran
6. Penanggalan setelahnya merupakan tanggal dibuat
7. nama terakhirr merupakan nama file/direktori

Permission:
1. d: berkategori direktori
2. -: berkategori file
3. rwx pertama merupakan permission pemilik file
4. rwx kedua merupakan permission grup owner-nya
5. rwx ketiga merupakan permission untuk user lain
6. rwx= read write execute, ada juga yang tidak rwx
7. rwx memiliki bilangan biner 111 dan desimal 7

SHELL SCRIPT

Shell script merupakan sebuah bahasa pemrograman yang disusun berdasarkan command command Shell. Dan juga shell merupakan program yang berfungsi sebagai jembatan antar user dan kernel. Keuntungan di dunia QE: ketika harus mengeksekusi beberapa commands secara berturut turut itu membuat kita harus menunggu command pertama baru bisa melakukan command berikutnya, dengan adanya Shell script kita tidak perlu menunggu lagi dan cukup menuliskan apa saja yang akan dilakukan sesuai urutan kemudian di  eksekusi dengan satu px saja.

Langkah-langkah membuat shell script:
1. Membuat header dengan echo '#!/bin/sh' > namaskrip.sh
2. Membuat isi Shell script dengan echo echo 'echo Namaku Audyva I.A' >> namaskrip.sh
3. Menulis command cat namaskrip.sh
4. Menjalankan command chmod agar dapat diakses yaitu chmod 755 namaskrip.sh
5. Mengeksekusi shell script dengan command ./ yaitu ./namaskrip.sh



