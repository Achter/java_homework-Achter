/*
Navicat MySQL Data Transfer

Source Server         : Achter
Source Server Version : 50515
Source Host           : localhost:3306
Source Database       : shop

Target Server Type    : MYSQL
Target Server Version : 50515
File Encoding         : 65001

Date: 2020-05-31 20:52:55
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `userId` int(18) NOT NULL AUTO_INCREMENT COMMENT '用户编号',
  `userName` varchar(30) DEFAULT NULL COMMENT '用户姓名',
  `userAddress` varchar(100) DEFAULT NULL COMMENT '用户地址',
  `phone` int(11) DEFAULT NULL COMMENT '用户联系方式',
  `typeNum` int(11) DEFAULT NULL COMMENT '用户类型',
  PRIMARY KEY (`userId`),
  KEY `typeNum` (`typeNum`),
  CONSTRAINT `user_ibfk_1` FOREIGN KEY (`typeNum`) REFERENCES `usertype` (`typeNum`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'aaaa', 'sf jajbfbsha', '12334455', '1');
INSERT INTO `user` VALUES ('2', 'bbbb', 'fsdgdsgdsgd', '12336234', '2');
INSERT INTO `user` VALUES ('3', 'ccccc', 'jhkdsjafsdajkg', '456897666', '3');
INSERT INTO `user` VALUES ('4', 'dddd', 'vdbshjdgv', '654593', '3');
INSERT INTO `user` VALUES ('5', 'eeee', 'dgshjgs', '875347', '2');
