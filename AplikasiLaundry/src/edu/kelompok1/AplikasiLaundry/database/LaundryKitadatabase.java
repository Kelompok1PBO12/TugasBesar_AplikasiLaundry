/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kelompok1.AplikasiLaundry.database;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import edu.kelompok1.AplikasiLaundry.impl.PelangganDaoImpl;
import edu.kelompok1.AplikasiLaundry.service.PelangganDao;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author USER
 */
public class LaundryKitadatabase {

    private static Connection connection;
    private static PelangganDao pelangganDao;

    public static Connection getConnection() throws SQLException {
        if (connection == null) {

            MysqlDataSource dataSource = new MysqlDataSource();
            dataSource.setURL("jdbc:mysql://localhost:3306/laundrykita");
            dataSource.setUser("root");
            dataSource.setPassword("");
            connection = dataSource.getConnection();
        }

        return connection;
    }

    public static PelangganDao getPelangganDao() throws SQLException {
        if (pelangganDao == null) {
            pelangganDao = new PelangganDaoImpl(getConnection());
        }
        return pelangganDao;
    }
}
