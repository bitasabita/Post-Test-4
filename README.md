# Post-Test-4

| Nama                      | NIM           | Kelas             |
|---------------------------|---------------|-------------------|
| Tsabitah Kawiswara        | 2409116099    | Sistem Informasi C |
---
# 👟 Sistem Manajemen Koleksi Sepatu Digital 
---

## 📑 Daftar Isi 

<details>
<summary><h3>📄 Deskripsi Program</h3></summary>

<img width="297" height="170" alt="image" src="https://github.com/user-attachments/assets/3b49bae4-22d8-4077-bfec-12c1a406866b" />

Sistem manajemen koleksi sepatu digital adalah sebuah program yang dirancang untuk membantu mengatur dan menyimpan data sepatu secara lebih terstruktur. Dengan menerapkan prinsip Pemrograman Berorientasi Objek (OOP), sistem ini mampu menyajikan pengelolaan data yang efisien, rapi, dan mudah dipahami. Setiap detail sepatu, mulai dari jenis, warna, hingga ukuran, dapat dicatat dan diakses dengan lebih praktis tanpa harus bergantung pada ingatan atau catatan manual. Dengan demikian, koleksi sepatu menjadi lebih tertata, terorganisir, serta meminimalisir risiko kesalahan dalam pencatatan data.


</details>

---

<details>
<summary><h3>🗂 Struktur Packages (MVC)</h3></summary>

<img width="435" height="218" alt="image" src="https://github.com/user-attachments/assets/df783380-f071-4563-9a47-d47d60cc039c" />



Program ini disusun menggunakan konsep Model-View-Controller (MVC):

## 1. model:
Berisi class–class yang mewakili data atau objek nyata (dalam hal ini produk sepatu).

* **Produk Java** → menjadi superclass (class induk) yang menyimpan atribut umum dari semua produk yaitu nama, merk, warna

* **Sepatu Java** → menjadi subclass dari Produk, yang mewarisi atribut dasar dari Produk lalu bisa menambahkan atribut khusus, yaitu ukuran atau warna.

* **Sandal Java** → juga merupakan subclass dari Produk, dengan atribut tambahan yang berbeda dari Sepatu yaitu jenis sandal.

## 2. Service:

1. Berisi class SepatuService.java yang menjalankan logika utama program.

2. Di sinilah proses CRUD (Create, Read, Update, Delete) dilakukan untuk data sepatu.

3. Selain itu, service juga mengatur validasi input (contoh: ukuran harus angka, nama tidak boleh kosong) dan pencarian koleksi sepatu atau sandal.

## 3. main (com.mycompany.mavenproject4):

1. Berisi class Mavenproject4.java yang menjadi entry point program.

   Fungsinya:

   Menampilkan menu utama ke pengguna.

   Meneruskan pilihan pengguna ke SepatuService agar diproses.

2. Dengan kata lain, package ini menjadi penghubung antara user (input/output) dengan logika bisnis yang ada di service.

## 4. Interfaces:

Package ini dibuat khusus untuk menyimpan interface yang digunakan dalam program. Dalam Java, interface adalah bentuk dari abstraction yang berisi deklarasi method (tanpa implementasi) yang wajib diimplementasikan oleh class lain.

Interface InfoProduk bertujuan untuk:

1. Menstandarkan bahwa semua class yang mewakili produk harus punya method getDeskripsi()

2. Memungkinkan polymorphism karena kita bisa memanggil getDeskripsi() pada objek bertipe InfoProduk tanpa tahu class-nya





</details>

---

<details>
<summary><h3>⚙️ Konsep OOP yang Digunakan</h3></summary>

**Penjelasan Konsep OOP dalam Program**

## ✅ 1. Abstraction (Abstraksi)
Abstraksi diterapkan dalam program ini melalui:
Abstract class: Produk

Interface: InfoProduk
| Tipe           | Nama Class/Interface | Letak File                   | Fungsi/Penjelasan                                                                  |
| -------------- | -------------------- | ---------------------------- | ---------------------------------------------------------------------------------- |
| Abstract Class | `Produk`             | `Model/Produk.java`          | Merupakan class dasar dari `Sepatu` dan `Sandal`, mewakili produk umum.            |
| Interface      | `InfoProduk`         | `Interfaces/InfoProduk.java` | Menyediakan kontrak method `getDeskripsi()` yang harus diimplementasi oleh produk. |

