package com.example.android.mohakbaranshory_1202150004_modul2;

/**
 * Created by Abay on 2/17/2018.
 * Kelas yang digunakan untuk kerangka penentuan ke Linklist
 */

public class MenuItem {
    /**
     *  Deklarasi 3 variabel
     */
    String nama;
    String deskripsi;
    int harga;

    public MenuItem(String nama, String deskripsi, int harga) {     // Konstruktor
        this.nama = nama;               // Assign value, menggunakan this untuk membedakan local dan global variabel
        this.deskripsi = deskripsi;
        this.harga = harga;
    }

    //getter yang merupakan method non void, mengembalikan nilai
    public String getNama() {
        return nama;
    }

    //getter yang merupakan method non void, mengembalikan nilai
    public String getDeskripsi() {
        return deskripsi;
    }

    //getter yang merupakan method non void, mengembalikan nilai
    public int getHarga() {
        return harga;
    }
}
