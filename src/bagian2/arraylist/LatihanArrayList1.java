package bagian2.arraylist;

import java.util.ArrayList;

public class LatihanArrayList1 {
    public static void main(String[] args) {

        ArrayList<String> belanja = new ArrayList<>();

        belanja.add("Beras");
        belanja.add("Gula");
        belanja.add("Minyak");
        belanja.add("Telur");

        belanja.remove(1); // hapus item ke-2 (Gula)

        System.out.println("Daftar Belanja: " + belanja);
        System.out.println("Jumlah Item: " + belanja.size());
    }
}
