/*
Navicat MySQL Data Transfer

Source Server         : perfree-pc
Source Server Version : 50621
Source Host           : localhost:3306
Source Database       : test1

Target Server Type    : MYSQL
Target Server Version : 50621
File Encoding         : 65001

Date: 2018-10-04 00:24:32
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user1
-- ----------------------------
DROP TABLE IF EXISTS `user1`;
CREATE TABLE `user1` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(50) DEFAULT NULL COMMENT '姓名',
  `age` int(11) DEFAULT NULL COMMENT '年龄',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user1
-- ----------------------------
INSERT INTO `user1` VALUES ('1', '张三', '22');
