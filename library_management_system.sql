-- phpMyAdmin SQL Dump
-- version 5.0.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 19, 2020 at 12:00 AM
-- Server version: 10.4.14-MariaDB
-- PHP Version: 7.4.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `library_management_system`
--

-- --------------------------------------------------------

--
-- Table structure for table `administration`
--

CREATE TABLE `administration` (
  `si` int(11) NOT NULL,
  `admin_name` varchar(50) DEFAULT NULL,
  `admin_id` varchar(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `administration`
--

INSERT INTO `administration` (`si`, `admin_name`, `admin_id`) VALUES
(1, 'Mst. Zannatul Maoya Mim', '192-15-13062'),
(2, 'Khairun Neesa', '192-15-13186');

-- --------------------------------------------------------

--
-- Table structure for table `area_details`
--

CREATE TABLE `area_details` (
  `si` int(11) NOT NULL,
  `day` varchar(10) DEFAULT NULL,
  `area_name` varchar(15) DEFAULT NULL,
  `time` varchar(10) DEFAULT NULL,
  `duration` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `area_details`
--

INSERT INTO `area_details` (`si`, `day`, `area_name`, `time`, `duration`) VALUES
(1, 'saturday', 'dhanmondi', '04:00 pm', '1 hour'),
(2, 'sunday', 'demra', '04:00 pm', '1 hour'),
(3, 'monday', 'mirpur', '3:00 pm', '1 hour'),
(4, 'tuesday ', 'uttara', '03:00 pm', '1 hour'),
(5, 'wednesday ', 'rampura', '04:00 pm', '1 hour'),
(6, 'thursday  ', 'mogbazar', '04:00 pm', '1 hour'),
(7, 'friday ', 'bashabo', '03:00 pm', '1 hour');

-- --------------------------------------------------------

--
-- Table structure for table `book_details`
--

CREATE TABLE `book_details` (
  `si` int(11) NOT NULL,
  `book_code` varchar(6) DEFAULT NULL,
  `book_name` varchar(35) DEFAULT NULL,
  `author_name` varchar(35) DEFAULT NULL,
  `category` varchar(35) DEFAULT NULL,
  `page_no` int(5) DEFAULT NULL,
  `edition` varchar(5) DEFAULT NULL,
  `price` int(11) DEFAULT NULL,
  `arrival_date` varchar(15) DEFAULT NULL,
  `supplier_id` varchar(5) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `book_details`
--

INSERT INTO `book_details` (`si`, `book_code`, `book_name`, `author_name`, `category`, `page_no`, `edition`, `price`, `arrival_date`, `supplier_id`) VALUES
(1, 'B001', 'Noukadubi', 'Rabindranath Thakur', 'Novel', 258, '3rd', 150, '15-11-2020', '1230'),
(2, 'B002', 'The Alchemist', 'Paulo Coelho', 'Novel', 197, '1st', 200, '22-11-2020', '1233'),
(3, 'B003', 'Shapmochan', 'Falguni Mukhopadhyay', 'Novel', 112, '5th', 150, '20-11-2020', '1232'),
(4, 'B004', 'Science Fiction Samagra- Part 1', 'Muhammad Zafar Iqbal', 'Fiction', 588, '1st', 650, '15-11-2020', '1230'),
(5, 'B005', 'Sarat Rachanabali', 'Sarat Chandra Chattopadhyay', 'Novel', 780, '3rd', 800, '22-11-2020', '1233'),
(6, 'B006', 'Kothao Keu Nei', 'Humayun Ahmed ', 'Novel', 256, '3rd', 300, '15-11-2020', '1230'),
(7, 'B007', 'Ma', 'Maxim Gorky ', 'Classics ', 432, '3rd', 400, '18-11-2020', '1231'),
(8, 'B008', 'Les Miserables', 'Victor Hugo ', 'Historical Fiction ', 350, '5th', 400, '20-11-2020', '1232'),
(9, 'B009', 'Megh Boleche Jabo Jabo', 'Humayun Ahmed ', 'Novel', 244, '2nd', 300, '18-11-2020', '1231'),
(10, 'B010', 'Black Coffee', 'Agatha Christie ', 'Novel', 188, '2nd', 300, '20-11-2020', '1232');

-- --------------------------------------------------------

--
-- Table structure for table `supplier_details`
--

CREATE TABLE `supplier_details` (
  `si` int(11) NOT NULL,
  `supplier_Id` varchar(20) DEFAULT NULL,
  `supplier_name` varchar(20) DEFAULT NULL,
  `contact_no` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `supplier_details`
--

INSERT INTO `supplier_details` (`si`, `supplier_Id`, `supplier_name`, `contact_no`) VALUES
(1, '1230', 'Mokbul Rahman', '01739029491'),
(2, '1231', 'Rakibul Hossain', '01740029261'),
(3, '1232', 'Mominur Islam', '017838905427'),
(4, '1233', 'Sahinur Rahman', '017296540178');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `si` int(11) NOT NULL,
  `member_id` varchar(10) DEFAULT NULL,
  `member_name` varchar(20) DEFAULT NULL,
  `address` varchar(15) DEFAULT NULL,
  `contact_no` varchar(15) DEFAULT NULL,
  `date_register` varchar(15) DEFAULT NULL,
  `date_expired` varchar(15) DEFAULT NULL,
  `membership_status` varchar(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`si`, `member_id`, `member_name`, `address`, `contact_no`, `date_register`, `date_expired`, `membership_status`) VALUES
(1, '1301', 'Mahfuza Akter', 'Dhanmondi', '01765962345', '19-12-2020', '26-12-2020', 'Active'),
(2, '1302', 'Sakila  Akter', 'Mirpur', '01784565803', '7-12-2020', '14-12-2020', 'Active'),
(3, '1303', 'Arafat Islam', 'Bashabo', '01956347892', '11-12-2020', '18-12-2020', 'Active'),
(4, '1304', 'Konok Rahman', 'Bashabo', '01756784325', '11-12-2020', '18-12-2020', 'Active'),
(5, '1305', 'Manik  Islam', 'Bashabo', '01778432894', '11-12-2020', '18-12-2020', 'Active'),
(6, '1306', 'Arunima Roy', 'Rampura', '01764378945', '9-12-2020', '16-12-2020', 'Active'),
(7, '1307', 'Tinni Roy', 'Rampura', '01774356893', '9-12-2020', '16-12-2020', 'Active'),
(8, '1308', 'Tonima Islam', 'Rampura', '01776547883', '9-12-2020', '16-12-2020', 'Active'),
(9, '1309', 'Mizanur Rahman', 'Mohakhali', '01746889321', '13-12-2020', '20-12-2020', 'Active'),
(10, '1310', 'Tamanna Islam', 'Rampura', '01786426893', '---------', '--------', 'Inactive');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `administration`
--
ALTER TABLE `administration`
  ADD PRIMARY KEY (`si`);

--
-- Indexes for table `area_details`
--
ALTER TABLE `area_details`
  ADD PRIMARY KEY (`si`);

--
-- Indexes for table `book_details`
--
ALTER TABLE `book_details`
  ADD PRIMARY KEY (`si`);

--
-- Indexes for table `supplier_details`
--
ALTER TABLE `supplier_details`
  ADD PRIMARY KEY (`si`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`si`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `administration`
--
ALTER TABLE `administration`
  MODIFY `si` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `area_details`
--
ALTER TABLE `area_details`
  MODIFY `si` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `book_details`
--
ALTER TABLE `book_details`
  MODIFY `si` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT for table `supplier_details`
--
ALTER TABLE `supplier_details`
  MODIFY `si` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `si` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
