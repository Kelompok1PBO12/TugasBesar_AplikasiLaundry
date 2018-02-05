-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 04 Feb 2018 pada 15.26
-- Versi Server: 10.1.29-MariaDB
-- PHP Version: 7.1.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_laundry`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `status`
--

CREATE TABLE `status` (
  `No` int(11) NOT NULL,
  `Id_transaksi` varchar(11) NOT NULL,
  `Id_pelanggan` varchar(11) NOT NULL,
  `Nama_pelanggan` varchar(50) NOT NULL,
  `Tanggal_diambil` varchar(10) NOT NULL,
  `Status` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_akun`
--

CREATE TABLE `tb_akun` (
  `username` varchar(225) NOT NULL,
  `password` varchar(225) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `tb_akun`
--

INSERT INTO `tb_akun` (`username`, `password`) VALUES
('admin', 'admin');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_tansaksi`
--

CREATE TABLE `tb_tansaksi` (
  `Id_transaksi` int(11) NOT NULL,
  `Nama` varchar(225) NOT NULL,
  `Berat` int(11) NOT NULL,
  `Tgl_masuk` varchar(2) NOT NULL,
  `Tgl_selesai` varchar(2) NOT NULL,
  `Bulan` varchar(30) NOT NULL,
  `Tahun` varchar(4) NOT NULL,
  `Jenis` varchar(30) NOT NULL,
  `Harga` int(11) NOT NULL,
  `Petugas` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `tb_tansaksi`
--

INSERT INTO `tb_tansaksi` (`Id_transaksi`, `Nama`, `Berat`, `Tgl_masuk`, `Tgl_selesai`, `Bulan`, `Tahun`, `Jenis`, `Harga`, `Petugas`) VALUES
(8, 'moa', 11, '4', '6', '2', '2018', 'Cuci Kering', 33000, 'sthevan'),
(9, 'cris', 13, '3', '7', '2', '2018', 'Cuci Kering', 39000, 'admin');

-- --------------------------------------------------------

--
-- Struktur dari tabel `transaksi`
--

CREATE TABLE `transaksi` (
  `Tanggal Masuk` varchar(8) NOT NULL,
  `ID Transaksi` int(11) NOT NULL,
  `Pemasukan` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tb_tansaksi`
--
ALTER TABLE `tb_tansaksi`
  ADD PRIMARY KEY (`Id_transaksi`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tb_tansaksi`
--
ALTER TABLE `tb_tansaksi`
  MODIFY `Id_transaksi` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
