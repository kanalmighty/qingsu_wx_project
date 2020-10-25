/*
Navicat MySQL Data Transfer

Source Server         : mytest
Source Server Version : 80021
Source Host           : localhost:3306
Source Database       : eladmin

Target Server Type    : MYSQL
Target Server Version : 80021
File Encoding         : 65001

Date: 2020-10-25 23:32:20
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for qs_banner
-- ----------------------------
DROP TABLE IF EXISTS `qs_banner`;
CREATE TABLE `qs_banner` (
  `banner_id` int DEFAULT NULL,
  `banner_url` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT 'banner地址'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of qs_banner
-- ----------------------------
INSERT INTO `qs_banner` VALUES ('1', 'http://localhost:8200/1.jpg');
INSERT INTO `qs_banner` VALUES ('2', 'http://localhost:8200/2.jpg');
INSERT INTO `qs_banner` VALUES ('3', 'http://localhost:8200/3.jpg');

-- ----------------------------
-- Table structure for qs_picture
-- ----------------------------
DROP TABLE IF EXISTS `qs_picture`;
CREATE TABLE `qs_picture` (
  `pic_id` int DEFAULT NULL COMMENT '图片id',
  `url` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '图片地址'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of qs_picture
-- ----------------------------
INSERT INTO `qs_picture` VALUES ('2', 'http://localhost:8200/2.png');

-- ----------------------------
-- Table structure for qs_recommend
-- ----------------------------
DROP TABLE IF EXISTS `qs_recommend`;
CREATE TABLE `qs_recommend` (
  `recommend_id` int NOT NULL COMMENT '推荐id',
  `pic_id` int DEFAULT NULL COMMENT 'picture id',
  `caption` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '标题',
  `is_enabled` int unsigned DEFAULT NULL COMMENT '是否推荐',
  PRIMARY KEY (`recommend_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of qs_recommend
-- ----------------------------
INSERT INTO `qs_recommend` VALUES ('1', '2', 'test', '1');
