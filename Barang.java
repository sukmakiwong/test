/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;

/**
 *
 * @author User
 */
public class Barang {
    private String kodebarang;
    private String nama;
    private int harga;
    String getHarga;

    public Barang() {
    }

    public Barang(String kodebarang, String nama, int harga) {
        this.kodebarang = kodebarang;
        this.nama = nama;
        this.harga = harga;
    }

    public String getKodebarang() {
        return kodebarang;
    }

    public void setKodebarang(String kodebarang) {
        this.kodebarang = kodebarang;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    @Override
    public String toString() {
        return "Barang{" + "kodebarang=" + kodebarang + ", nama=" + nama + ", harga=" + harga + '}';
    }

    //To change body of generated methods, choose Tools | Templates.
    }
    
    