>Sepatu dan Sandal mewarisi class abstract Produk dan mengimplementasi interface InfoProduk, sehingga class tersebut wajib menyediakan implementasi method getDeskripsi(). 

## 🔧 Letak penerapan abstraction dalam kode:

<img width="317" height="92" alt="image" src="https://github.com/user-attachments/assets/b12e99c3-1175-40bf-bc46-afcbef638f26" />

<img width="336" height="55" alt="image" src="https://github.com/user-attachments/assets/f034bd4c-f5c8-4c36-8424-eec9301352df" />

<img width="663" height="137" alt="image" src="https://github.com/user-attachments/assets/c3699ce2-be91-4030-8b1a-8d8a1a810ef7" />

<img width="629" height="114" alt="image" src="https://github.com/user-attachments/assets/3cd94ebd-a2f0-4298-8743-94b1ad601460" />


## 🔁 2. Polymorphism (Polimorfisme)

Program ini menerapkan dua jenis polymorphism:

🔸 a. Method Overriding (Polimorfisme Dinamis)

Method getDeskripsi() di-override di class Sepatu dan Sandal.

Meski method tersebut dideklarasikan di class abstract Produk dan interface InfoProduk, tiap class (Sepatu, Sandal) punya versi implementasi sendiri.

📌 Letak di kode:

Pada Class Sandal

<img width="648" height="117" alt="image" src="https://github.com/user-attachments/assets/18961a96-9dbe-4d73-8d32-937ad44c80a6" />

Pada Class Sepatu

<img width="629" height="107" alt="image" src="https://github.com/user-attachments/assets/7754798d-8c71-4fe8-9f58-4649106b0c59" />

🔍 Tujuannya: memungkinkan objek Sepatu dan Sandal menampilkan deskripsi berbeda walaupun dipanggil dari list ArrayList<Produk> (Polymorphism via inheritance/interface).

🔹 b. Method Overloading (Polimorfisme Statis)

Method tambahSepatu() di dalam SepatuService.java di-overload dengan dua versi:

Tanpa parameter (menggunakan input Scanner)

Dengan parameter langsung (nama, merk, warna, ukuran)

📌 Letak di kode:

<img width="672" height="278" alt="image" src="https://github.com/user-attachments/assets/933795da-bafb-4838-932c-54a4b6708d3f" />

🔍 Tujuannya: memudahkan pengguna menambah sepatu baik dari input langsung atau secara otomatis (misal untuk testing/data dummy).

✅ Kesimpulan

| Konsep          | Letak Implementasi                                                                      |
| --------------- | --------------------------------------------------------------------------------------- |
| **Abstraction** | Abstract class `Produk.java` dan interface `InfoProduk.java`                            |
| **Overriding**  | Method `getDeskripsi()` di-*override* oleh `Sepatu.java` dan `Sandal.java`              |
| **Overloading** | Method `tambahSepatu()` di-*overload* di `SepatuService.java`                           |
| **Kombinasi**   | Class `Sepatu` dan `Sandal` meng-*extend* abstract class dan meng-*implement* interface |















</details>

---


<details>
<summary><h3>🌟 Fitur Utama</h3></summary>

<img width="298" height="133" alt="image" src="https://github.com/user-attachments/assets/fb3cd9f2-d005-4579-a806-9bd5311dce6e" />


1. **Tambah Sepatu**: Pengguna bisa menambahkan sepatu baru dengan detail                               lengkap (nama, merk, warna, ukuran).
2. **Tambah Sandal**: Pengguna bisa menambahkan sandal baru dengan detail seperti (nama, merk, warna, dan jenis sandal)
   
