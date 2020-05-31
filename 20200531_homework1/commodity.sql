/*
Navicat MySQL Data Transfer

Source Server         : Achter
Source Server Version : 50515
Source Host           : localhost:3306
Source Database       : shop

Target Server Type    : MYSQL
Target Server Version : 50515
File Encoding         : 65001

Date: 2020-05-31 20:52:34
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `commodity`
-- ----------------------------
DROP TABLE IF EXISTS `commodity`;
CREATE TABLE `commodity` (
  `commodityId` int(11) NOT NULL AUTO_INCREMENT COMMENT '商品编号',
  `commodityName` varchar(100) NOT NULL COMMENT '商品名称',
  `commodityOrigin` varchar(100) DEFAULT NULL COMMENT '商品产地',
  `manufacturerId` int(11) DEFAULT NULL COMMENT '制造商',
  `productionTime` date NOT NULL COMMENT '生产时间',
  PRIMARY KEY (`commodityId`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of commodity
-- ----------------------------
INSERT INTO `commodity` VALUES ('1', '口香糖', '浙江', '9', '2018-09-11');
INSERT INTO `commodity` VALUES ('2', '苏打水', '安徽', '8', '2020-05-20');
INSERT INTO `commodity` VALUES ('3', '台灯', '北京', '7', '2020-04-29');
INSERT INTO `commodity` VALUES ('4', '电动牙刷', '西安', '6', '2020-05-05');
