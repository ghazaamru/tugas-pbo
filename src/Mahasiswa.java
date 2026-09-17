public class Mahasiswa {
    private String nim;
    private String nama;
    private double nilai;

    public Mahasiswa(String nim, String nama, double nilai) {
        this.nim = nim;
        this.nama = nama;
        this.nilai = nilai;
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public double getNilai() {
        return nilai;
    }

    public void tampilkanData() {
        System.out.printf("%-5s %-12s %-20s %.2f%n",
                "", nim, nama, nilai);
    }
}