3. **Tampilkan Semua Produk**: Untuk menampilkan seluruh produk yang pernah di tambahkan ke dalam koleksi baik sepatu maupun sandal
4.  **Perbarui Produk**: Untuk mengubah data sepatu atau sandal seperti ingin mengubah ukuran, warna, nama, merk ketika merasa data yang dimasukkan sebelumnya salah atau memang ingin melakukan perubahan pada data.
5. **Hapus Produk**: Menghapus data sepatu atau sandal  dari daftar jika sudah tidak diperlukan.
6. **Cari Produk**: Mencari sepatu ataupun sandal berdasarkan kata kunci, misalnya nama, merk, atau warna
0. **Keluar**: Menutup aplikasi dengan aman setelah pengguna selesai                             melakukan pengelolaan data

</details>

---

<details>
<summary><h3>🚀 Cara Menggunakan Program </h3></summary>

Berikut tampilan menu utama:  

<img width="298" height="133" alt="image" src="https://github.com/user-attachments/assets/fb3cd9f2-d005-4579-a806-9bd5311dce6e" />


<details>
<summary><h3>1️⃣ Tambah Sepatu</h3></summary>

Di menu ini, pengguna diminta mengisi detail sepatu: nama, merk, warna, dan ukuran. Data yang valid akan langsung tersimpan, lalu program memberi konfirmasi "Sepatu berhasil ditambahkan!". Data yang dimasukkan akan otomatis tersimpan dalam koleksi.  


<img width="295" height="253" alt="image" src="https://github.com/user-attachments/assets/9e00e1eb-a073-40f2-8cea-45ac3b0548e5" />


</details>

---

<details>
<summary><h3>1️⃣ Tambah Sandal</h3></summary>

Di menu ini, pengguna diminta mengisi detail sepatu: nama, merk, warna, dan jenis sandal. Data yang valid akan langsung tersimpan, lalu program memberi konfirmasi "Sandal berhasil ditambahkan!". Data yang dimasukkan akan otomatis tersimpan dalam koleksi.  


<img width="326" height="247" alt="image" src="https://github.com/user-attachments/assets/f2b5aca6-885e-4e0b-8f50-bf69c4d798e8" />


</details>

---

<details>
<summary><h3>3️⃣ Tampilkan Semua Produk</h3></summary>

Menu ini akan menampilkan semua sepatu dan sandal yang sudah ada dalam koleksi,informasi akan ditampilkan dalam bentuk list agar pengguna bisa melihat data dengan jelas. Kalau belum ada data, sistem akan memberi tahu bahwa koleksi masih kosong seperti dibawah ini: 

<img width="671" height="138" alt="image" src="https://github.com/user-attachments/assets/901d93e7-ed3a-4917-a4dc-c891b299e9eb" />


</details>

---

<details>
<summary><h3>4️⃣ Perbarui Produk</h3></summary>

Jika terdapat kesalahan data atau ada perubahan, pengguna dapat memperbarui informasi sepatu atau sandal yang sudah tersimpan. Pengguna memilih nomor sepatu atau sandal yang ingin diubah, lalu memasukkan data baru untuk mengganti yang lama. 

**Sebelum produk nomor 3 di perbarui:**

<img width="399" height="202" alt="image" src="https://github.com/user-attachments/assets/416c9b69-cd8a-414f-9d2c-9c17c76bf5dc" />

**Tampilan list koleksi setelah di perbarui:**

<img width="433" height="100" alt="image" src="https://github.com/user-attachments/assets/b52e4ae4-23e8-4e95-8dae-9b1c9efbe501" />


</details>

---

<details>
<summary><h3>5️⃣ Hapus Produk</h3></summary>

Menu ini memungkinkan pengguna menghapus sepatu tertentu dari daftar.Sistem akan menampilkan daftar sepatu dan sandal , lalu meminta konfirmasi data mana yang ingin dihapus. Sama seperti update, hanya nomor valid yang bisa dipilih. 

**Sebelum menghapus produk nomor 1:**


<img width="357" height="133" alt="image" src="https://github.com/user-attachments/assets/803dda1c-ed8e-4123-84a6-6a77ed8046a5" />


**Tampilan list koleksi ketika salah satu produk sudah di hapus:**


<img width="385" height="96" alt="image" src="https://github.com/user-attachments/assets/10bdd1a9-c7e7-451f-adde-feff6280d06d" />



