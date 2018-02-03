/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kelompok1.AplikasiLaundry.main;

import edu.kelompok1.AplikasiLaundry.database.LaundryKitadatabase;
import edu.kelompok1.AplikasiLaundry.entity.Pelanggan;
import edu.kelompok1.AplikasiLaundry.error.PelangganException;
import edu.kelompok1.AplikasiLaundry.service.PelangganDao;
import java.sql.SQLException;
import java.util.List;


/**
 *
 * @author user
 */
public class AplikasiLaundry {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, PelangganException {
        // TODO code application logic here
        
        PelangganDao dao = LaundryKitadatabase.getPelangganDao();
        dao.deletePelanggan(1);
    }
    
}
