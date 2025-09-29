/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Tsabitah Kawiswara
 */
public abstract class Produk {
    private String nama;
    private String merk;
    private String warna;

    public Produk(String nama, String merk, String warna) {
        this.nama = nama;
        this.merk = merk;
        this.warna = warna;
    }

    // Getter & Setter
    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }

    public String getMerk() { return merk; }
    public void setMerk(String merk) { this.merk = merk; }

    public String getWarna() { return warna; }
    public void setWarna(String warna) { this.warna = warna; }

    // Abstract method (abstraction)
    public abstract String kategoriProduk();
    public abstract String getDeskripsi();

    @Override
    public String toString() {
        return getDeskripsi();
    }
}

    