</details>

---

<details>
<summary><h3>5️⃣ Cari Produk </h3></summary>

Fitur pencarian berfungsi untuk memudahkan pengguna menemukan data sepatu dan sandal tertentu ketika koleksi sudah cukup banyak. Pengguna hanya perlu memasukkan kata kunci berupa nama, merk, atau warna, kemudian sistem akan menampilkan daftar sepatu atau sandal yang sesuai dengan kata kunci tersebut. 

**Ketika kata kunci sesuai atau ada pada list koleksi:**


<img width="379" height="95" alt="image" src="https://github.com/user-attachments/assets/b8ac72cc-30f3-47bd-9f7f-82e853985f3e" />


**Ketika kata kunci tidak ada pada list koleksi:**


<img width="405" height="95" alt="image" src="https://github.com/user-attachments/assets/8e082e30-ae70-4002-b77e-f3576a6f1334" />


</details>

---

<details>
<summary><h3>6️⃣ Keluar Program</h3></summary>

Jika pengguna ingin keluar dari program, cukup memilih opsi 0 (Keluar) pada menu utama. Setelah dipilih, sistem akan menampilkan pesan “Terima kasih, program selesai.” sebagai tanda bahwa program sudah dihentikan. Bagian bawah layar juga menampilkan informasi dari Java, yaitu status BUILD SUCCESS yang berarti program berhasil dijalankan tanpa error, serta waktu total eksekusi program hingga selesai.


<img width="410" height="152" alt="image" src="https://github.com/user-attachments/assets/9a5dec09-afec-4a51-9d6a-a71e91d6aac4" />


</details>

</details>

---

<details>
<summary><h3>✅ Validasi Input (MVC)</h3></summary>
   
Pada program ini terdapat validasi input yang berfungsi untuk mencegah terjadinya output yang salah akibat data yang dimasukkan pengguna tidak sesuai format. Misalnya, untuk input merek, warna, dan nama sepatu, data yang dimasukkan harus berupa huruf. Sebaliknya, untuk input ukuran sepatu atau saat memilih menu program, data yang dimasukkan harus berupa angka. Jika pengguna memberikan input yang tidak sesuai, maka program akan menampilkan peringatan agar pengguna memasukkan data dengan format yang benar.


**1. Berikut adalah contoh ketika pengguna memasukkan data angka pada input nama sepatu (yang seharusnya huruf). Program akan menampilkan peringatan bahwa format input tidak sesuai.**


<img width="412" height="215" alt="image" src="https://github.com/user-attachments/assets/223f4d1c-04ae-4bdd-baf9-c991ae577e43" />


**2. Berikut adalah contoh ketika pengguna memasukkan data angka pada input merek sepatu. Program akan menolak input tersebut dan meminta pengguna memasukkan data dengan format huruf.**


<img width="369" height="35" alt="image" src="https://github.com/user-attachments/assets/48533167-a8c9-4f75-9e01-0eb8404c677e" />


**3. Berikut adalah contoh validasi input ketika pengguna memasukkan data yang salah pada input warna sepatu. Program akan menampilkan peringatan agar pengguna menginputkan huruf.**


<img width="364" height="39" alt="image" src="https://github.com/user-attachments/assets/f539311e-0c64-4849-8a04-947f3a39fa49" />


**4. Berikut adalah contoh validasi input pada ukuran sepatu. Jika pengguna memasukkan huruf (bukan angka), maka program akan menampilkan peringatan dan meminta pengguna untuk menginputkan angka.**

   
<img width="260" height="37" alt="image" src="https://github.com/user-attachments/assets/550c6662-1031-4ffe-bd68-75ff2a22eecd" />


**5. Berikut adalah contoh validasi input pada menu pilihan. Jika pengguna memasukkan angka yang tidak ada dalam daftar opsi, maka program akan menampilkan peringatan bahwa pilihan tidak valid.**


<img width="322" height="182" alt="image" src="https://github.com/user-attachments/assets/e71e9b62-28a7-4814-bdd5-d774abb7f2d5" />

</details>

---
