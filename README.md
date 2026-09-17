# Aplikasi Nilai Mahasiswa

Aplikasi sederhana berbasis **Java Console** untuk mengelola data nilai mahasiswa. Project ini dibuat sebagai tugas mata kuliah **Object-Oriented Programming (OOP)** dengan menerapkan konsep **Array of Objects** serta konsep dasar OOP.

## Fitur

Aplikasi memiliki beberapa fitur utama:

* Menambahkan data mahasiswa
* Menampilkan seluruh data mahasiswa
* Mencari mahasiswa berdasarkan NIM
* Menghitung rata-rata nilai mahasiswa
* Menampilkan mahasiswa dengan nilai tertinggi
* Keluar dari aplikasi

## Konsep yang Diterapkan

Project ini menerapkan beberapa konsep dasar OOP:

### 1. Class dan Object

Class `Mahasiswa` digunakan sebagai blueprint untuk membuat objek mahasiswa.

```java
Mahasiswa mahasiswa = new Mahasiswa(nim, nama, nilai);
```

### 2. Encapsulation

Data mahasiswa dibuat sebagai atribut `private` dan diakses menggunakan method getter.

```java
private String nim;
private String nama;
private double nilai;
```

### 3. Array of Objects

Array digunakan untuk menyimpan beberapa objek `Mahasiswa`.

```java
private Mahasiswa[] daftarMahasiswa;
```

Array dibuat dengan kapasitas tertentu:

```java
daftarMahasiswa = new Mahasiswa[kapasitas];
```

Setiap elemen array dapat menyimpan objek `Mahasiswa`.

```java
daftarMahasiswa[jumlahMahasiswa] = mahasiswa;
```

### 4. Method

Program menggunakan beberapa method untuk mengelola data, seperti:

```text
tambahMahasiswa()
tampilkanSemua()
cariMahasiswa()
hitungRataRata()
cariNilaiTertinggi()
```

---

# Struktur Folder

Struktur folder project dibuat sederhana agar mudah dipahami dan dijalankan.

```text
aplikasi-nilai-mahasiswa/
│
├── src/
│   │
│   ├── Main.java
│   ├── Mahasiswa.java
│   └── Kelas.java
│
├── .gitignore
├── README.md
└── LICENSE
```

## Penjelasan Struktur Folder

### `aplikasi-nilai-mahasiswa/`

Merupakan **root folder** atau folder utama project.

Semua file project berada di dalam folder ini.

### `src/`

Folder `src` (*source*) digunakan untuk menyimpan seluruh source code Java.

```text
src/
├── Main.java
├── Mahasiswa.java
└── Kelas.java
```

### `src/Main.java`

Berfungsi sebagai **entry point** aplikasi.

File ini berisi:

* Method `main()`
* Menu aplikasi
* Input dari pengguna
* Pemanggilan method dari class `Kelas`

Contoh:

```java
public static void main(String[] args) {
    // program utama
}
```

### `src/Mahasiswa.java`

Berisi class `Mahasiswa`.

Class ini digunakan untuk merepresentasikan satu objek mahasiswa.

Struktur datanya:

```text
Mahasiswa
├── nim
├── nama
└── nilai
```

Contoh objek:

```java
Mahasiswa mahasiswa =
        new Mahasiswa("23001", "Budi", 85);
```

### `src/Kelas.java`

Berisi class `Kelas`.

Class ini bertugas mengelola kumpulan objek mahasiswa menggunakan array.

Array utama yang digunakan:

```java
private Mahasiswa[] daftarMahasiswa;
```

Class ini memiliki beberapa method:

```text
tambahMahasiswa()
tampilkanSemua()
cariMahasiswa()
hitungRataRata()
cariNilaiTertinggi()
```

### `README.md`

File dokumentasi project.

Berisi:

* Deskripsi project
* Fitur aplikasi
* Konsep OOP
* Struktur folder
* Cara menjalankan aplikasi
* Contoh penggunaan

### `.gitignore`

Digunakan untuk menentukan file atau folder yang **tidak perlu diunggah ke repository Git**.

Untuk project Java sederhana, contoh `.gitignore`:

```gitignore
# Compiled Java files
*.class

# IDE files
.idea/
.vscode/
*.iml

# Build folders
out/
build/
target/
```

### `LICENSE`

Berisi lisensi project.

Jika tugas tidak membutuhkan lisensi, file ini sebenarnya **opsional** dan dapat dihilangkan.

---

# Struktur Project yang Direkomendasikan

Jika tugas hanya membutuhkan source code dan README, struktur paling sederhana yang direkomendasikan adalah:

```text
aplikasi-nilai-mahasiswa/
│
├── src/
│   ├── Main.java
│   ├── Mahasiswa.java
│   └── Kelas.java
│
├── README.md
└── .gitignore
```

Struktur ini sudah cukup untuk project tugas OOP sederhana.

---

# Hubungan Antar Class

