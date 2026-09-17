import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Kelas kelas = new Kelas(100);

        int pilihan;

        do {
            System.out.println("\n====================================");
            System.out.println("     APLIKASI NILAI MAHASISWA");
            System.out.println("====================================");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Tampilkan Semua Data");
            System.out.println("3. Cari Mahasiswa");
            System.out.println("4. Hitung Rata-rata");
            System.out.println("5. Nilai Tertinggi");
            System.out.println("6. Keluar");
            System.out.println("====================================");
            System.out.print("Pilih menu: ");

            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {

                case 1:
                    System.out.println("\n--- Tambah Mahasiswa ---");

                    System.out.print("NIM   : ");
                    String nim = input.nextLine();

                    System.out.print("Nama  : ");
                    String nama = input.nextLine();

                    System.out.print("Nilai : ");
                    double nilai = input.nextDouble();

                    Mahasiswa mahasiswa =
                            new Mahasiswa(nim, nama, nilai);

                    if (kelas.tambahMahasiswa(mahasiswa)) {
                        System.out.println("Data berhasil ditambahkan.");
                    } else {
                        System.out.println("Array sudah penuh.");
                    }

                    break;

                case 2:
                    kelas.tampilkanSemua();
                    break;

                case 3:
                    System.out.println("\n--- Cari Mahasiswa ---");

                    System.out.print("Masukkan NIM: ");
                    String cariNim = input.nextLine();

                    Mahasiswa hasil = kelas.cariMahasiswa(cariNim);

                    if (hasil != null) {
                        System.out.println("\nData ditemukan!");
                        System.out.println("NIM   : " + hasil.getNim());
                        System.out.println("Nama  : " + hasil.getNama());
                        System.out.println("Nilai : " + hasil.getNilai());
                    } else {
                        System.out.println("Mahasiswa tidak ditemukan.");
                    }

                    break;

                case 4:
                    double rataRata = kelas.hitungRataRata();

                    System.out.printf(
                            "\nRata-rata nilai: %.2f%n",
                            rataRata
                    );

                    break;

                case 5:
                    Mahasiswa tertinggi = kelas.cariNilaiTertinggi();

                    if (tertinggi != null) {
                        System.out.println("\n--- Nilai Tertinggi ---");
                        System.out.println("NIM   : " + tertinggi.getNim());
                        System.out.println("Nama  : " + tertinggi.getNama());
                        System.out.println("Nilai : " + tertinggi.getNilai());
                    } else {
                        System.out.println("Belum ada data mahasiswa.");
                    }

                    break;

                case 6:
                    System.out.println("\nProgram selesai.");
                    break;

                default:
                    System.out.println("\nPilihan tidak valid.");
            }

        } while (pilihan != 6);

        input.close();
    }
}