public class Kelas {
    private Mahasiswa[] daftarMahasiswa;
    private int jumlahMahasiswa;

    public Kelas(int kapasitas) {
        daftarMahasiswa = new Mahasiswa[kapasitas];
        jumlahMahasiswa = 0;
    }

    public boolean tambahMahasiswa(Mahasiswa mahasiswa) {
        if (jumlahMahasiswa >= daftarMahasiswa.length) {
            return false;
        }

        daftarMahasiswa[jumlahMahasiswa] = mahasiswa;
        jumlahMahasiswa++;

        return true;
    }

    public void tampilkanSemua() {
        if (jumlahMahasiswa == 0) {
            System.out.println("Belum ada data mahasiswa.");
            return;
        }

        System.out.println("\n==============================================");
        System.out.println("              DATA MAHASISWA");
        System.out.println("==============================================");
        System.out.printf("%-5s %-12s %-20s %s%n",
                "No", "NIM", "Nama", "Nilai");
        System.out.println("----------------------------------------------");

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.printf("%-5d %-12s %-20s %.2f%n",
                    i + 1,
                    daftarMahasiswa[i].getNim(),
                    daftarMahasiswa[i].getNama(),
                    daftarMahasiswa[i].getNilai());
        }

        System.out.println("==============================================");
    }

    public Mahasiswa cariMahasiswa(String nim) {
        for (int i = 0; i < jumlahMahasiswa; i++) {
            if (daftarMahasiswa[i].getNim().equals(nim)) {
                return daftarMahasiswa[i];
            }
        }

        return null;
    }

    public double hitungRataRata() {
        if (jumlahMahasiswa == 0) {
            return 0;
        }

        double total = 0;

        for (int i = 0; i < jumlahMahasiswa; i++) {
            total += daftarMahasiswa[i].getNilai();
        }

        return total / jumlahMahasiswa;
    }

    public Mahasiswa cariNilaiTertinggi() {
        if (jumlahMahasiswa == 0) {
            return null;
        }

        Mahasiswa tertinggi = daftarMahasiswa[0];

        for (int i = 1; i < jumlahMahasiswa; i++) {
            if (daftarMahasiswa[i].getNilai() > tertinggi.getNilai()) {
                tertinggi = daftarMahasiswa[i];
            }
        }

        return tertinggi;
    }
}