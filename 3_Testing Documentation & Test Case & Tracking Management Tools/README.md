#TESTING DOCUMENTATION (TEST SCENARIO - TEST CASE)

Test scenario adalah sebuah dokumen yang berisi sekumpulan langkah-langkah sistematis yang disusun oleh software tester agar sistem yang dites dapat memenuhi ketentuan yg diinginkan oleh user, memenuhi standar tertentu serta dapat berfungsi dengan baik.

Test scenario merupakan tingkatan tertinggi dari sebuah test case
Tujuan: Memudahkan developer dan tester  untuk testing, menjadikan dasar pengembangan sebuah projek, sebagai dasar klien menyesuaikan dengan sistem requirement.

Tools: Spreadsheet, testrail, testlink, dll

Kriteria test scenario:
1. In language system requirement, adalah kunci sehingga kita dapat menyusun skenario teks sesuai flow yg telah ditentukan 
2. Give context
3.  Give detail
4. Crystal clear easy to understand
5. Complete
6. Koheren
7. Proof
8. Consistent
9. End user mind don't Assume
10. Don't forget gover negative test
11. Think of set out the box
12. Update

Contoh test scenario:
1. Cek fungsional login
2. Cek fungsional forgot email
3. Cek fungsional create new account

Test case

Test case/uji kasus adalah suatu rancangan atau rangkaian mengenai tindakan yg dilakukan oleh software tester untuk melakukan verifikasi terhadap fitur atau fungsi tertentu dari sebuah perangkat lunak.

Tujuan: memastikan suatu sistem dapat dijalankan dengan baik sesuai dengan kebutuhan awal serta mampu memberikan respon ketika dapat suatu masukan yg tidak valid.

Komponen:

Test case id, test case description, precondition, test step, expected result, actual result, dan status.
Titik awal dari pelaksanaan pengujian sebuah sistem. Diketahui Apakah sistem berjalan normal atau tidak.

Yang diperhatikan:
1. Test case harus sederhana dan transparan
2. Test case dibuat dengan end user in mind
3. Hindari pengulangan kasus uji
4. Jangan berasumsi
5. Pastikan bahwa pengujian sudah mencakup semuanya
6. Harus dapat diidentifikasi
7. Repeatable dan softstanding
8. Peer review

Contoh test step:

Dari test scenario tadi kita bisa membuat beberapa test case :

Test scenario login, test casenya:
1. Masukkan email valid dan password valid
2. Masukkan email valid dan password invalid
3. Masukkan email invalid dan password valid
4. Masukkan email invalid dan password invalid 
Test case nomor 2 hingga 4 termasuk negative test case.


#####################################################################################################################################################################

#TEST CASE MANAGEMENT TOOLS

Test case management tools adalah situs atau software yang digunakan oleh software tester untuk menyimpan informasi terkait bagaimana pengujian produk harus dilakukan, perencanaan kegiatan pengujian serta dokumen terkait laporan status kegiatan penjaminan kualitas produk.

Kita membutuhkannya karena:
1. Plan dan estimasi
2. Monitoring dan controlling
3. Reporting and integrate with another tools, seperti jira dll.
Contoh test case management tools: testrail, testlink, Zephyr, qtest, practitest, tclab.

Testrail:
1. Login ke testrail dulu
2. Bikin projek : add projek > input nama projek
3. Pilih single Rep for all access
4. Klik add project, lihat overview dari project (overview kosong)
5. Klik menu milestone > add milestone (cara untuk melacak timeline dan progres suatu projek)
6. Input beberapa field yg harus diisi: name, description (tujuan milestone), start date, end date > add milestone
7. Akan muncul milestone kita > membuat test run (step untuk kita mengeksekusi test case yang sudah kita pilih untuk milestone yg sudah kita tentukan sebelumnya)
8. Menu test run > add test run
9. Input nama test (misal isi tanggal yg dijalankan) > pilih milestone > pilih assign to > description (isi tujuan dari testun) > pilih include all test cases > add test run
10. Muncul overview projek/report
11. Membuat test plan > klik menu test runs & results > pilih add test plan (merupakan sebuah blueprint untuk melakukan proses pengujian, dokumen yg berisi rencana untuk semua kegiatan pengujian yang harus dilakukan untuk menghasilkan produk yg berkualitas. Test plan = dokumen dinamis)
12. Input field: input name, pilih milestone, input description (tujuan) > add test plan
13. Muncul overview
14. Untuk membuat test case, ke menu test case > add test case
15. Input field: title (judul testcase), section, template (text/steps), type (functional), input precondition (kondisi dimana test case dilakukan sebelum step2 itu dilakukan), input steps (isi beberapa langkah langkah), input expected result
16. Add test case
17. Pilih menu test run and result (terdapat test plan dan test run) > jalankan dgn pilih test run > masuk ke milestone > start > start milestone 
18. Test manual > update status (passed/blocked/retest/failed), pilih assign to (diri sendiri), input comment, tambahkan bukti apabila berhasil (opt) > add result
19. Hasil overview berubah


####################################################################################################################################################################

#TRACKING MANAGEMENT TOOLS

Tracking management tools adalah sebuah software yang digunakan dalam mengolah suatu proyek atau development software agar bisa berjalan secara efisien dan efektif. Seperti jira, trello, dsb.

Yang dibahas: jira

Jira adalah salah satu alat bantu yg bertujuan untuk pelacakan bug, pelacakan isu, dan manajemen proyek. 

Ada beberapa fitur: test assignment, scrum and kanban bug tracking, roadmaps, konektivitas dengan aplikasi lain, pelaporan/reporting.

Cara menggunakan jira dgn metode scrum:
1. Pastikan ada akses di jira 
2. Klik menu projek > pilih sub menu create project > pindah ke halaman baru
3. Pilih metode scrum > konfirmasi scrum template > pilih project type (team-managed)
4. Membuat nama projek > klik tombol create project
5. Muncul 3 panel untuk mengetahui projek: to do, in progress, done (Apabila dalam sebuah tim maka akan muncul: finish deliver  testing need fix)
6. Buat panel dgn klik button + > input nama panel, (begitu seterusnya)
Penjelasan panel:
a. Todo: berisi story yg akan dikerjakan dan sudah diprioritaskan saat planning (paling atas paling prioritas)
b. In progress: berisi story yg sedang dikerjakan oleh developer/SE
c. finish: berisi story yg sudah selesai dikerjakan para developer namun belum siap testing
d. Deliver: berisi story yg siap memasuki tahap testing oleh qe
e. Testing: berisi story yg sedang ditesting oleh qe
f. Need fix: berisi hasil testing yg tidak lolos kriteria oleh tim development
g. Done: berisi hasil testing yg sudah lolos kriteria oleh tim development
7. Klik button pada panel untuk membuat issue > input field: project (qe-alta) > issue type (story/task/bug/epic) > input summary (judul issue yg akan dibuat) > input description (maksud dari issue, apabila story maka diisikan acceptance criteria) > input assignee > input label (untuk filter) > sprint > prioritas (highest/high/low/lowest/medium) > input reporter (pembuat issue) > attachment field dst opsional > klik button Create (isu yg dibuat tadi akan masuk ke menu backlog)
9. Pilih menu backlog untuk melihat story yg udah kita buat


Apa yang harus diperhatikan qe pada jira? Ketika menemukan bug saat testing, pertama kita harus membuat issue bertipe bug, kemudian jelaskan di isu tersebut kondisi skrg seperti apa, expected seperti apa, dan langkah langkah untuk melakukan testing tersebut, kemudian pindahkan story atau issue yg berkaitan dengan bug ke panel in progress.
