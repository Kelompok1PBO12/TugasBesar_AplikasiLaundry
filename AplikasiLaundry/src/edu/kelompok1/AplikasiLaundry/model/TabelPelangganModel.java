/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kelompok1.AplikasiLaundry.model;

import edu.kelompok1.AplikasiLaundry.entity.Pelanggan;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author USER
 */
public class TabelPelangganModel extends AbstractTableModel {

    private List<Pelanggan> list = new ArrayList<Pelanggan>();

    public List<Pelanggan> getList() {
        return list;
    }

    @Override
    public int getRowCount() {

        return list.size();

    }

    @Override
    public int getColumnCount() {

        return 10;

    }

    public boolean add(Pelanggan e) {
        try {
            return list.add(e);
        } finally {
            fireTableRowsInserted(getRowCount() - 1, getRowCount() - 1);
        }
    }

    public Pelanggan get(int index) {
        return list.get(index);
    }

    public Pelanggan set(int index, Pelanggan element) {
        try {
            return list.set(index, element);
        } finally {
            fireTableRowsUpdated(index, index);
        }

    }

    public Pelanggan remove(int index) {
        try {
            return list.remove(index);
        } finally {
            fireTableRowsDeleted(index, index);
        }

    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "NO_TRANSAKSI";
            case 1:
                return "TGL_MASUK";
            case 2:
                return "TGL_KELUAR";
            case 3:
                return "NAMA";
            case 4:
                return "ALAMAT";
            case 5:
                return "TELEPON";
            case 6:
                return "LAYANAN";
            case 7:
                return "BERAT";
            case 8:
                return "JUMLAH";
            case 9:
                return "KETERANGAN";
            default:
                return null;
        }

    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {

        switch (columnIndex) {
            case 0:
                return list.get(rowIndex).getNo_transaksi();
            case 1:
                return list.get(rowIndex).getTgl_masuk();
            case 2:
                return list.get(rowIndex).getTgl_keluar();
            case 3:
                return list.get(rowIndex).getNama();
            case 4:
                return list.get(rowIndex).getAlamat();
            case 5:
                return list.get(rowIndex).getTelepon();
            case 6:
                return list.get(rowIndex).getLayanan();
            case 7:
                return list.get(rowIndex).getBerat();
            case 8:
                return list.get(rowIndex).getJumlah();
            case 9:
                return list.get(rowIndex).getKeterangan();
            default:
                return null;

        }

    }

    public void setList(List<Pelanggan> selectAllPelanggan) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
