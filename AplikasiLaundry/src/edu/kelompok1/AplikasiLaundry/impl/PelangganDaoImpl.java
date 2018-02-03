/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kelompok1.AplikasiLaundry.impl;

import edu.kelompok1.AplikasiLaundry.entity.Pelanggan;
import edu.kelompok1.AplikasiLaundry.error.PelangganException;
import edu.kelompok1.AplikasiLaundry.service.PelangganDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USER
 */
public class PelangganDaoImpl implements PelangganDao {

    private Connection connection;

    private final String insertPelanggan = "INSERT INTO PELANGGAN (TGL_MASUK,TGL_KELUAR,NAMA,ALAMAT,TELEPON,LAYANAN,BERAT,JUMLAH,KETERANGAN) VALUES (?,?,?,?,?,?,?,?,?) ";

    private final String deletePelanggan = "DELETE FROM PELANGGAN WHERE NO_TRANSAKSI=?";

    private final String getByNo_transaksi = "SELECT * FROM PELANGGAN WHERE NO_TRANSAKSI=?";

    private final String selectAll = "SELECT * FROM PELANGGAN";

    public PelangganDaoImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void insertPelanggan(Pelanggan pelanggan) throws PelangganException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            

            statement = connection.prepareStatement(insertPelanggan, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, pelanggan.getTgl_masuk());
            statement.setString(2, pelanggan.getTgl_keluar());
            statement.setString(3, pelanggan.getNama());
            statement.setString(4, pelanggan.getAlamat());
            statement.setString(5, pelanggan.getTelepon());
            statement.setString(6, pelanggan.getLayanan());
            statement.setInt(7, pelanggan.getBerat());
            statement.setInt(8, pelanggan.getJumlah());
            statement.setString(9, pelanggan.getKeterangan());
            statement.executeUpdate();

            ResultSet result = statement.getGeneratedKeys();
            if (result.next()) {
                pelanggan.setNo_transaksi(result.getInt(1));
            }
            
            connection.commit();

        } catch (SQLException e) {

            try {
                connection.rollback();
            } catch (SQLException ex) {

            }
            throw new PelangganException(e.getMessage());

        } finally {
            try {
                connection.setAutoCommit(true);
            } catch (SQLException ex) {
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                }
            }

        }
    }

    @Override
    public void deletePelanggan(Integer no_transaksi) throws PelangganException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(deletePelanggan);
            statement.setInt(1, no_transaksi);
            statement.executeUpdate();
            connection.commit();
        } catch (SQLException e) {

            try {
                connection.rollback();
            } catch (SQLException ex) {

            }
            throw new PelangganException(e.getMessage());

        } finally {
            try {
                connection.setAutoCommit(true);
            } catch (SQLException ex) {
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                }
            }

        }
    }

    @Override
    public Pelanggan getPelanggan(Integer no_transaksi) throws PelangganException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(getByNo_transaksi);
            statement.setInt(1, no_transaksi);

            ResultSet result = statement.executeQuery();
            Pelanggan pelanggan = null;
            if (result.next()) {
                pelanggan = new Pelanggan();
                pelanggan.setNo_transaksi(result.getInt("NO_TRANSAKSI"));
                pelanggan.setTgl_masuk(result.getString("TGL_MASUK"));
                pelanggan.setTgl_keluar(result.getString("TGL_KELUAR"));
                pelanggan.setNama(result.getString("NAMA"));
                pelanggan.setAlamat(result.getString("ALAMAT"));
                pelanggan.setTelepon(result.getString("TELEPON"));
                pelanggan.setLayanan(result.getString("LAYANAN"));
                pelanggan.setBerat(result.getInt("BERAT"));
                pelanggan.setJumlah(result.getInt("JUMLAH"));
                pelanggan.setKeterangan(result.getString("KETERANGAN"));
            } else {
                throw new PelangganException("Pelanggan dengan no_transaksi" + no_transaksi + "tidak ditemukan");
            }
            connection.commit();
            return pelanggan;
        } catch (SQLException e) {

            try {
                connection.rollback();
            } catch (SQLException ex) {

            }
            throw new PelangganException(e.getMessage());

        } finally {
            try {
                connection.setAutoCommit(true);
            } catch (SQLException ex) {
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                }
            }

        }
    }

    @Override
    public List<Pelanggan> selectAllPelanggan() throws PelangganException {
        Statement statement = null;
        List<Pelanggan> list = new ArrayList<Pelanggan>();

        try {
            connection.setAutoCommit(false);
            statement = connection.createStatement();

            ResultSet result = statement.executeQuery(selectAll);
            Pelanggan pelanggan = null;
            while (result.next()) {
                pelanggan = new Pelanggan();
                pelanggan.setNo_transaksi(result.getInt("NO_TRANSAKSI"));
                pelanggan.setTgl_masuk(result.getString("TGL_MASUK"));
                pelanggan.setTgl_keluar(result.getString("TGL_KELUAR"));
                pelanggan.setNama(result.getString("NAMA"));
                pelanggan.setAlamat(result.getString("ALAMAT"));
                pelanggan.setTelepon(result.getString("TELEPON"));
                pelanggan.setLayanan(result.getString("LAYANAN"));
                pelanggan.setBerat(result.getInt("BERAT"));
                pelanggan.setJumlah(result.getInt("JUMLAH"));
                pelanggan.setKeterangan(result.getString("KETERANGAN"));
                list.add(pelanggan);
            }
            connection.commit();
            return list;
        } catch (SQLException e) {

            try {
                connection.rollback();
            } catch (SQLException ex) {

            }
            throw new PelangganException(e.getMessage());

        } finally {
            try {
                connection.setAutoCommit(true);
            } catch (SQLException ex) {
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                }
            }

        }
    }

}