Hubungan antar class dalam project:

```text
                    ┌──────────────┐
                    │     Main     │
                    └──────┬───────┘
                           │
                           │ menggunakan
                           ▼
                    ┌──────────────┐
                    │    Kelas     │
                    └──────┬───────┘
                           │
                           │ memiliki
                           ▼
                  ┌──────────────────┐
                  │ Mahasiswa[]      │
                  │ daftarMahasiswa  │
                  └────────┬─────────┘
                           │
                           │ menyimpan
                           ▼
                    ┌──────────────┐
                    │  Mahasiswa   │
                    └──────────────┘
```

`Main` menggunakan class `Kelas` untuk menjalankan operasi aplikasi.

`Kelas` memiliki array `Mahasiswa[]` untuk menyimpan beberapa objek `Mahasiswa`.

Dengan demikian, konsep **Array of Objects** terlihat secara langsung dalam project.

---

# Cara Membuat Struktur Folder

Jika membuat project secara manual, buat folder dengan struktur berikut:

```text
aplikasi-nilai-mahasiswa
│
├── src
│   ├── Main.java
│   ├── Mahasiswa.java
│   └── Kelas.java
│
├── README.md
└── .gitignore
```

Kemudian masukkan source code masing-masing class ke file yang sesuai.

---

# Cara Menjalankan

## Persyaratan

Pastikan komputer sudah memiliki:

* Java JDK
* Terminal / Command Prompt
* IDE seperti IntelliJ IDEA, NetBeans, atau Visual Studio Code (opsional)

Cek instalasi Java:

```bash
java --version
```

Cek compiler Java:

```bash
javac --version
```

## Menjalankan melalui Terminal

Masuk ke folder `src`:

```bash
cd src
```

Compile semua file Java:

```bash
javac *.java
```

Jika proses compile berhasil, jalankan:

```bash
java Main
```

---

# Menjalankan melalui IDE

Project dapat dibuka menggunakan IDE seperti IntelliJ IDEA, NetBeans, atau Visual Studio Code.

Pastikan struktur file tetap seperti berikut:

```text
aplikasi-nilai-mahasiswa/
└── src/
    ├── Main.java
    ├── Mahasiswa.java
    └── Kelas.java
```

Kemudian jalankan file:

```text
Main.java
```

karena file tersebut berisi method `main()` sebagai titik awal program.

---

# Alur Program

```text
User
 │
 ▼
Main.java
 │
 ├── Tambah Mahasiswa
 │       │
 │       ▼
 │   Membuat Object Mahasiswa
 │       │
 │       ▼
 │   Menyimpan ke Mahasiswa[]
 │
 ├── Tampilkan Data
 │
 ├── Cari Mahasiswa
 │
 ├── Hitung Rata-rata
 │
 └── Nilai Tertinggi
```

---

# Contoh Penggunaan

Ketika program dijalankan:

```text
====================================
     APLIKASI NILAI MAHASISWA
====================================
1. Tambah Mahasiswa
2. Tampilkan Semua Data
3. Cari Mahasiswa
4. Hitung Rata-rata
5. Nilai Tertinggi
6. Keluar
====================================
Pilih menu:
```

Contoh menambahkan data:

```text
NIM   : 23001
Nama  : Budi
Nilai : 85

Data berhasil ditambahkan.
```

Contoh menampilkan data:

```text
==============================================
              DATA MAHASISWA
==============================================
No    NIM          Nama                 Nilai
----------------------------------------------
1     23001        Budi                 85.00
2     23002        Citra                90.00
3     23003        Andi                 78.00
==============================================
```

---

# Contoh Perhitungan

Jika terdapat tiga mahasiswa:

```text
Budi  = 85
Citra = 90
Andi  = 78
```

Maka rata-rata:

```text
(85 + 90 + 78) / 3
= 253 / 3
= 84.33
```

Nilai tertinggi:

```text
90
```

---

# Tujuan Project

Project ini dibuat untuk menunjukkan penerapan konsep **Array dalam pemrograman berorientasi objek**, khususnya penggunaan **array yang menyimpan objek dari sebuah class**.

Konsep utama yang ditunjukkan:

```text
Class
  ↓
Object
  ↓
Array of Objects
  ↓
Method untuk mengelola Object
```

## Ringkasan Konsep

| Konsep        | Implementasi                                 |
| ------------- | -------------------------------------------- |
| Class         | `Mahasiswa`, `Kelas`, `Main`                 |
| Object        | `new Mahasiswa(...)`                         |
| Encapsulation | Atribut `private` + getter                   |
| Array         | `Mahasiswa[]`                                |
| Method        | `tambahMahasiswa()`, `cariMahasiswa()`, dll. |
| Looping       | `for` untuk mengolah array                   |
| Conditional   | `if` dan `switch`                            |

---

# Author

**Ghaza Amru Seftyan**

Project tugas mata kuliah **Object-Oriented Programming (OOP)**.
