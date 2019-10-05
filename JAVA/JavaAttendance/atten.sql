-- phpMyAdmin SQL Dump
-- version 4.7.7
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 06, 2018 at 01:42 PM
-- Server version: 10.1.30-MariaDB
-- PHP Version: 7.2.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `atten`
--

-- --------------------------------------------------------

--
-- Table structure for table `c#_g`
--

CREATE TABLE `c#_g` (
  `id` varchar(128) NOT NULL,
  `name` varchar(128) NOT NULL,
  `student_info_table` varchar(128) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `c#_g`
--

INSERT INTO `c#_g` (`id`, `name`, `student_info_table`) VALUES
('02', 'D', '02_D'),
('06', 'S', '06_S'),
('02', 'D', '02_D'),
('06', 'S', '06_S'),
('04', 'W', '04_W'),
('01', 'A', '01_A'),
('03', 'B', '03_B'),
('05', 'R', '05_R'),
('12', 'T', '12_T'),
('16', 'Q', '16_Q');

-- --------------------------------------------------------

--
-- Table structure for table `java_d`
--

CREATE TABLE `java_d` (
  `serial` int(60) NOT NULL,
  `id` varchar(60) NOT NULL,
  `name` varchar(60) NOT NULL,
  `student_info_table` varchar(60) NOT NULL,
  `01_05_2018` varchar(60) DEFAULT NULL,
  `02_05_2018` varchar(60) DEFAULT NULL,
  `03_05_2018` varchar(60) DEFAULT NULL,
  `04_05_2018` varchar(60) DEFAULT NULL,
  `05_05_2018` varchar(60) DEFAULT NULL,
  `07_05_2018` varchar(60) DEFAULT NULL,
  `25_05_2018` varchar(60) DEFAULT NULL,
  `10_05_2018` varchar(60) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `java_d`
--

INSERT INTO `java_d` (`serial`, `id`, `name`, `student_info_table`, `01_05_2018`, `02_05_2018`, `03_05_2018`, `04_05_2018`, `05_05_2018`, `07_05_2018`, `25_05_2018`, `10_05_2018`) VALUES
(1, '15', 'J', '15_j', 'Present', 'Late', 'Absent', 'Present', 'Present', 'Present', 'Absent', 'Present'),
(2, '25', 'k', '25_k', 'Late', 'Absent', 'Late', 'Late', 'Late', 'Late', 'Absent', 'Present'),
(3, '52', 'i', '52_i', 'Absent', 'Late', 'Present', 'Absent', 'Absent', 'Absent', 'Absent', 'Present'),
(4, '62', 'p', '62_p', 'Late', 'Present', 'Late', 'Late', 'Late', 'Absent', 'Absent', 'Present'),
(5, '98', 'o', '98_o', 'Present', 'Late', 'Absent', 'Present', 'Present', 'Absent', 'Absent', 'Present'),
(6, '14', 'm', '14_m', 'Late', 'Absent', 'Late', 'Late', 'Late', 'Absent', 'Absent', 'Present'),
(7, '36', 'u', '36_u', 'Absent', 'Late', 'Present', 'Absent', 'Absent', 'Absent', 'Absent', 'Present'),
(8, '69', 's', '69_s', 'Late', 'Present', 'Late', 'Late', 'Late', 'Absent', 'Absent', 'Present'),
(9, '28', 'd', '28_d', 'Present', 'Late', 'Absent', 'Present', 'Present', 'Absent', 'Absent', 'Late'),
(10, '36', 'f', '36_f', 'Late', 'Absent', 'Late', 'Late', 'Late', 'Absent', 'Absent', 'Present');

-- --------------------------------------------------------

--
-- Table structure for table `java_f`
--

CREATE TABLE `java_f` (
  `id` varchar(128) NOT NULL,
  `name` varchar(128) NOT NULL,
  `student_info_table` varchar(128) NOT NULL,
  `05_05_2018` varchar(60) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `java_f`
--

INSERT INTO `java_f` (`id`, `name`, `student_info_table`, `05_05_2018`) VALUES
('02', 'F', '02_f', NULL),
('45', 'G', '45_g', NULL),
('15', 'E', '15_e', NULL),
('49', 'R', '49_r', NULL),
('25', 'T', '25_t', NULL),
('65', 'H', '65_H', NULL),
('22', 'Y', '22_y', NULL),
('61', 'R', '61_r', NULL),
('25', 'T', '25_t', NULL),
('30', 'Y', '30_y', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `sectab1`
--

CREATE TABLE `sectab1` (
  `class` varchar(128) NOT NULL,
  `section` varchar(128) NOT NULL,
  `sec_student_table` varchar(128) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `sectab1`
--

INSERT INTO `sectab1` (`class`, `section`, `sec_student_table`) VALUES
('C#', 'G', 'c#_g'),
('Java', 'F', 'java_f'),
('C#', 'K', 'c#_k'),
('Java', 'D', 'java_d');

-- --------------------------------------------------------

--
-- Table structure for table `teacher`
--

CREATE TABLE `teacher` (
  `username` varchar(128) NOT NULL,
  `password` varchar(128) NOT NULL,
  `Sec_Table` varchar(128) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `teacher`
--

INSERT INTO `teacher` (`username`, `password`, `Sec_Table`) VALUES
('Admin', 'Admin', 'SecTab1'),
('Admin', 'Admin', 'SecTab1'),
('A', 'A', 'A'),
('AB', 'AB', 'AB');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
