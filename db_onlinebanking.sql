-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 19, 2024 at 08:23 PM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_onlinebanking`
--

-- --------------------------------------------------------

--
-- Table structure for table `tb_signup`
--

CREATE TABLE `tb_signup` (
  `fdSNo` int(11) NOT NULL,
  `fdName` varchar(255) NOT NULL,
  `fd_PhoneNumber` varchar(255) NOT NULL,
  `fdPan` varchar(255) NOT NULL,
  `fdPinCode` varchar(255) NOT NULL,
  `fdAccountType` varchar(255) NOT NULL,
  `fd_Address` varchar(255) NOT NULL,
  `fd_Gender` varchar(255) NOT NULL,
  `fd_Nationality` varchar(255) NOT NULL,
  `fd_Dob` varchar(255) NOT NULL,
  `fd_AccountId` varchar(255) NOT NULL,
  `fd_Amount` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tb_signup`
--

INSERT INTO `tb_signup` (`fdSNo`, `fdName`, `fd_PhoneNumber`, `fdPan`, `fdPinCode`, `fdAccountType`, `fd_Address`, `fd_Gender`, `fd_Nationality`, `fd_Dob`, `fd_AccountId`, `fd_Amount`) VALUES
(14, 'Mohamed', '01063662980', 'TESTMO', '01123456', 'Current', 'assuit', 'Male', 'egyption', '26/02/2002', '9631', '10500'),
(15, 'moha', '01158184853', 'TESTL', '01158184', 'Current', 'ASSUIT', 'Male', 'egyption', '20/02/2002', '4997', '6600'),
(16, 'TEST', '11111', 'sstrewr', '123456', 'Current', 'alex', 'Male', 'egyption', '20/2/2002', '6857', '7240'),
(17, 'Mary', '011405553', 'DEMO1', '456789', 'Saving', 'assuit', 'Female', 'egyption', '27/10/2001', '1282', '9235'),
(18, 'test', '0124403355', 'DEMO2', '112233', 'Current', 'assuit', 'Male', 'Syrian', '21/01/2004', '3320', '3400'),
(19, 'test', '0125578844', 'DEMO3', '445566', 'Current', 'Assuit', 'Male', 'Syrian', '21/01/2004', '0823', '5600');

-- --------------------------------------------------------

--
-- Table structure for table `tb_transactions`
--

CREATE TABLE `tb_transactions` (
  `fd_SNo` int(11) NOT NULL,
  `fd_SenderId` varchar(255) NOT NULL,
  `fd_RecieverId` varchar(255) NOT NULL,
  `fd_Amount` varchar(255) NOT NULL,
  `fd_DateTime` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tb_transactions`
--

INSERT INTO `tb_transactions` (`fd_SNo`, `fd_SenderId`, `fd_RecieverId`, `fd_Amount`, `fd_DateTime`) VALUES
(10, '15', '9631', '1000', '19/12/24 03:54:35'),
(11, '17', '4997', '3000', '19/12/24 05:24:29');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tb_signup`
--
ALTER TABLE `tb_signup`
  ADD PRIMARY KEY (`fdSNo`);

--
-- Indexes for table `tb_transactions`
--
ALTER TABLE `tb_transactions`
  ADD PRIMARY KEY (`fd_SNo`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tb_signup`
--
ALTER TABLE `tb_signup`
  MODIFY `fdSNo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;

--
-- AUTO_INCREMENT for table `tb_transactions`
--
ALTER TABLE `tb_transactions`
  MODIFY `fd_SNo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
