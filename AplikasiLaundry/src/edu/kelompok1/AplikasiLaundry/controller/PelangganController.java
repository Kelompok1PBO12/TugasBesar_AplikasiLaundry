/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kelompok1.AplikasiLaundry.controller;

import edu.kelompok1.AplikasiLaundry.model.PelangganModel;
import edu.kelompok1.AplikasiLaundry.view.mainFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class PelangganController {

    private PelangganModel model;

    public void setModel(PelangganModel model) {
        this.model = model;
    }

    public void resetPelanggan(mainFrame frame) {
        model.resetPelanggan();
    }

    public void insertPelanggan(mainFrame frame) {
        /*String tgl_masuk = frame.getTxttgl_masuk().getText();
    String tgl_keluar = frame.getTxttgl_keluar().getText();*/
        String nama = frame.getTxtnama().getText();
        String alamat = frame.getTxtalamat().getText();
        String telepon = frame.getTxttelepon().getText();
        /*String layanan = frame.getTxtlayanan().getText();
    String berat = frame.getTxtberat().getText();
    String jumlah = frame.getTxtjumlah().getText();*/
        String keterangan = frame.getTxtketerangan().getText();

        if (nama.trim().equals("")) {
            JOptionPane.showMessageDialog(frame, "Nama tidak boleh kosong");
        } else if (nama.length() > 255) {
            JOptionPane.showMessageDialog(frame, "Nama tidak boleh lebih dari 255 karakter");
        } else if (telepon.length() > 12) {
            JOptionPane.showMessageDialog(frame, "Nomor telepon tidak boleh lebih dari 12 digit");
        } /*else if(layanan.trim().equals("")){
        JOptionPane.showMessageDialog(frame, "layanan tidak boleh kosong");
        } else if(berat.trim().equals("")){
        JOptionPane.showMessageDialog(frame, "berat tidak boleh kosong");
        } else if(jumlah.trim().equals("")){
        JOptionPane.showMessageDialog(frame, "Nama tidak boleh kosong");
        }*/ else {
            model.setNama(nama);
            model.setAlamat(alamat);
            model.setTelepon(telepon);

            try {
                model.insertPelanggan();
                JOptionPane.showMessageDialog(frame, "Customer berhasil ditambahkan");
                model.resetPelanggan();
            } catch (Throwable throwable) {
                JOptionPane.showMessageDialog(frame, new Object[]{"Terjadi Error di database dengan pesan", throwable.getMessage()});
            }
        }
    }

    public void deletePelanggan(mainFrame frame) {
        if (frame.getTablepelanggan().getSelectedRowCount() == 0) {
            JOptionPane.showMessageDialog(frame, "Pilih Data yang akan dihapus");
            return;
        }

        if (JOptionPane.showConfirmDialog(frame, "Yakin ingin dihapus ?") == JOptionPane.OK_OPTION) {
            Integer no_transaksi = Integer.parseInt(frame.getTxtno_transaksi().getText());
            model.setNo_transaksi(no_transaksi);

            try {
                model.deletePelanggan();
                JOptionPane.showMessageDialog(frame, "Data customer berhasil dihapus");
                model.resetPelanggan();
            } catch (Throwable throwable) {
                JOptionPane.showMessageDialog(frame, new Object[]{"Terjadi error di database dengan pesan", throwable.getMessage()});
            }
        }
    }

}
