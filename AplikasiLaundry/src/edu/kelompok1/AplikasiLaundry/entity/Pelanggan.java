/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kelompok1.AplikasiLaundry.entity;

import java.util.Objects;

/**
 *
 * @author USER
 */
public class Pelanggan {

    private int no_transaksi;
    private String tgl_masuk;
    private String tgl_keluar;
    private String nama;
    private String alamat;
    private String telepon;
    private String layanan;
    private int berat;
    private int jumlah;
    private String keterangan;

    public Pelanggan() {

    }

    public Pelanggan(String tgl_masuk, String tgl_keluar, String nama, String alamat, String telepon, String layanan, Integer berat, Integer jumlah, String keterangan) {
        this.tgl_masuk = tgl_masuk;
        this.tgl_keluar = tgl_keluar;
        this.nama = nama;
        this.alamat = alamat;
        this.telepon = telepon;
        this.layanan = layanan;
        this.berat = berat;
        this.jumlah = jumlah;
        this.keterangan = keterangan;
    }

    public Integer getNo_transaksi() {
        return no_transaksi;
    }

    public void setNo_transaksi(Integer no_transaksi) {
        this.no_transaksi = no_transaksi;
    }

    public String getTgl_masuk() {
        return tgl_masuk;
    }

    public void setTgl_masuk(String tgl_masuk) {
        this.tgl_masuk = tgl_masuk;
    }

    public String getTgl_keluar() {
        return tgl_keluar;
    }

    public void setTgl_keluar(String tgl_keluar) {
        this.tgl_keluar = tgl_keluar;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

    public String getLayanan() {
        return layanan;
    }

    public void setLayanan(String layanan) {
        this.layanan = layanan;
    }

    public Integer getBerat() {
        return berat;
    }

    public void setBerat(Integer berat) {
        this.berat = berat;
    }

    public Integer getJumlah() {
        return jumlah;
    }

    public void setJumlah(Integer jumlah) {
        this.jumlah = jumlah;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.no_transaksi);
        hash = 17 * hash + Objects.hashCode(this.tgl_masuk);
        hash = 17 * hash + Objects.hashCode(this.tgl_keluar);
        hash = 17 * hash + Objects.hashCode(this.nama);
        hash = 17 * hash + Objects.hashCode(this.alamat);
        hash = 17 * hash + Objects.hashCode(this.telepon);
        hash = 17 * hash + Objects.hashCode(this.layanan);
        hash = 17 * hash + Objects.hashCode(this.berat);
        hash = 17 * hash + Objects.hashCode(this.jumlah);
        hash = 17 * hash + Objects.hashCode(this.keterangan);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pelanggan other = (Pelanggan) obj;
        if (!Objects.equals(this.tgl_masuk, other.tgl_masuk)) {
            return false;
        }
        if (!Objects.equals(this.tgl_keluar, other.tgl_keluar)) {
            return false;
        }
        if (!Objects.equals(this.nama, other.nama)) {
            return false;
        }
        if (!Objects.equals(this.alamat, other.alamat)) {
            return false;
        }
        if (!Objects.equals(this.telepon, other.telepon)) {
            return false;
        }
        if (!Objects.equals(this.layanan, other.layanan)) {
            return false;
        }
        if (!Objects.equals(this.keterangan, other.keterangan)) {
            return false;
        }
        if (!Objects.equals(this.no_transaksi, other.no_transaksi)) {
            return false;
        }
        if (!Objects.equals(this.berat, other.berat)) {
            return false;
        }
        if (!Objects.equals(this.jumlah, other.jumlah)) {
            return false;
        }
        return true;
    }

    



    
}
