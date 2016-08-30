-- --------------------------------------------------------
-- 主机:                           127.0.0.1
-- 服务器版本:                        5.0.18-nt - MySQL Community Edition (GPL)
-- 服务器操作系统:                      Win32
-- HeidiSQL 版本:                  8.2.0.4675
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- 导出 obd_message 的数据库结构
DROP DATABASE IF EXISTS `obd_message`;
CREATE DATABASE IF NOT EXISTS `obd_message` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `obd_message`;


-- 导出  表 obd_message.cps_province 结构
DROP TABLE IF EXISTS `cps_province`;
CREATE TABLE IF NOT EXISTS `cps_province` (
  `id` int(11) NOT NULL default '0',
  `name` varchar(40) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 数据导出被取消选择。


-- 导出  表 obd_message.cs_district 结构
DROP TABLE IF EXISTS `cs_district`;
CREATE TABLE IF NOT EXISTS `cs_district` (
  `ID` int(11) NOT NULL,
  `BRIEF_PIN` varchar(255) default NULL,
  `FULL_NAME` varchar(255) default NULL,
  `DLEVEL` int(11) default NULL,
  `DNAME` varchar(255) default NULL,
  `ORDER_NO` int(11) default NULL,
  `PIN_NAME` varchar(255) default NULL,
  `UPPER_ID` int(11) default NULL,
  PRIMARY KEY  (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 数据导出被取消选择。
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
