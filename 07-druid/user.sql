/*
Navicat MySQL Data Transfer

Source Server         : perfree-pc
Source Server Version : 50621
Source Host           : localhost:3306
Source Database       : springboot

Target Server Type    : MYSQL
Target Server Version : 50621
File Encoding         : 65001

Date: 2018-10-03 10:18:50
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(50) DEFAULT NULL COMMENT '姓名',
  `age` int(11) DEFAULT NULL COMMENT '年龄',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '张三', '21');
INSERT INTO `user` VALUES ('2', '李四', '23');
INSERT INTO `user` VALUES ('3', '王二', '22');
INSERT INTO `user` VALUES ('4', '陈某', '25');
INSERT INTO `user` VALUES ('5', '刘某', '20');
