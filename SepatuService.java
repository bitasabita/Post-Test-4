/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import java.util.ArrayList;
import java.util.Scanner;
import Model.Sepatu;
import Model.Sandal;
import Model.Produk;

/**
 *
 * @author Tsabitah Kawiswara
 */
public class SepatuService {
    private ArrayList<Produk> koleksiProduk = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    // CREATE
    public void tambahSepatu() {
        String nama = inputString("Masukkan nama sepatu: ");
        String merk = inputString("Masukkan merk sepatu: ");
        String warna = inputString("Masukkan warna sepatu: ");
        int ukuran = inputUkuran();

        tambahSepatu(nama, merk, warna, ukuran); // panggil versi overloading
    }

    // Overloading
    public void tambahSepatu(String nama, String merk, String warna, int ukuran) {
        Sepatu sepatu = new Sepatu(nama, merk, warna, ukuran);
        koleksiProduk.add(sepatu);
        System.out.println("✅ Sepatu berhasil ditambahkan!");
    }

    public void tambahSandal() {
        String nama = inputString("Masukkan nama sandal: ");
        String merk = inputString("Masukkan merk sandal: ");
        String warna = inputString("Masukkan warna sandal: ");
        String jenis = inputString("Masukkan jenis sandal: ");

        Sandal sandal = new Sandal(nama, merk, warna, jenis);
        koleksiProduk.add(sandal);
        System.out.println("✅ Sandal berhasil ditambahkan!");
    }

    public void tampilProduk() {
        if (koleksiProduk.isEmpty()) {
            System.out.println("⚠️ Koleksi produk masih kosong.");
        } else {
            System.out.println("\n--- Daftar Koleksi Produk ---");
            for (int i = 0; i < koleksiProduk.size(); i++) {
                System.out.println((i + 1) + ". " + koleksiProduk.get(i).getDeskripsi());
            }
        }
    }

    public void updateSepatu() {
        if (koleksiProduk.isEmpty()) {
            System.out.println("⚠️ Koleksi kosong.");
            return;
        }

        tampilProduk();
        System.out.print("Pilih nomor sepatu yang ingin diperbarui: ");
        int nomor = inputNomor();

        if (nomor > 0 && nomor <= koleksiProduk.size()) {
            Produk produk = koleksiProduk.get(nomor - 1);
            if (produk instanceof Sepatu) {
                String nama = inputString("Nama baru: ");
                String merk = inputString("Merk baru: ");
                String warna = inputString("Warna baru: ");
                int ukuran = inputUkuran();

                koleksiProduk.set(nomor - 1, new Sepatu(nama, merk, warna, ukuran));
                System.out.println("✅ Sepatu berhasil diperbarui!");
            } else {
                System.out.println("❌ Produk yang dipilih bukan sepatu.");
            }
        } else {
            System.out.println("❌ Nomor tidak valid.");
        }
    }

    public void hapusProduk() {
        if (koleksiProduk.isEmpty()) {
            System.out.println("⚠️ Koleksi kosong.");
            return;
        }

        tampilProduk();
        System.out.print("Pilih nomor produk yang ingin dihapus: ");
        int nomor = inputNomor();

        if (nomor > 0 && nomor <= koleksiProduk.size()) {
            koleksiProduk.remove(nomor - 1);
            System.out.println("✅ Produk berhasil dihapus.");
        } else {
            System.out.println("❌ Nomor tidak valid.");
        }
    }

    public void cariProduk() {
        if (koleksiProduk.isEmpty()) {
            System.out.println("⚠️ Koleksi kosong.");
            return;
        }

        String keyword = inputString("Masukkan kata kunci: ").toLowerCase();
        boolean ditemukan = false;

        for (Produk produk : koleksiProduk) {
            if (produk.getNama().toLowerCase().contains(keyword) ||
                produk.getMerk().toLowerCase().contains(keyword) ||
                produk.getWarna().toLowerCase().contains(keyword)) {
                System.out.println("🔍 " + produk.getDeskripsi());
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("❌ Tidak ada produk yang cocok.");
        }
    }

    // Helper
    private String inputString(String pesan) {
        String input;
        while (true) {
            System.out.print(pesan);
            input = scanner.nextLine().trim();
            if (!input.isEmpty() && !input.matches("\\d+")) return input;
            System.out.println("⚠️ Tidak boleh kosong atau angka saja.");
        }
    }

    private int inputUkuran() {
        while (true) {
            try {
                System.out.print("Masukkan ukuran: ");
                int ukuran = Integer.parseInt(scanner.nextLine());
                if (ukuran > 0) return ukuran;
                System.out.println("⚠️ Ukuran harus positif.");
            } catch (NumberFormatException e) {
                System.out.println("⚠️ Harus berupa angka.");
            }
        }
    }

    private int inputNomor() {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.print("⚠️ Input harus angka. Ulangi: ");
            }
        }
    }
}
    

