/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject4;

import java.util.Scanner;
import Service.SepatuService;

/**
 *
 * @author Tsabitah Kawiswara
 */
public class Mavenproject4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SepatuService service = new SepatuService();
        int pilihan;

        do {
            System.out.println("\n=== SISTEM MANAJEMEN KOLEKSI SEPATU ===");
            System.out.println("1. Tambah Sepatu");
            System.out.println("2. Tambah Sandal");
            System.out.println("3. Tampilkan Semua Produk");
            System.out.println("4. Perbarui Sepatu");
            System.out.println("5. Hapus Produk");
            System.out.println("6. Cari Produk");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");

            while (!scanner.hasNextInt()) {
                System.out.print("⚠️ Input harus angka. Ulangi: ");
                scanner.next();
            }

            pilihan = scanner.nextInt();
            scanner.nextLine(); // clear buffer

            switch (pilihan) {
                case 1 -> service.tambahSepatu();
                case 2 -> service.tambahSandal();
                case 3 -> service.tampilProduk();
                case 4 -> service.updateSepatu();
                case 5 -> service.hapusProduk();
                case 6 -> service.cariProduk();
                case 0 -> System.out.println("👋 Terima kasih.");
                default -> System.out.println("⚠️ Pilihan tidak valid.");
            }

        } while (pilihan != 0);

        scanner.close();
    }
}

    
