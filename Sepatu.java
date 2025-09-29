/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Interfaces.InfoProduk;

/**
 *
 * @author Tsabitah Kawiswara
 */
public class Sepatu extends Produk implements InfoProduk {
    private int ukuran;

    public Sepatu(String nama, String merk, String warna, int ukuran) {
        super(nama, merk, warna);
        this.ukuran = ukuran;
    }
    
    public int getUkuran() { return ukuran; }
    public void setUkuran(int ukuran) { this.ukuran = ukuran; }

    // Overriding abstract methods
    @Override
    public String kategoriProduk() {
        return "Sepatu (Formal, Olahraga, dll)";
    }

    @Override
    public String getInfoTambahan() {
        return "Ukuran: " + ukuran;
    }

    @Override
    public String getDeskripsi() {
        return "Sepatu: " + getNama() + " | Merk: " + getMerk() +
               " | Warna: " + getWarna() + " | " + getInfoTambahan();
    }
}
    

