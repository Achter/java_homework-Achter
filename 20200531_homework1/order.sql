/*
Navicat MySQL Data Transfer

Source Server         : Achter
Source Server Version : 50515
Source Host           : localhost:3306
Source Database       : shop

Target Server Type    : MYSQL
Target Server Version : 50515
File Encoding         : 65001

Date: 2020-05-31 20:52:42
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `order`
-- ----------------------------
DROP TABLE IF EXISTS `order`;
CREATE TABLE `order` (
  `orderNum` int(32) NOT NULL AUTO_INCREMENT COMMENT '订单编号',
  `orderTime` date DEFAULT NULL COMMENT '下单时间',
  `commodityId` int(32) NOT NULL COMMENT '订单商品编号',
  `userId` int(18) NOT NULL COMMENT '订单用户编号',
  PRIMARY KEY (`orderNum`),
  KEY `userId` (`userId`),
  KEY `commodityId` (`commodityId`),
  CONSTRAINT `order_ibfk_2` FOREIGN KEY (`commodityId`) REFERENCES `commodity` (`commodityId`),
  CONSTRAINT `order_ibfk_1` FOREIGN KEY (`userId`) REFERENCES `user` (`userId`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of order
-- ----------------------------
INSERT INTO `order` VALUES ('1', '2020-04-20', '2', '3');
INSERT INTO `order` VALUES ('2', '2020-05-12', '3', '3');
