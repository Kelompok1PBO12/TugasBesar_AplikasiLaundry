/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kelompok1.AplikasiLaundry.event;

import edu.kelompok1.AplikasiLaundry.entity.Pelanggan;
import edu.kelompok1.AplikasiLaundry.model.PelangganModel;

/**
 *
 * @author USER
 */
public interface PelangganListener {

    public void onChange(PelangganModel model);

    public void onInsert(Pelanggan pelanggan);

    public void onDelete();

}
