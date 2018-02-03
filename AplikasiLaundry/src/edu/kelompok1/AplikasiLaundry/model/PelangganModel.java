/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kelompok1.AplikasiLaundry.model;

import edu.kelompok1.AplikasiLaundry.database.LaundryKitadatabase;
import edu.kelompok1.AplikasiLaundry.entity.Pelanggan;
import edu.kelompok1.AplikasiLaundry.error.PelangganException;
import edu.kelompok1.AplikasiLaundry.event.PelangganListener;
import edu.kelompok1.AplikasiLaundry.service.PelangganDao;
import java.sql.SQLException;

/**
 *
 * @author USER
 */
public class PelangganModel {
    
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
    
    private PelangganListener listener;

    public PelangganListener getListener() {
        return listener;
    }

    public void setListener(PelangganListener listener) {
        this.listener = listener;
    }

    

    public int getNo_transaksi() {
        return no_transaksi;
    }

    public void setNo_transaksi(int no_transaksi) {
        this.no_transaksi = no_transaksi;
        fireOnChange();
    }

    public String getTgl_masuk() {
        return tgl_masuk;
    }

    public void setTgl_masuk(String tgl_masuk) {
        this.tgl_masuk = tgl_masuk;
    fireOnChange();
    }

    public String getTgl_keluar() {
        return tgl_keluar;
    }

    public void setTgl_keluar(String tgl_keluar) {
        this.tgl_keluar = tgl_keluar;
        fireOnChange();
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
        fireOnChange();
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
        fireOnChange();
    }

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
        fireOnChange();
    }

    public String getLayanan() {
        return layanan;
    }

    public void setLayanan(String layanan) {
        this.layanan = layanan;
        fireOnChange();
    }

    public int getBerat() {
        return berat;
    }

    public void setBerat(int berat) {
        this.berat = berat;
        fireOnChange();
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
        fireOnChange();
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
        fireOnChange();
    }
    
    protected void fireOnChange(){
        if(listener!=null){
        listener.onChange(this);
        }
    }
    
    protected void fireOnInsert(Pelanggan pelanggan){
        if(listener!=null){
        listener.onInsert(pelanggan);
        }
    }
    
    protected void fireOnDelete(){
        if(listener!=null){
        listener.onDelete();
        }
    }
    
    public void insertPelanggan() throws SQLException, PelangganException{
        PelangganDao dao = LaundryKitadatabase.getPelangganDao();
        Pelanggan pelanggan = new Pelanggan();
        pelanggan.setTgl_masuk(tgl_masuk);
        pelanggan.setTgl_keluar(tgl_keluar);
        pelanggan.setNama(nama);
        pelanggan.setAlamat(alamat);
        pelanggan.setTelepon(telepon);
        pelanggan.setLayanan(layanan);
        pelanggan.setBerat(berat);
        pelanggan.setJumlah(jumlah);
        pelanggan.setKeterangan(keterangan);
        
        dao.insertPelanggan(pelanggan);
        
        fireOnInsert(pelanggan);
    }
    
    public void deletePelanggan() throws SQLException, PelangganException{
        PelangganDao dao = LaundryKitadatabase.getPelangganDao();
        dao.deletePelanggan(no_transaksi);
        fireOnDelete();
    }
    
    public void resetPelanggan(){
    setNo_transaksi(0);
    setTgl_masuk("");
    setTgl_keluar("");
    setNama("");
    setAlamat("");
    setTelepon("");
    setLayanan("");
    setBerat(0);
    setJumlah(0);
    setKeterangan("");
    }
}
