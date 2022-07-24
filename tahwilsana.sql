-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 03, 2022 at 09:36 AM
-- Server version: 10.4.21-MariaDB
-- PHP Version: 8.0.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `tahwilsana`
--

-- --------------------------------------------------------

--
-- Table structure for table `feedback`
--

CREATE TABLE `feedback` (
  `email` varchar(32) NOT NULL,
  `laporan` varchar(100) NOT NULL,
  `waktu` varchar(32) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `feedback`
--

INSERT INTO `feedback` (`email`, `laporan`, `waktu`) VALUES
('abdul@gmial.com', 'Mohon di fix-kan ke tanggal yang asli', '17.00/Magrib oke'),
('null', 'mohon maaf lahir dan patin', 'Wed May 25 10:08:30 ICT 2022'),
('null', 'sudah bagus kaka', 'Wed May 25 10:09:07 ICT 2022'),
('abugosok@gmail', 'null', 'Thu May 26 20:07:38 ICT 2022'),
('abugosok@gmail', 'null', 'Thu May 26 20:08:13 ICT 2022'),
('abugosok@gmail', 'Jos', 'Thu May 26 20:16:12 ICT 2022');

-- --------------------------------------------------------

--
-- Table structure for table `histori`
--

CREATE TABLE `histori` (
  `aktivitas` varchar(40) NOT NULL,
  `email` varchar(40) NOT NULL,
  `nama_lengkap` varchar(40) NOT NULL,
  `waktu` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `histori`
--

INSERT INTO `histori` (`aktivitas`, `email`, `nama_lengkap`, `waktu`) VALUES
('SIGN UP', 'null', 'Mehmet Izzet', 'Tue May 24 22:07:26 ICT 2022'),
('LOGIN', 'null', 'Mehmet Izzet', 'Tue May 24 22:07:37 ICT 2022'),
('SIGN UP', 'as@ek', 'Karl Heinze', 'Tue May 24 22:14:49 ICT 2022'),
('SIGN UP', 'adin@mail', 'Lars Lokke', 'Tue May 24 22:33:26 ICT 2022'),
('LOGIN', 'Email . . .', 'null', 'Tue May 24 22:59:24 ICT 2022'),
('LOGIN', 'adin@mail', 'Lars Lokke', 'Tue May 24 23:00:46 ICT 2022'),
('LOGIN', 'abugosok@gmail', 'Vittorio Rei', 'Tue May 24 23:15:12 ICT 2022'),
('LOG OUT', 'abugosok@gmail', 'Vittorio Rei', 'Tue May 24 23:15:15 ICT 2022'),
('LOG OUT', 'null', 'null', 'Wed May 25 10:09:11 ICT 2022'),
('LOGIN', 'abugosok@gmail', 'Vittorio Rei', 'Thu May 26 20:07:33 ICT 2022'),
('LOG OUT', 'abugosok@gmail', 'Vittorio Rei', 'Thu May 26 20:07:51 ICT 2022'),
('LOGIN', 'abugosok@gmail', 'Vittorio Rei', 'Thu May 26 20:08:08 ICT 2022'),
('LOG OUT', 'null', 'null', 'Thu May 26 20:09:44 ICT 2022'),
('LOGIN', 'abugosok@gmail', 'Vittorio Rei', 'Thu May 26 20:16:03 ICT 2022'),
('LOG OUT', 'null', 'null', 'Thu May 26 20:16:22 ICT 2022'),
('LOGIN', 'go@kar', 'Mehmet Izzet', 'Thu May 26 20:19:23 ICT 2022'),
('SIGN UP', 'Email . . .', ' Last Name . . .', 'Thu May 26 21:52:10 ICT 2022');

-- --------------------------------------------------------

--
-- Table structure for table `perloginan`
--

CREATE TABLE `perloginan` (
  `depan` varchar(32) NOT NULL,
  `belakang` varchar(32) NOT NULL,
  `lengkap` varchar(32) NOT NULL,
  `email` varchar(32) NOT NULL,
  `id` varchar(32) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `perloginan`
--

INSERT INTO `perloginan` (`depan`, `belakang`, `lengkap`, `email`, `id`) VALUES
('Vittorio', 'Rei', 'Vittorio Rei', 'abugosok@gmail', 'AEZAKMI'),
('Lars', 'Lokke', 'Lars Lokke', 'adin@mail', 'HESOYAM'),
('Mehmet', 'Izzet', 'Mehmet Izzet', 'go@kar', 'KJKSZPJ');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `perloginan`
--
ALTER TABLE `perloginan`
  ADD PRIMARY KEY (`email`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
