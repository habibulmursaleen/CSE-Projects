-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 08, 2018 at 08:19 AM
-- Server version: 10.1.36-MariaDB
-- PHP Version: 7.2.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `mattendance`
--

-- --------------------------------------------------------

--
-- Table structure for table `attendance`
--

CREATE TABLE `attendance` (
  `aid` int(11) NOT NULL,
  `sid` int(11) NOT NULL,
  `date` int(11) NOT NULL,
  `ispresent` tinyint(4) NOT NULL,
  `uid` int(11) NOT NULL,
  `id` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `attendance`
--

INSERT INTO `attendance` (`aid`, `sid`, `date`, `ispresent`, `uid`, `id`) VALUES
(92, 1, 1489795200, 1, 1, 1),
(93, 2, 1489795200, 1, 1, 1),
(94, 3, 1489795200, 1, 1, 1),
(95, 4, 1489795200, 1, 1, 1),
(96, 5, 1489795200, 1, 1, 1),
(97, 1, 1542668400, 1, 1, 1),
(98, 2, 1542668400, 1, 1, 1),
(99, 3, 1542668400, 1, 1, 1),
(100, 4, 1542668400, 0, 1, 1),
(101, 5, 1542668400, 0, 1, 1),
(102, 1, 1541026800, 1, 1, 1),
(103, 2, 1541026800, 1, 1, 1),
(104, 3, 1541026800, 1, 1, 1),
(105, 4, 1541026800, 0, 1, 1),
(106, 5, 1541026800, 0, 1, 1),
(107, 1, 1542754800, 1, 1, 1),
(108, 2, 1542754800, 1, 1, 1),
(109, 3, 1542754800, 1, 1, 1),
(110, 4, 1542754800, 1, 1, 1),
(111, 5, 1542754800, 0, 1, 1),
(112, 1, 1542150000, 0, 1, 1),
(113, 2, 1542150000, 1, 1, 1),
(114, 3, 1542150000, 1, 1, 1),
(115, 4, 1542150000, 0, 1, 1),
(116, 5, 1542150000, 0, 1, 1),
(117, 1, 1543878000, 1, 5, 2),
(118, 2, 1543878000, 0, 5, 2),
(119, 3, 1543878000, 0, 5, 2),
(120, 4, 1543878000, 0, 5, 2),
(121, 5, 1543878000, 1, 5, 2),
(122, 1, 1543532400, 0, 1, 1),
(123, 2, 1543532400, 0, 1, 1),
(124, 3, 1543532400, 1, 1, 1),
(125, 4, 1543532400, 1, 1, 1),
(126, 5, 1543532400, 0, 1, 1),
(127, 1, 1544223600, 1, 1, 1),
(128, 2, 1544223600, 1, 1, 1),
(129, 3, 1544223600, 1, 1, 1),
(130, 4, 1544223600, 1, 1, 1),
(131, 5, 1544223600, 0, 1, 1),
(132, 1, 1544137200, 0, 1, 1),
(133, 2, 1544137200, 1, 1, 1),
(134, 3, 1544137200, 1, 1, 1),
(135, 4, 1544137200, 0, 1, 1),
(136, 5, 1544137200, 0, 1, 1),
(137, 1, 1544050800, 0, 1, 1),
(138, 2, 1544050800, 1, 1, 1),
(139, 3, 1544050800, 0, 1, 1),
(140, 4, 1544050800, 0, 1, 1),
(141, 5, 1544050800, 1, 1, 1),
(142, 1, 1543791600, 0, 6, 2),
(143, 2, 1543791600, 1, 6, 2),
(144, 3, 1543791600, 0, 6, 2),
(145, 4, 1543791600, 1, 6, 2),
(146, 5, 1543791600, 0, 6, 2),
(147, 1, 1543618800, 1, 6, 1),
(148, 2, 1543618800, 1, 6, 1),
(149, 3, 1543618800, 1, 6, 1),
(150, 4, 1543618800, 0, 6, 1),
(151, 5, 1543618800, 0, 6, 1),
(152, 1, 1544050800, 1, 6, 2),
(153, 2, 1544050800, 0, 6, 2),
(154, 3, 1544050800, 0, 6, 2),
(155, 4, 1544050800, 0, 6, 2),
(156, 5, 1544050800, 1, 6, 2),
(157, 1, 1544223600, 1, 6, 2),
(158, 2, 1544223600, 1, 6, 2),
(159, 3, 1544223600, 1, 6, 2),
(160, 4, 1544223600, 1, 6, 2),
(161, 5, 1544223600, 1, 6, 2),
(162, 1, 1543618800, 1, 6, 2),
(163, 2, 1543618800, 1, 6, 2),
(164, 3, 1543618800, 1, 6, 2),
(165, 4, 1543618800, 1, 6, 2),
(166, 5, 1543618800, 1, 6, 2),
(167, 1, 1543964400, 1, 6, 1),
(168, 2, 1543964400, 0, 6, 1),
(169, 3, 1543964400, 0, 6, 1),
(170, 4, 1543964400, 0, 6, 1),
(171, 5, 1543964400, 1, 6, 1);

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE `student` (
  `sid` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `rollno` varchar(255) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`sid`, `name`, `rollno`) VALUES
(1, 'jsn', '101'),
(2, 'parth', '102'),
(3, 'jainik', '103'),
(4, 'ronak', '104'),
(5, 'ritul', '105');

-- --------------------------------------------------------

--
-- Table structure for table `student_subject`
--

CREATE TABLE `student_subject` (
  `sid` int(11) NOT NULL,
  `id` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `student_subject`
--

INSERT INTO `student_subject` (`sid`, `id`) VALUES
(1, 1),
(1, 2),
(1, 3),
(1, 4),
(1, 5),
(2, 1),
(2, 2),
(2, 3),
(2, 4),
(2, 5),
(3, 1),
(3, 2),
(3, 3),
(3, 4),
(3, 5),
(4, 1),
(4, 2),
(4, 3),
(4, 4),
(4, 5),
(5, 1),
(5, 2),
(5, 3),
(5, 4),
(5, 5);

-- --------------------------------------------------------

--
-- Table structure for table `subject`
--

CREATE TABLE `subject` (
  `id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `subject`
--

INSERT INTO `subject` (`id`, `name`) VALUES
(1, 'maths'),
(2, 'csa'),
(3, 'dm'),
(4, 'jt'),
(5, 'daa');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `uid` int(11) NOT NULL,
  `uname` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `status` tinyint(4) NOT NULL,
  `created` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`uid`, `uname`, `password`, `email`, `status`, `created`) VALUES
(1, 'vbp', 'vbp', 'vbp@gmail.com', 1, 1489060137),
(2, 'njb', 'njb', 'njb@gmail.com', 1, 1489060137),
(3, 'prd', 'prd', 'prd@gmail.com', 1, 1489060137),
(4, 'pmc', 'pmc', 'pmc@gmail.com', 1, 1489060137),
(5, 'admin', 'admin', '', 0, 0),
(6, 'mursalin', '123', 'hgfghgf', 1, 1489060137);

-- --------------------------------------------------------

--
-- Table structure for table `user_subject`
--

CREATE TABLE `user_subject` (
  `uid` int(11) NOT NULL,
  `id` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user_subject`
--

INSERT INTO `user_subject` (`uid`, `id`) VALUES
(1, 1),
(3, 2),
(4, 5),
(2, 4),
(5, 1),
(0, 2),
(5, 4),
(0, 5),
(5, 1),
(5, 2),
(5, 4),
(5, 5),
(6, 1),
(6, 2);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `attendance`
--
ALTER TABLE `attendance`
  ADD PRIMARY KEY (`aid`);

--
-- Indexes for table `student`
--
ALTER TABLE `student`
  ADD PRIMARY KEY (`sid`);

--
-- Indexes for table `subject`
--
ALTER TABLE `subject`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`uid`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `attendance`
--
ALTER TABLE `attendance`
  MODIFY `aid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=172;

--
-- AUTO_INCREMENT for table `student`
--
ALTER TABLE `student`
  MODIFY `sid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `subject`
--
ALTER TABLE `subject`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `uid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
