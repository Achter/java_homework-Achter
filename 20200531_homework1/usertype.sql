/*
Navicat MySQL Data Transfer

Source Server         : Achter
Source Server Version : 50515
Source Host           : localhost:3306
Source Database       : shop

Target Server Type    : MYSQL
Target Server Version : 50515
File Encoding         : 65001

Date: 2020-05-31 20:53:03
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `usertype`
-- ----------------------------
DROP TABLE IF EXISTS `usertype`;
CREATE TABLE `usertype` (
  `typeNum` int(11) NOT NULL AUTO_INCREMENT COMMENT '类型编号',
  `typeName` varchar(255) DEFAULT NULL COMMENT '类型名称',
  PRIMARY KEY (`typeNum`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of usertype
-- ----------------------------
INSERT INTO `usertype` VALUES ('1', '非会员');
INSERT INTO `usertype` VALUES ('2', '普通会员');
INSERT INTO `usertype` VALUES ('3', '超级会员');
