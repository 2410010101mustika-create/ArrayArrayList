package tugas;

/*
Nama : Mustika Rahmelia
NPM  : 2410010101
*/
public class MainTugas {
    public static void main(String[] args) {

        String[] mataKuliah = {
            "Pemrograman Berbasis Objek",
            "Struktur Data",
            "Basis Data"
        };

        System.out.println("=== DAFTAR MATA KULIAH ===");
        for (String mk : mataKuliah) {
            System.out.println("- " + mk);
        }

        System.out.println();

        KelasKuliah kelas = new KelasKuliah();

        kelas.tambahMahasiswa(
            new Mahasiswa("Andi", "2410010001", 80));

        kelas.tambahMahasiswa(
            new Mahasiswa("Budi", "2410010002", 55));

        kelas.tambahMahasiswa(
            new Mahasiswa("Citra", "2410010003", 90));

        kelas.tambahMahasiswa(
            new Mahasiswa("Doni", "2410010004", 70));

        kelas.tambahMahasiswa(
            new Mahasiswa("Eka", "2410010005", 50));

        kelas.tampilkanSemua();

        System.out.println();
        System.out.println("Rata-rata nilai : "
                + kelas.hitungRataRata());

        System.out.println("Jumlah lulus : "
                + kelas.jumlahLulus());

        System.out.println();

        kelas.tambahMahasiswa(
            new Mahasiswa("Fajar",
            "2410010006", 85));

        System.out.println(
            "Jumlah mahasiswa terbaru : "
            + kelas.jumlahMahasiswa());
    }
}
