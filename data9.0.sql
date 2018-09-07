/*
SQLyog 企业版 - MySQL GUI v8.14 
MySQL - 5.5.40 : Database - data
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`data` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `data`;

/*Table structure for table `admin_info` */

DROP TABLE IF EXISTS `admin_info`;

CREATE TABLE `admin_info` (
  `admin_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '管理员的id',
  `username` varchar(20) NOT NULL COMMENT '管理员的用户名',
  `password` varchar(20) NOT NULL COMMENT '管理员的密码',
  UNIQUE KEY `admin_id` (`admin_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `admin_info` */

/*Table structure for table `airline_info` */

DROP TABLE IF EXISTS `airline_info`;

CREATE TABLE `airline_info` (
  `airline_id` int(10) NOT NULL AUTO_INCREMENT COMMENT '航空信息id',
  `airline_level` int(1) NOT NULL COMMENT '1,2,3表示等级',
  `airline_date` varchar(16) NOT NULL COMMENT '出行时间',
  `airline_num` varchar(10) NOT NULL COMMENT '客户等级',
  `airline_fee` double NOT NULL COMMENT '平均票价',
  PRIMARY KEY (`airline_id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

/*Data for the table `airline_info` */

insert  into `airline_info`(`airline_id`,`airline_level`,`airline_date`,`airline_num`,`airline_fee`) values (1,3,'0000-00-00','3',200),(2,2,'0000-00-00','2',500),(4,3,'2018-07-18','SJ789',1234),(5,1,'2018-07-13','SJ889',1234.22),(6,1,'2018-07-13','SJ889',1234.22),(7,3,'2018-07-13','SA889',1234.22);

/*Table structure for table `blacklist_credit_u_info` */

DROP TABLE IF EXISTS `blacklist_credit_u_info`;

CREATE TABLE `blacklist_credit_u_info` (
  `blacklist_credit_u_id` int(10) NOT NULL AUTO_INCREMENT COMMENT '信贷逾期黑名单之用户的id',
  `user_id` int(10) NOT NULL COMMENT '用户的id',
  `blacklist_detail` varchar(1024) NOT NULL COMMENT '事件详情',
  PRIMARY KEY (`blacklist_credit_u_id`),
  KEY `user_FK27` (`user_id`),
  CONSTRAINT `FK_USER_BLACK_CREDIT_U` FOREIGN KEY (`user_id`) REFERENCES `user_info` (`user_id`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `blacklist_credit_u_info` */

insert  into `blacklist_credit_u_info`(`blacklist_credit_u_id`,`user_id`,`blacklist_detail`) values (1,1,'巴'),(2,2,'巴'),(3,1,'巴');

/*Table structure for table `blacklist_credit_w_info` */

DROP TABLE IF EXISTS `blacklist_credit_w_info`;

CREATE TABLE `blacklist_credit_w_info` (
  `blacklist_credit_w_id` int(10) NOT NULL AUTO_INCREMENT COMMENT '信贷黑名单之企业的id',
  `workunit_id` int(10) NOT NULL COMMENT '企业的id',
  `blacklist_detail` varchar(1024) NOT NULL COMMENT '事件详情',
  PRIMARY KEY (`blacklist_credit_w_id`),
  KEY `workunit_FK11` (`workunit_id`),
  CONSTRAINT `FK_USER_BLACK_CREDIT_W` FOREIGN KEY (`workunit_id`) REFERENCES `workunit_info` (`workunit_id`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `blacklist_credit_w_info` */

insert  into `blacklist_credit_w_info`(`blacklist_credit_w_id`,`workunit_id`,`blacklist_detail`) values (1,1,'b'),(2,2,'b');

/*Table structure for table `blacklist_legal_u_info` */

DROP TABLE IF EXISTS `blacklist_legal_u_info`;

CREATE TABLE `blacklist_legal_u_info` (
  `blacklist_legal_u_id` int(10) NOT NULL AUTO_INCREMENT COMMENT '人事刑事案件id',
  `user_id` int(10) NOT NULL COMMENT '用户的id',
  `blacklist_detail` varchar(1024) NOT NULL COMMENT '事件详情',
  PRIMARY KEY (`blacklist_legal_u_id`),
  KEY `user_FK26` (`user_id`),
  CONSTRAINT `FK_USER_BLACKLIST_LEGAL_U` FOREIGN KEY (`user_id`) REFERENCES `user_info` (`user_id`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `blacklist_legal_u_info` */

insert  into `blacklist_legal_u_info`(`blacklist_legal_u_id`,`user_id`,`blacklist_detail`) values (1,1,'1'),(3,2,'2');

/*Table structure for table `blacklist_legal_w_info` */

DROP TABLE IF EXISTS `blacklist_legal_w_info`;

CREATE TABLE `blacklist_legal_w_info` (
  `blacklist_legal_w_id` int(10) NOT NULL AUTO_INCREMENT COMMENT '企业刑事案件的id',
  `workunit_id` int(10) NOT NULL COMMENT '企业的id',
  `blacklist_detail` varchar(1024) NOT NULL COMMENT '事件详情',
  PRIMARY KEY (`blacklist_legal_w_id`),
  KEY `workunit_FK10` (`workunit_id`),
  CONSTRAINT `FK_USER_BLACK_LEGAL_W` FOREIGN KEY (`workunit_id`) REFERENCES `workunit_info` (`workunit_id`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `blacklist_legal_w_info` */

insert  into `blacklist_legal_w_info`(`blacklist_legal_w_id`,`workunit_id`,`blacklist_detail`) values (1,2,'1'),(2,2,'3'),(3,1,'1');

/*Table structure for table `blacklist_user_info` */

DROP TABLE IF EXISTS `blacklist_user_info`;

CREATE TABLE `blacklist_user_info` (
  `blacklist_user_id` int(10) NOT NULL AUTO_INCREMENT COMMENT '黑名单之用户的id',
  `user_id` int(10) NOT NULL COMMENT '用户的id',
  `blacklist_detail` varchar(1024) NOT NULL COMMENT '黑名单详情',
  PRIMARY KEY (`blacklist_user_id`),
  KEY `user_FK25` (`user_id`),
  CONSTRAINT `FK_USER_BLACKLIST` FOREIGN KEY (`user_id`) REFERENCES `user_info` (`user_id`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `blacklist_user_info` */

insert  into `blacklist_user_info`(`blacklist_user_id`,`user_id`,`blacklist_detail`) values (1,4,'1'),(2,2,'2'),(3,2,'1');

/*Table structure for table `blacklist_workunit_info` */

DROP TABLE IF EXISTS `blacklist_workunit_info`;

CREATE TABLE `blacklist_workunit_info` (
  `blacklist_workunit_id` int(10) NOT NULL AUTO_INCREMENT COMMENT '黑名单之企业的id',
  `workunit_id` int(10) NOT NULL COMMENT '企业的id',
  `blacklist_detail` varchar(1024) NOT NULL COMMENT '黑名单详情',
  PRIMARY KEY (`blacklist_workunit_id`),
  KEY `workunit_FK6` (`workunit_id`),
  CONSTRAINT `FK_USER_BLACKLIST_WORKUNIT` FOREIGN KEY (`workunit_id`) REFERENCES `workunit_info` (`workunit_id`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `blacklist_workunit_info` */

insert  into `blacklist_workunit_info`(`blacklist_workunit_id`,`workunit_id`,`blacklist_detail`) values (1,1,'1'),(2,2,'1');

/*Table structure for table `car_info` */

DROP TABLE IF EXISTS `car_info`;

CREATE TABLE `car_info` (
  `car_id` int(10) NOT NULL AUTO_INCREMENT COMMENT '车产的id',
  `car_number` varchar(8) NOT NULL COMMENT '车牌号',
  `car_brand` varchar(10) NOT NULL COMMENT '机动车名牌',
  `car_model` varchar(10) NOT NULL COMMENT '车型',
  `car_buy_date` varchar(14) NOT NULL COMMENT '购买日期',
  `car_type_year` varchar(14) DEFAULT NULL COMMENT '年款',
  `car_hit_market` varchar(14) DEFAULT NULL COMMENT '上市年份',
  `car_type` varchar(3) DEFAULT NULL COMMENT '车辆类型',
  `car_size` varchar(3) DEFAULT NULL COMMENT '车辆级别',
  `car_pro_country` varchar(8) DEFAULT NULL COMMENT '国别',
  `car_pro_type` tinyint(1) DEFAULT '0' COMMENT '0为本国产，1为进口',
  `user_id` int(11) DEFAULT NULL COMMENT '车子所有者',
  UNIQUE KEY `car_id` (`car_id`),
  KEY `FK_USER_CAR` (`user_id`),
  CONSTRAINT `FK_USER_CAR` FOREIGN KEY (`user_id`) REFERENCES `user_info` (`user_id`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

/*Data for the table `car_info` */

insert  into `car_info`(`car_id`,`car_number`,`car_brand`,`car_model`,`car_buy_date`,`car_type_year`,`car_hit_market`,`car_type`,`car_size`,`car_pro_country`,`car_pro_type`,`user_id`) values (1,'粤A225665','东风','飞天','2001-02-01','0000-00-00','0000-00-00','小轿车','2','加拿大',0,1),(2,'粤B226331','甭吃','332A','2009-01-02','0000-00-00','0000-00-00','重型车','5','蹦达拉国',1,1),(3,'粤C226331','鲍马','776','2017-03-02','0000-00-00','0000-00-00','小轿车','2','中国',0,2),(4,'粤D22123','玛莎拉蒂','2232','2019-2-2',NULL,'2013-4-12',NULL,'轿车','英国',1,4),(5,'粤D22223','玛莎拉蒂','2232','2019-2-2',NULL,'2013-4-12',NULL,'轿车','英国',0,4);

/*Table structure for table `card_out_12m_info` */

DROP TABLE IF EXISTS `card_out_12m_info`;

CREATE TABLE `card_out_12m_info` (
  `out_12m_id` int(10) NOT NULL AUTO_INCREMENT COMMENT '十二个月支出信息的id',
  `out_12m_time` int(4) NOT NULL COMMENT '十二个月支出信息的次数',
  `out_12m_amount` int(13) NOT NULL COMMENT '十二个月支出信息的金额',
  `user_id` int(11) NOT NULL COMMENT '信息的所有者id',
  UNIQUE KEY `out_12m_id` (`out_12m_id`),
  KEY `FK_USER_12` (`user_id`),
  CONSTRAINT `FK_USER_12` FOREIGN KEY (`user_id`) REFERENCES `user_info` (`user_id`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `card_out_12m_info` */

insert  into `card_out_12m_info`(`out_12m_id`,`out_12m_time`,`out_12m_amount`,`user_id`) values (1,12,120,1),(2,1,3000,1),(3,20,20000,2);

/*Table structure for table `card_out_3m_info` */

DROP TABLE IF EXISTS `card_out_3m_info`;

CREATE TABLE `card_out_3m_info` (
  `out_3m_id` int(10) NOT NULL AUTO_INCREMENT COMMENT '三个月支出信息的id',
  `out_3m_time` int(3) NOT NULL COMMENT '三个月支出的次数',
  `out_3m_amount` int(9) NOT NULL COMMENT '三个月支出的金额',
  `user_id` int(11) NOT NULL COMMENT '信息的所有者id',
  UNIQUE KEY `out_3m_id` (`out_3m_id`),
  KEY `FK_USER_3` (`user_id`),
  CONSTRAINT `FK_USER_3` FOREIGN KEY (`user_id`) REFERENCES `user_info` (`user_id`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `card_out_3m_info` */

insert  into `card_out_3m_info`(`out_3m_id`,`out_3m_time`,`out_3m_amount`,`user_id`) values (1,3,1000,1),(2,12,3000,1),(3,5,600,2);

/*Table structure for table `card_out_6m_info` */

DROP TABLE IF EXISTS `card_out_6m_info`;

CREATE TABLE `card_out_6m_info` (
  `out_6m_id` int(10) NOT NULL AUTO_INCREMENT COMMENT '六个月支出信息的id',
  `out_6m_time` int(3) NOT NULL COMMENT '六个月支出的次数',
  `out_6m_amount` int(10) NOT NULL COMMENT '六个月支出的金额',
  `user_id` int(11) NOT NULL COMMENT '信息的所有者id',
  UNIQUE KEY `out_6m_id` (`out_6m_id`),
  KEY `FK_USER_6` (`user_id`),
  CONSTRAINT `FK_USER_6` FOREIGN KEY (`user_id`) REFERENCES `user_info` (`user_id`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `card_out_6m_info` */

insert  into `card_out_6m_info`(`out_6m_id`,`out_6m_time`,`out_6m_amount`,`user_id`) values (1,4,300,1),(2,16,600,1),(3,1,20000,2);

/*Table structure for table `contact_info` */

DROP TABLE IF EXISTS `contact_info`;

CREATE TABLE `contact_info` (
  `contact_id` int(10) NOT NULL AUTO_INCREMENT COMMENT '通讯条目的id',
  `contact_number` varchar(11) NOT NULL COMMENT '通讯号码',
  `contact_status` tinyint(1) NOT NULL DEFAULT '0' COMMENT '0为打进，1为打出',
  `contact_time` varchar(10) NOT NULL COMMENT '通讯时长',
  `contact_name` varchar(20) DEFAULT NULL COMMENT '联系人在通讯录的备注',
  `user_id` int(11) NOT NULL COMMENT '通讯记录的所有者id',
  PRIMARY KEY (`contact_id`),
  KEY `FK_USER_CONTACT` (`user_id`),
  CONSTRAINT `FK_USER_CONTACT` FOREIGN KEY (`user_id`) REFERENCES `user_info` (`user_id`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

/*Data for the table `contact_info` */

insert  into `contact_info`(`contact_id`,`contact_number`,`contact_status`,`contact_time`,`contact_name`,`user_id`) values (1,'13229437555',0,'21:11:02','林立',1),(2,'18988543669',1,'01:02:01','余力',1),(3,'13749966688',0,'01:50:11','肥力',2),(4,'123123123',1,'13:13:13','nicole',2),(5,'8989898989',0,'13:21:13','linda',2);

/*Table structure for table `creditcard_info` */

DROP TABLE IF EXISTS `creditcard_info`;

CREATE TABLE `creditcard_info` (
  `creditcard_id` int(10) NOT NULL AUTO_INCREMENT COMMENT '信用卡的id',
  `creditcard_number` varchar(19) NOT NULL COMMENT '信用卡帐号',
  `creditcard_pro` varchar(10) NOT NULL COMMENT '信用卡供应商',
  `creditcard_status` varchar(2) NOT NULL COMMENT '信用卡状态',
  `user_id` int(11) NOT NULL COMMENT '信用卡持有者id',
  PRIMARY KEY (`creditcard_id`),
  KEY `FK_USER_CREDIT_CARD` (`user_id`),
  CONSTRAINT `FK_USER_CREDIT_CARD` FOREIGN KEY (`user_id`) REFERENCES `user_info` (`user_id`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `creditcard_info` */

insert  into `creditcard_info`(`creditcard_id`,`creditcard_number`,`creditcard_pro`,`creditcard_status`,`user_id`) values (1,'6217002710000684874','中国建设银行','活期',1),(2,'6217002710000684872','中国建设银行','冻结',2),(3,'2317263192312316827','中国农业银行','活期',1);

/*Table structure for table `drive_info` */

DROP TABLE IF EXISTS `drive_info`;

CREATE TABLE `drive_info` (
  `drive_id` int(10) NOT NULL AUTO_INCREMENT COMMENT '驾驶证的id',
  `drive_card` varchar(18) NOT NULL COMMENT '驾驶证号码',
  `drive_status` varchar(2) DEFAULT NULL COMMENT '驾驶证状态',
  `drive_quasi_type` varchar(2) DEFAULT NULL COMMENT '准驾车型',
  `drive_year` int(2) DEFAULT NULL COMMENT '驾龄',
  `user_id` int(11) NOT NULL COMMENT '驾照所有者id',
  UNIQUE KEY `drive_id` (`drive_id`),
  KEY `FK_USER_DRIVE` (`user_id`),
  CONSTRAINT `FK_USER_DRIVE` FOREIGN KEY (`user_id`) REFERENCES `user_info` (`user_id`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

/*Data for the table `drive_info` */

insert  into `drive_info`(`drive_id`,`drive_card`,`drive_status`,`drive_quasi_type`,`drive_year`,`user_id`) values (1,'123144546475735345',NULL,NULL,NULL,1),(2,'330323196711057316','活期','大巴',10,2),(3,'111111111111111111','','',3,1),(4,'330323126711057316','冻结','轿车',2,4),(5,'213123718786482324','','',1,2);

/*Table structure for table `education_info` */

DROP TABLE IF EXISTS `education_info`;

CREATE TABLE `education_info` (
  `edu_id` int(10) NOT NULL AUTO_INCREMENT COMMENT '学历标识id',
  `edu_school` varchar(14) NOT NULL COMMENT '毕业院校',
  `edu_location` varchar(30) NOT NULL COMMENT '院校所在地',
  `edu_gra_time` varchar(20) NOT NULL COMMENT '毕业时间',
  `edu_pro` varchar(8) NOT NULL COMMENT '专业名称',
  `edu_conclusion` varchar(10) DEFAULT NULL COMMENT '毕结业结论',
  `user_id` int(11) NOT NULL COMMENT '学历所有者id',
  UNIQUE KEY `edu_id` (`edu_id`),
  KEY `FK_USER_EDUCATION` (`user_id`),
  CONSTRAINT `FK_USER_EDUCATION` FOREIGN KEY (`user_id`) REFERENCES `user_info` (`user_id`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

/*Data for the table `education_info` */

insert  into `education_info`(`edu_id`,`edu_school`,`edu_location`,`edu_gra_time`,`edu_pro`,`edu_conclusion`,`user_id`) values (1,'广东金融学院','广州','2018-05-30','计算机科学与技术',NULL,1),(2,'广东金融学院','广州','2019-05-16','会计',NULL,2),(3,'华南师范','...','2021-12-12','1231','',1),(4,'华南理工','...','2020-12-1','1212','',1);

/*Table structure for table `emercontact_fm_info` */

DROP TABLE IF EXISTS `emercontact_fm_info`;

CREATE TABLE `emercontact_fm_info` (
  `emercontact_fm_id` int(10) NOT NULL AUTO_INCREMENT COMMENT '直系亲属紧急联系人的id',
  `emercontact_fm_name` varchar(10) NOT NULL COMMENT '直系亲属紧急联系人的名字',
  `emercontact_fm_number` varchar(11) NOT NULL COMMENT '直系亲属紧急联系人的手机号码',
  `user_id` int(11) NOT NULL COMMENT '直系亲属紧急联系人的所有者id',
  UNIQUE KEY `emer_contact_fm_id` (`emercontact_fm_id`),
  KEY `FK_USER_EMER_FM` (`user_id`),
  CONSTRAINT `FK_USER_EMER_FM` FOREIGN KEY (`user_id`) REFERENCES `user_info` (`user_id`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

/*Data for the table `emercontact_fm_info` */

insert  into `emercontact_fm_info`(`emercontact_fm_id`,`emercontact_fm_name`,`emercontact_fm_number`,`user_id`) values (1,'白莲花','13229467889',1),(2,'白素贞','18975859945',1),(3,'白雪','13459566998',1),(4,'绿油油','13167673282',2),(5,'黄迪迪','13422441421',2);

/*Table structure for table `emercontact_wm_info` */

DROP TABLE IF EXISTS `emercontact_wm_info`;

CREATE TABLE `emercontact_wm_info` (
  `emercontact_wm_id` int(10) NOT NULL AUTO_INCREMENT COMMENT '工作证明紧急联系人的id',
  `emercontact_wm_name` varchar(10) NOT NULL COMMENT '工作证明紧急联系人的名字',
  `emercontact_wm_number` varchar(11) NOT NULL COMMENT '工作证明紧急联系人的手机号码',
  `user_id` int(11) NOT NULL COMMENT '工作证明紧急联系人的所有者id',
  UNIQUE KEY `emer_contact_wm_id` (`emercontact_wm_id`),
  KEY `FK_USER_EMER_WM` (`user_id`),
  CONSTRAINT `FK_USER_EMER_WM` FOREIGN KEY (`user_id`) REFERENCES `user_info` (`user_id`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

/*Data for the table `emercontact_wm_info` */

insert  into `emercontact_wm_info`(`emercontact_wm_id`,`emercontact_wm_name`,`emercontact_wm_number`,`user_id`) values (1,'熊大','13229478544',1),(2,'蒙塔奇','13025885244',2),(3,'索隆','13258758985',2),(4,'绿油油','13167673282',2);

/*Table structure for table `fund_info` */

DROP TABLE IF EXISTS `fund_info`;

CREATE TABLE `fund_info` (
  `fund_id` int(10) NOT NULL AUTO_INCREMENT COMMENT '公积金表的id',
  `fund_account` varchar(12) NOT NULL COMMENT '公积金的账号',
  `fund_deposit_base` double NOT NULL COMMENT '缴存基数',
  `fund_payment_unit_cur` varchar(15) DEFAULT NULL COMMENT '当前缴纳单位',
  `fund_payment_month` int(10) DEFAULT NULL COMMENT '月缴额',
  `fund_city` varchar(10) DEFAULT NULL COMMENT '公积金城市',
  `fund_balance` double unsigned zerofill NOT NULL COMMENT '公积金余额',
  `fund_last_entry_time` varchar(16) DEFAULT NULL COMMENT '最后入账时间',
  `fund_idcard` varchar(18) DEFAULT NULL COMMENT '公积金身份证号校验',
  `fund_num_cons_month` int(3) DEFAULT NULL COMMENT '连续缴纳月数',
  `user_id` int(10) NOT NULL COMMENT '公积金缴纳所有者id',
  PRIMARY KEY (`fund_id`),
  UNIQUE KEY `fund_id` (`fund_id`),
  KEY `FK_USER_FUND` (`user_id`),
  CONSTRAINT `FK_USER_FUND` FOREIGN KEY (`user_id`) REFERENCES `user_info` (`user_id`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

/*Data for the table `fund_info` */

insert  into `fund_info`(`fund_id`,`fund_account`,`fund_deposit_base`,`fund_payment_unit_cur`,`fund_payment_month`,`fund_city`,`fund_balance`,`fund_last_entry_time`,`fund_idcard`,`fund_num_cons_month`,`user_id`) values (1,'0000000001',5000,NULL,NULL,'广州',0000000000000000010000,'2018-05-12',NULL,NULL,1),(2,'0000000002',3000,NULL,NULL,'上海',0000000000000000006000,'2018-05-20',NULL,12,1),(3,'0000000003',8000,NULL,NULL,'深圳',0000000000000000020000,'2018-05-18',NULL,20,1),(4,'0000000004',6500,NULL,NULL,'北京',0000000000000000008000,'2018-05-18',NULL,NULL,2);

/*Table structure for table `house_info` */

DROP TABLE IF EXISTS `house_info`;

CREATE TABLE `house_info` (
  `house_id` int(10) NOT NULL AUTO_INCREMENT COMMENT '房产的id',
  `house_address` varchar(20) NOT NULL COMMENT '房产的地址',
  `house_value` int(16) NOT NULL COMMENT '房产的估值',
  `house_payall_if` tinyint(1) NOT NULL COMMENT '房产已付全款，0为否1为是',
  `user_id` int(11) DEFAULT NULL COMMENT '房产所有者',
  UNIQUE KEY `house_id` (`house_id`),
  KEY `FK_house_user` (`user_id`),
  CONSTRAINT `FK_house_user` FOREIGN KEY (`user_id`) REFERENCES `user_info` (`user_id`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

/*Data for the table `house_info` */

insert  into `house_info`(`house_id`,`house_address`,`house_value`,`house_payall_if`,`user_id`) values (1,'银府公寓',250000,1,1),(2,'麓山别墅',1000000,1,1),(4,'珊瑚海边别墅',5000000,0,2),(5,'广东金融学院19栋',1000000,0,2),(6,'广东金融学院19栋',1000000,0,1),(12,'广东金融学院9栋',29999,1,2),(13,'光明大厦',88888888,1,5);

/*Table structure for table `invest_info` */

DROP TABLE IF EXISTS `invest_info`;

CREATE TABLE `invest_info` (
  `invest_id` int(10) NOT NULL AUTO_INCREMENT COMMENT '投资的id',
  `invest_itemName` varchar(20) NOT NULL COMMENT '投资的项目名',
  `invest_amount` int(16) NOT NULL COMMENT '投资的钱数',
  `user_id` int(11) NOT NULL COMMENT '投资者的id',
  UNIQUE KEY `invest_id` (`invest_id`),
  KEY `FK_USER_INVEST` (`user_id`),
  CONSTRAINT `FK_USER_INVEST` FOREIGN KEY (`user_id`) REFERENCES `user_info` (`user_id`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `invest_info` */

insert  into `invest_info`(`invest_id`,`invest_itemName`,`invest_amount`,`user_id`) values (1,'信贷',100000000,1),(2,'互联网金融',2147483647,1),(3,'新媒体',20000000,2);

/*Table structure for table `job_info` */

DROP TABLE IF EXISTS `job_info`;

CREATE TABLE `job_info` (
  `job_id` int(10) NOT NULL AUTO_INCREMENT COMMENT '工作岗位id',
  `job_title` varchar(20) NOT NULL COMMENT '工作岗位的名称',
  `job_begin` varchar(16) NOT NULL COMMENT '就职开始时间',
  `job_end` varchar(16) DEFAULT NULL COMMENT '离职时间',
  `job_workunit` varchar(15) NOT NULL COMMENT '工作的公司名称',
  `user_id` int(11) NOT NULL COMMENT '工作者的id',
  UNIQUE KEY `job_id` (`job_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `job_info` */

insert  into `job_info`(`job_id`,`job_title`,`job_begin`,`job_end`,`job_workunit`,`user_id`) values (1,'总经理','2018-05-20',NULL,'亮晶晶',1),(2,'行政总监','2018-04-20','2018-05-21','绿油油',2),(3,'设计总监','2018-05-20',NULL,'红灿灿',4);

/*Table structure for table `loan_info` */

DROP TABLE IF EXISTS `loan_info`;

CREATE TABLE `loan_info` (
  `loan_id` int(10) NOT NULL AUTO_INCREMENT COMMENT '贷款项目的id',
  `loaner_type` varchar(8) NOT NULL COMMENT '贷款人属性',
  `loan_instruction` varchar(15) NOT NULL COMMENT '贷款机构',
  `loan_amount` int(16) NOT NULL COMMENT '贷款金额',
  `loan_type` varchar(10) NOT NULL COMMENT '贷款类型',
  `loan_result` varchar(3) NOT NULL COMMENT '申请结果',
  `loan_pub` int(16) NOT NULL COMMENT '贷款发放金额',
  `loan_pub_date` varchar(16) NOT NULL COMMENT '贷款发放日期',
  `loan_end_date` varchar(16) NOT NULL COMMENT '贷款到期日期',
  `loan_balance` int(16) NOT NULL COMMENT '贷款余额',
  `loan_repay_month` int(15) NOT NULL COMMENT '月还款',
  `loan_account_status` varchar(3) NOT NULL COMMENT '账户状态',
  `loan_guar_method` varchar(4) NOT NULL COMMENT '担保方式',
  `loan_cur_overdue_peri` int(2) NOT NULL COMMENT '当前逾期期数',
  `loan_cur_overdue_amo` int(16) NOT NULL COMMENT '当前逾期金额',
  `loan_sum_overdue_amo` int(16) NOT NULL COMMENT '累计逾期金额',
  `loan_repay_status_24` varchar(3) NOT NULL COMMENT '24个月还款状态',
  `loan_cur_overdue_12_time` int(2) NOT NULL COMMENT '近12期逾期次数',
  `user_id` int(11) NOT NULL COMMENT '贷款所有者id',
  UNIQUE KEY `loan_id` (`loan_id`),
  KEY `FK_USER_LOAN` (`user_id`),
  CONSTRAINT `FK_USER_LOAN` FOREIGN KEY (`user_id`) REFERENCES `user_info` (`user_id`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `loan_info` */

insert  into `loan_info`(`loan_id`,`loaner_type`,`loan_instruction`,`loan_amount`,`loan_type`,`loan_result`,`loan_pub`,`loan_pub_date`,`loan_end_date`,`loan_balance`,`loan_repay_month`,`loan_account_status`,`loan_guar_method`,`loan_cur_overdue_peri`,`loan_cur_overdue_amo`,`loan_sum_overdue_amo`,`loan_repay_status_24`,`loan_cur_overdue_12_time`,`user_id`) values (1,'个体','花呗',3000,'短期贷款','成功',3000,'2018-05-20','2018-06-20',2800,3000,'正常','个人信用',0,0,0,'0',0,2),(2,'公司','宜人贷',50000,'自营贷款','成功',50000,'2018-05-26','2018-09-26',50000,10000,'正常','房产',0,0,0,'0',0,1);

/*Table structure for table `paper_info` */

DROP TABLE IF EXISTS `paper_info`;

CREATE TABLE `paper_info` (
  `paper_id` int(10) NOT NULL AUTO_INCREMENT COMMENT '论文的id',
  `paper_num` varchar(15) NOT NULL COMMENT '论文检索号',
  `paper_title` varchar(20) NOT NULL COMMENT '论文的标题',
  `paper_detail` varchar(100) NOT NULL COMMENT '论文的详情',
  `user_id` int(11) NOT NULL COMMENT '论文所有者',
  PRIMARY KEY (`paper_id`),
  UNIQUE KEY `paper_id` (`paper_id`),
  KEY `FK_PAPER` (`user_id`),
  CONSTRAINT `FK_PAPER` FOREIGN KEY (`user_id`) REFERENCES `user_info` (`user_id`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

/*Data for the table `paper_info` */

insert  into `paper_info`(`paper_id`,`paper_num`,`paper_title`,`paper_detail`,`user_id`) values (1,'000000000000001','《深入研究机器学习原理》','1111',1),(2,'000000000000002','《》','11',1),(3,'000000000000003','《》','22',2),(4,'0000004','《比特币是最棒的！》','blinlinlin',2),(6,'000000005','《人民币的安全性》','blablabla',4);

/*Table structure for table `patent_info` */

DROP TABLE IF EXISTS `patent_info`;

CREATE TABLE `patent_info` (
  `patent_id` int(10) NOT NULL AUTO_INCREMENT COMMENT '专利的id',
  `patent_num` char(14) NOT NULL COMMENT '专利号',
  `patent_title` varchar(10) NOT NULL COMMENT '专利的名称',
  `patent_detail` varchar(10) NOT NULL COMMENT '专利的详情',
  `user_id` int(11) NOT NULL COMMENT '专利所有者id',
  UNIQUE KEY `patent_id` (`patent_id`),
  KEY `FK_USER_PATENT` (`user_id`),
  CONSTRAINT `FK_USER_PATENT` FOREIGN KEY (`user_id`) REFERENCES `user_info` (`user_id`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `patent_info` */

insert  into `patent_info`(`patent_id`,`patent_num`,`patent_title`,`patent_detail`,`user_id`) values (1,'a0000000000001','《光清洁热水器》','11',1),(2,'a010000000001','《》','1111',1),(3,'b0000000000002','《》','22',2);

/*Table structure for table `quali_info` */

DROP TABLE IF EXISTS `quali_info`;

CREATE TABLE `quali_info` (
  `quali_id` int(10) NOT NULL AUTO_INCREMENT COMMENT '职业资格证书的id',
  `quali_num` varchar(16) NOT NULL COMMENT '职业资格证书编号',
  `quali_name` varchar(16) NOT NULL COMMENT '职业资格证书名称',
  `quali_date` varchar(16) NOT NULL COMMENT '颁发职业资格证书的日期',
  `quali_insti` varchar(8) NOT NULL COMMENT '颁发职业资格证书的机构',
  `user_id` int(11) NOT NULL COMMENT '职业资格证书所有者id',
  PRIMARY KEY (`quali_id`),
  UNIQUE KEY `quali_id` (`quali_id`),
  KEY `FK_USER_QUALI` (`user_id`),
  CONSTRAINT `FK_USER_QUALI` FOREIGN KEY (`user_id`) REFERENCES `user_info` (`user_id`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

/*Data for the table `quali_info` */

insert  into `quali_info`(`quali_id`,`quali_num`,`quali_name`,`quali_date`,`quali_insti`,`user_id`) values (1,'0000000000000001','证券从','2018-05-20','金金学院',1),(2,'0000000000000002','银行从业资格证书','2018-05-11','亮金金公司',1),(3,'0000000000000003','会计从业资格证','2018-05-01','爪哇公司',2),(4,'0000000000004','高级软件工程师资格证','2020-1-1','爪哇协会',2);

/*Table structure for table `risk_invest_user_info` */

DROP TABLE IF EXISTS `risk_invest_user_info`;

CREATE TABLE `risk_invest_user_info` (
  `risk_inv_id` int(10) NOT NULL AUTO_INCREMENT COMMENT '风险排查的id',
  `user_id` int(11) NOT NULL COMMENT '用户的id',
  `live_iden_if` tinyint(1) NOT NULL DEFAULT '0' COMMENT '活体身份验证',
  `cont_loan_match_if` tinyint(1) NOT NULL DEFAULT '0' COMMENT '通讯录匹配贷款联系人、贷款公司',
  `sms_highrisk_if` tinyint(1) NOT NULL DEFAULT '0' COMMENT '短信命中高风险关键字',
  `equ_risk_if` tinyint(1) NOT NULL DEFAULT '0' COMMENT '设备风险识别，0代表无，1代表代理，2代表作弊',
  `phone_num_if` tinyint(1) NOT NULL DEFAULT '0' COMMENT '手机号风险识别，0代表无，1代表虚假、2代表小号、3代表诈骗骚扰',
  `many_wifi_if` int(4) NOT NULL COMMENT '多人同WIFI申请',
  `many_gps_if` int(7) NOT NULL COMMENT '多人同GPS申请（24小时内多人同GPS申请）',
  `gps_addr_mat_if` tinyint(1) NOT NULL COMMENT 'GPS与居住（家庭/当前）地址匹配',
  `pho_addr_mat_if` tinyint(1) NOT NULL COMMENT '手机归属地与居住地址匹配',
  `work_addr_mat_if` tinyint(1) NOT NULL COMMENT '工作地（市）与居住地址（市）匹配',
  `card_outtime_if` int(2) NOT NULL COMMENT '信用卡逾期（近一年）,0为无，其他数字表示逾期次数',
  UNIQUE KEY `risk_inv_id` (`risk_inv_id`),
  KEY `FK_USER_RISK` (`user_id`),
  CONSTRAINT `FK_USER_RISK` FOREIGN KEY (`user_id`) REFERENCES `user_info` (`user_id`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `risk_invest_user_info` */

insert  into `risk_invest_user_info`(`risk_inv_id`,`user_id`,`live_iden_if`,`cont_loan_match_if`,`sms_highrisk_if`,`equ_risk_if`,`phone_num_if`,`many_wifi_if`,`many_gps_if`,`gps_addr_mat_if`,`pho_addr_mat_if`,`work_addr_mat_if`,`card_outtime_if`) values (1,1,1,1,2,0,0,5,10,1,1,1,0),(2,2,1,1,2,0,0,6,20,1,1,1,0),(3,2,1,2,2,0,0,7,15,1,1,1,0);

/*Table structure for table `security_info` */

DROP TABLE IF EXISTS `security_info`;

CREATE TABLE `security_info` (
  `secu_id` int(10) NOT NULL AUTO_INCREMENT COMMENT '社保的id',
  `secu_if` tinyint(1) NOT NULL DEFAULT '0' COMMENT '是否有社保',
  `secu_name` varchar(8) DEFAULT NULL COMMENT '社保名',
  `secu_pay_base` int(10) DEFAULT NULL COMMENT '最近一次缴纳基数',
  `secu_pay_unit` varchar(6) DEFAULT NULL COMMENT '缴纳单位名称',
  `secu_parti_status` varchar(3) DEFAULT NULL COMMENT '参保状态',
  `secu_city` varchar(2) DEFAULT NULL COMMENT '社保所在城市',
  `secu_paid_cons_month` int(2) DEFAULT NULL COMMENT '最近连续缴纳月数',
  `secu_idcard` varchar(18) DEFAULT NULL COMMENT '社保身份证',
  `secu_pay_recent` varchar(16) DEFAULT NULL COMMENT '社保最近一次缴费时间',
  `user_id` int(11) NOT NULL COMMENT '参保人id',
  PRIMARY KEY (`secu_id`),
  KEY `FK_USER_SECURITY` (`user_id`),
  CONSTRAINT `FK_USER_SECURITY` FOREIGN KEY (`user_id`) REFERENCES `user_info` (`user_id`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `security_info` */

insert  into `security_info`(`secu_id`,`secu_if`,`secu_name`,`secu_pay_base`,`secu_pay_unit`,`secu_parti_status`,`secu_city`,`secu_paid_cons_month`,`secu_idcard`,`secu_pay_recent`,`user_id`) values (1,0,'林林',2000,'aaa','缴纳','广州',12,'4444000000000001','2018-05-19',1),(2,0,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,2),(3,0,'蔡蔡',1000,'aaa',NULL,'上海',12,NULL,'2018-05-04',4);

/*Table structure for table `user_airline` */

DROP TABLE IF EXISTS `user_airline`;

CREATE TABLE `user_airline` (
  `user_airline_id` int(10) NOT NULL AUTO_INCREMENT COMMENT '用户与航空信息的关系id',
  `user_id` int(10) NOT NULL COMMENT '用户的id',
  `airline_id` int(10) NOT NULL COMMENT '航空信息的id',
  PRIMARY KEY (`user_airline_id`),
  KEY `user_FK28` (`user_id`),
  KEY `airline_FK1` (`airline_id`),
  CONSTRAINT `airline_FK1` FOREIGN KEY (`airline_id`) REFERENCES `airline_info` (`airline_id`) ON DELETE CASCADE,
  CONSTRAINT `user_FK28` FOREIGN KEY (`user_id`) REFERENCES `user_info` (`user_id`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

/*Data for the table `user_airline` */

insert  into `user_airline`(`user_airline_id`,`user_id`,`airline_id`) values (1,2,2),(2,1,1),(4,1,2),(5,1,4),(6,2,4);

/*Table structure for table `user_info` */

DROP TABLE IF EXISTS `user_info`;

CREATE TABLE `user_info` (
  `user_id` int(10) NOT NULL AUTO_INCREMENT COMMENT '数据的序号',
  `username` varchar(20) NOT NULL COMMENT '用户名是用户的手机号',
  `password` varchar(20) NOT NULL COMMENT '密码',
  `member` char(1) DEFAULT '0' COMMENT '0为非会员，1为会员',
  `realname` varchar(10) DEFAULT NULL COMMENT '真实姓名',
  `gender` char(1) DEFAULT '0' COMMENT '0为男，1为女',
  `idcard` varchar(18) DEFAULT NULL COMMENT '身份证号，可用于获取出生日期和年龄',
  `phone_number` varchar(11) DEFAULT NULL COMMENT '手机号码',
  `address_original` varchar(20) DEFAULT NULL COMMENT '籍贯',
  `address_living_1` varchar(20) DEFAULT NULL COMMENT '居住地址1',
  `address_living_2` varchar(20) DEFAULT NULL COMMENT '居住地址2',
  `createtime` datetime DEFAULT NULL COMMENT '注册的时间',
  `photo` varchar(500) DEFAULT NULL COMMENT '图片上传',
  PRIMARY KEY (`user_id`),
  UNIQUE KEY `id` (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

/*Data for the table `user_info` */

insert  into `user_info`(`user_id`,`username`,`password`,`member`,`realname`,`gender`,`idcard`,`phone_number`,`address_original`,`address_living_1`,`address_living_2`,`createtime`,`photo`) values (1,'abc123','123123','1','林立1','0','115281199812293746','4008208820','广东','广东金融学院北苑',NULL,NULL,NULL),(2,'abc456','123123','0','林立2','0','115281199812293741','4008208820','福建','广东金融学院北操',NULL,NULL,NULL),(4,'abc173','123123','0','linda','0','445281188913312568','13226547774','江西','广东金融学院北苑',NULL,NULL,NULL),(5,'abcccc','123456','0',NULL,'0',NULL,NULL,NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `user_workunit_legal` */

DROP TABLE IF EXISTS `user_workunit_legal`;

CREATE TABLE `user_workunit_legal` (
  `legal_person_id` int(10) NOT NULL AUTO_INCREMENT COMMENT '担任法人的id',
  `user_id` int(10) NOT NULL COMMENT '用户的id',
  `workunit_id` int(10) NOT NULL COMMENT '被担任的企业的id',
  UNIQUE KEY `legal_person_id` (`legal_person_id`),
  KEY `workunit_FK4` (`workunit_id`),
  KEY `user_FK10` (`user_id`),
  CONSTRAINT `FK_USER_WORKUNIT_LEGAL` FOREIGN KEY (`user_id`) REFERENCES `user_info` (`user_id`) ON DELETE CASCADE,
  CONSTRAINT `FK_USER_WORKUNIT_LEGAL_W` FOREIGN KEY (`workunit_id`) REFERENCES `workunit_info` (`workunit_id`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `user_workunit_legal` */

insert  into `user_workunit_legal`(`legal_person_id`,`user_id`,`workunit_id`) values (1,2,3),(2,2,3),(3,1,1);

/*Table structure for table `workout_info` */

DROP TABLE IF EXISTS `workout_info`;

CREATE TABLE `workout_info` (
  `workout_id` int(10) NOT NULL AUTO_INCREMENT COMMENT '在外任职id',
  `workout_signin` varchar(20) NOT NULL COMMENT '注册工商号',
  `workout_type` varchar(10) NOT NULL COMMENT '企业类型',
  `workout_capital` varchar(20) NOT NULL COMMENT '注册资本',
  `workout_job` varchar(10) NOT NULL COMMENT '担任职务',
  `user_id` int(11) NOT NULL COMMENT '在外任职者的id',
  PRIMARY KEY (`workout_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `workout_info` */

insert  into `workout_info`(`workout_id`,`workout_signin`,`workout_type`,`workout_capital`,`workout_job`,`user_id`) values (1,'100000000004082','民营企业','100000000000','董事长',1);

/*Table structure for table `workunit_info` */

DROP TABLE IF EXISTS `workunit_info`;

CREATE TABLE `workunit_info` (
  `workunit_id` int(10) NOT NULL AUTO_INCREMENT COMMENT '唯一标识的公司id',
  `workunit_name` varchar(30) NOT NULL COMMENT '公司名称',
  `workunit_type` varchar(10) NOT NULL COMMENT '企业类型',
  `workunit_reg_number` varchar(15) NOT NULL COMMENT '工商注册号',
  `workunit_reg_capital` int(20) NOT NULL COMMENT '注册资本',
  `workunit_phone_num1` varchar(20) NOT NULL COMMENT '公司的电话号码1',
  `workunit_phone_num2` varchar(20) DEFAULT NULL COMMENT '公司的电话号码2',
  KEY `NewIndex1` (`workunit_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

/*Data for the table `workunit_info` */

insert  into `workunit_info`(`workunit_id`,`workunit_name`,`workunit_type`,`workunit_reg_number`,`workunit_reg_capital`,`workunit_phone_num1`,`workunit_phone_num2`) values (1,'爪哇公司','股份有限','000000000000001',100000,'13200000000',NULL),(2,'广金互联网公司','国企','000000000000002',200000,'13300000000',NULL),(3,'亮金金公司','股份有限','000000000000003',10000000,'13400000000',NULL),(4,'倪迪达企业','民营','23483034678903',0,'4008208820','');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
