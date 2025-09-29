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
public class Sandal extends Produk implements InfoProduk {
    private String jenis;

    public Sandal(String nama, String merk, String warna, String jenis) {
        super(nama, merk, warna);
        this.jenis = jenis;
    }

    public String getJenis() { return jenis; }
    public void setJenis(String jenis) { this.jenis = jenis; }

    @Override
    public String kategoriProduk() {
        return "Sandal (Jepit, Slop, dll)";
    }

    @Override
    public String getInfoTambahan() {
        return "Jenis: " + jenis;
    }

    @Override
    public String getDeskripsi() {
        return "Sandal: " + getNama() + " | Merk: " + getMerk() +
               " | Warna: " + getWarna() + " | " + getInfoTambahan();
    }
}
    
