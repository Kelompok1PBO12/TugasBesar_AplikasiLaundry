package edu.kelompok1.AplikasiLaundry.service;


import edu.kelompok1.AplikasiLaundry.entity.Pelanggan;
import edu.kelompok1.AplikasiLaundry.error.PelangganException;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public interface PelangganDao {
    
    public void insertPelanggan(Pelanggan pelanggan) throws PelangganException;
    public void deletePelanggan(Integer no_transaksi) throws PelangganException;
    public Pelanggan getPelanggan(Integer no_transaksi) throws PelangganException;
    
    public List<Pelanggan> selectAllPelanggan() throws PelangganException;
    
}
