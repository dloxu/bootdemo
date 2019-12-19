/*
 Navicat Premium Data Transfer

 Source Server         : dloading
 Source Server Type    : MySQL
 Source Server Version : 50519
 Source Host           : localhost:3306
 Source Schema         : springboot

 Target Server Type    : MySQL
 Target Server Version : 50519
 File Encoding         : 65001

 Date: 19/12/2019 08:55:23
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tb_goods
-- ----------------------------
DROP TABLE IF EXISTS `tb_goods`;
CREATE TABLE `tb_goods`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `title` varchar(1000) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '商品标题',
  `price` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '商品价格',
  `image` varchar(1000) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '商品图片',
  `brand` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '商品品牌',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1217543 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of tb_goods
-- ----------------------------
INSERT INTO `tb_goods` VALUES (1057741, '苹果(Apple) iPhone 5s (A1530) 16GB 银色 移动联通4G手机', '4119.00', '/Upload/20191219085003Dloading.jpg', '苹果');
INSERT INTO `tb_goods` VALUES (1057746, '苹果(Apple) iPhone 5s (A1530) 16GB 金色 移动联通4G手机', '4119.00', 'http://img11.360buyimg.com/n1/s450x450_jfs/t3160/284/298314156/78089/fd106c0c/57b00f93Nc77f215f.jpg', '苹果');
INSERT INTO `tb_goods` VALUES (1124089, '华为 Ascend P7 (P7-L00) 黑色 联通4G手机 双卡双待双通', '2388.00', 'http://img12.360buyimg.com/n1/s450x450_jfs/t3034/299/2060854617/119711/577e85cb/57d11b6cN1fd1194d.jpg', '华为');
INSERT INTO `tb_goods` VALUES (1124090, '华为 Ascend P7 (P7-L00) 白色 联通4G手机 双卡双待双通', '2388.00', 'http://img12.360buyimg.com/n1/s450x450_jfs/t3034/299/2060854617/119711/577e85cb/57d11b6cN1fd1194d.jpg', '华为');
INSERT INTO `tb_goods` VALUES (1124331, '华为 Ascend P7 (P7-L05/L07) 黑色 移动4G手机', '2388.00', 'http://img12.360buyimg.com/n1/s450x450_jfs/t3034/299/2060854617/119711/577e85cb/57d11b6cN1fd1194d.jpg', '华为');
INSERT INTO `tb_goods` VALUES (1124332, '华为 Ascend P7 (P7-L05/L07) 白色 移动4G手机', '2388.00', 'http://img12.360buyimg.com/n1/s450x450_jfs/t3034/299/2060854617/119711/577e85cb/57d11b6cN1fd1194d.jpg', '华为');
INSERT INTO `tb_goods` VALUES (1124365, '华为 Ascend P7 (P7-L09) 白 电信4G手机 双卡双待双通', '2388.00', 'http://img12.360buyimg.com/n1/s450x450_jfs/t3034/299/2060854617/119711/577e85cb/57d11b6cN1fd1194d.jpg', '华为');
INSERT INTO `tb_goods` VALUES (1124369, '华为 Ascend P7 (P7-L09) 黑 电信4G手机 双卡双待双通', '2388.00', 'http://img12.360buyimg.com/n1/s450x450_jfs/t3034/299/2060854617/119711/577e85cb/57d11b6cN1fd1194d.jpg', '华为');
INSERT INTO `tb_goods` VALUES (1217493, '苹果（Apple）iPhone 6 (A1589) 16GB 金色 移动4G手机', '5088.00', 'http://img11.360buyimg.com/n1/s450x450_jfs/t3286/138/5179502023/67325/93373553/585b52b7N8d296f80.jpg', '苹果');
INSERT INTO `tb_goods` VALUES (1217494, '苹果（Apple）iPhone 6 (A1589) 16GB 深空灰色 移动4G手机', '4999.00', 'http://img11.360buyimg.com/n1/s450x450_jfs/t3286/138/5179502023/67325/93373553/585b52b7N8d296f80.jpg', '苹果');
INSERT INTO `tb_goods` VALUES (1217499, '苹果（Apple）iPhone 6 (A1586) 16GB 金色 移动联通电信4G手机', '5299', 'http://img11.360buyimg.com/n1/s450x450_jfs/t3286/138/5179502023/67325/93373553/585b52b7N8d296f80.jpg', '苹果');
INSERT INTO `tb_goods` VALUES (1217500, '苹果（Apple）iPhone 6 (A1586) 16GB 深空灰色 移动联通电信4G手机', '5288.00', 'http://img11.360buyimg.com/n1/s450x450_jfs/t3286/138/5179502023/67325/93373553/585b52b7N8d296f80.jpg', '苹果');
INSERT INTO `tb_goods` VALUES (1217501, '苹果（Apple）iPhone 6 (A1586) 16GB 银色 移动联通电信4G手机', '5288.00', 'http://img11.360buyimg.com/n1/s450x450_jfs/t3286/138/5179502023/67325/93373553/585b52b7N8d296f80.jpg', '苹果');
INSERT INTO `tb_goods` VALUES (1217508, '苹果（Apple）iPhone 6 (A1586) 64GB 金色 移动联通电信4G手机', '5988.00', 'http://img11.360buyimg.com/n1/s450x450_jfs/t3286/138/5179502023/67325/93373553/585b52b7N8d296f80.jpg', '苹果');
INSERT INTO `tb_goods` VALUES (1217509, '苹果（Apple）iPhone 6 (A1586) 64GB 深空灰色 移动联通电信4G手机', '5988.00', 'http://img11.360buyimg.com/n1/s450x450_jfs/t3286/138/5179502023/67325/93373553/585b52b7N8d296f80.jpg', '苹果');
INSERT INTO `tb_goods` VALUES (1217510, '苹果（Apple）iPhone 6 (A1586) 64GB 银色 移动联通电信4G手机', '5988.00', 'http://img11.360buyimg.com/n1/s450x450_jfs/t3286/138/5179502023/67325/93373553/585b52b7N8d296f80.jpg', '苹果');
INSERT INTO `tb_goods` VALUES (1217516, '苹果（Apple）iPhone 6 (A1586) 128GB 金色 移动联通电信4G手机', '6488.00', 'http://img11.360buyimg.com/n1/s450x450_jfs/t3286/138/5179502023/67325/93373553/585b52b7N8d296f80.jpg', '苹果');
INSERT INTO `tb_goods` VALUES (1217517, '苹果（Apple）iPhone 6 (A1586) 128GB 深空灰色 移动联通电信4G手机', '6488.00', 'http://img11.360buyimg.com/n1/s450x450_jfs/t3286/138/5179502023/67325/93373553/585b52b7N8d296f80.jpg', '苹果');
INSERT INTO `tb_goods` VALUES (1217518, '苹果（Apple）iPhone 6 (A1586) 128GB 银色 移动联通电信4G手机', '6488.00', 'http://img11.360buyimg.com/n1/s450x450_jfs/t3286/138/5179502023/67325/93373553/585b52b7N8d296f80.jpg', '苹果');
INSERT INTO `tb_goods` VALUES (1217524, '苹果（Apple）iPhone 6 Plus (A1524) 16GB 金色 移动联通电信4G手机', '6088.00', 'http://img11.360buyimg.com/n1/s450x450_jfs/t3286/138/5179502023/67325/93373553/585b52b7N8d296f80.jpg', '苹果');
INSERT INTO `tb_goods` VALUES (1217525, '苹果（Apple）iPhone 6 Plus (A1524) 16GB 深空灰色 移动联通电信4G手机', '5888.00', 'http://img11.360buyimg.com/n1/s450x450_jfs/t3286/138/5179502023/67325/93373553/585b52b7N8d296f80.jpg', '苹果');
INSERT INTO `tb_goods` VALUES (1217526, '苹果（Apple）iPhone 6 Plus (A1524) 16GB 银色 移动联通电信4G手机', '5988.00', 'http://img11.360buyimg.com/n1/s450x450_jfs/t3286/138/5179502023/67325/93373553/585b52b7N8d296f80.jpg', '苹果');
INSERT INTO `tb_goods` VALUES (1217533, '苹果（Apple）iPhone 6 Plus (A1524) 64GB 深空灰色 移动联通电信4G手机', '6788.00', 'http://img11.360buyimg.com/n1/s450x450_jfs/t3286/138/5179502023/67325/93373553/585b52b7N8d296f80.jpg', '苹果');
INSERT INTO `tb_goods` VALUES (1217534, '苹果（Apple）iPhone 6 Plus (A1524) 64GB 银色 移动联通电信4G手机', '6788.00', 'http://img11.360buyimg.com/n1/s450x450_jfs/t3286/138/5179502023/67325/93373553/585b52b7N8d296f80.jpg', '苹果');
INSERT INTO `tb_goods` VALUES (1217539, '苹果（Apple）iPhone 6 Plus (A1524) 128GB 金色 移动联通电信4G手机', '7388.00', 'http://img11.360buyimg.com/n1/s450x450_jfs/t3286/138/5179502023/67325/93373553/585b52b7N8d296f80.jpg', '苹果');
INSERT INTO `tb_goods` VALUES (1217540, '苹果（Apple）iPhone 6 Plus (A1524) 128GB 深空灰色 移动联通电信4G手机', '7388.00', 'http://img11.360buyimg.com/n1/s450x450_jfs/t3286/138/5179502023/67325/93373553/585b52b7N8d296f80.jpg', '苹果6');
INSERT INTO `tb_goods` VALUES (1217541, '红米K30 6+64 4G手机', '1699', '/upload/201912181916034610b912c8fcc3cef70d70409845d688d53f20f7.jpg', '红米');
INSERT INTO `tb_goods` VALUES (1217542, '一加7t plus 12+256', '4599', '/Upload/20191219082804Dloading.jpg', '一加');

-- ----------------------------
-- Table structure for tb_user
-- ----------------------------
DROP TABLE IF EXISTS `tb_user`;
CREATE TABLE `tb_user`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `username` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '用户名',
  `password` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '密码',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of tb_user
-- ----------------------------
INSERT INTO `tb_user` VALUES (1, 'dloading', '123');
INSERT INTO `tb_user` VALUES (2, '涂陌', '123');

SET FOREIGN_KEY_CHECKS = 1;
