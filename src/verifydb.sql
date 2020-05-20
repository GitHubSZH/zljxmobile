/*
 Navicat Premium Data Transfer

 Source Server         : ZLJX
 Source Server Type    : MySQL
 Source Server Version : 50724
 Source Host           : localhost:3306
 Source Schema         : verifydb

 Target Server Type    : MySQL
 Target Server Version : 50724
 File Encoding         : 65001

 Date: 20/05/2020 16:01:13
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_app_config
-- ----------------------------
DROP TABLE IF EXISTS `t_app_config`;
CREATE TABLE `t_app_config`  (
  `app_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '应用id',
  `app_name` varchar(16) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '应用名称',
  `description` varchar(60) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '应用详情描述',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `create_operation` bigint(20) NULL DEFAULT NULL COMMENT '创建人',
  `last_create_time` datetime(0) NULL DEFAULT NULL COMMENT '最后修改时间',
  `last_update_operation` bigint(20) NULL DEFAULT NULL COMMENT '最后修改人',
  PRIMARY KEY (`app_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '应用表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_operation
-- ----------------------------
DROP TABLE IF EXISTS `t_operation`;
CREATE TABLE `t_operation`  (
  `operation_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `create_time` datetime(0) NULL DEFAULT NULL,
  `update_time` datetime(0) NULL DEFAULT NULL,
  `operation_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`operation_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户表（伪造的方便后边的审核）' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_task
-- ----------------------------
DROP TABLE IF EXISTS `t_task`;
CREATE TABLE `t_task`  (
  `task_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '任务id',
  `aap_id` bigint(20) NULL DEFAULT NULL COMMENT '应用id',
  `title` varchar(60) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '任务标题',
  `context` varchar(60) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '内容',
  `verify_type` tinyint(4) NULL DEFAULT NULL COMMENT '审核状态 ·1.依次审批，2.会签',
  `stauts` tinyint(4) NULL DEFAULT NULL COMMENT '任务状态 1.未审核 2.审核成功 3 驳回',
  `create_time` datetime(0) NULL DEFAULT NULL,
  `create_operation` bigint(20) NULL DEFAULT NULL,
  `last_update_time` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`task_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 20 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '任务表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_verify_flow
-- ----------------------------
DROP TABLE IF EXISTS `t_verify_flow`;
CREATE TABLE `t_verify_flow`  (
  `verify_flow_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '应用审核流id',
  `app_id` bigint(20) NULL DEFAULT NULL COMMENT '应用id',
  `verify_type` tinyint(4) NULL DEFAULT NULL COMMENT '审批模式，1依次审批，2会签，3或签',
  `create_time` datetime(0) NULL DEFAULT NULL,
  `create_operation` bigint(20) NULL DEFAULT NULL,
  `last_update_time` datetime(0) NULL DEFAULT NULL,
  `last_update_operation` bigint(20) NULL DEFAULT NULL,
  PRIMARY KEY (`verify_flow_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '应用审核流' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_verify_flow_ins
-- ----------------------------
DROP TABLE IF EXISTS `t_verify_flow_ins`;
CREATE TABLE `t_verify_flow_ins`  (
  `flow_ins_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '任务审批流id',
  `task_id` bigint(20) NULL DEFAULT NULL COMMENT '任务 id',
  `verify_type` tinyint(4) NULL DEFAULT NULL COMMENT '\'审批模式，1依次审批，2会签，3或签',
  `next_id` bigint(20) NULL DEFAULT NULL COMMENT '任务审核人员节点表id',
  `last_verify_id` bigint(20) NULL DEFAULT NULL,
  `verify_status` tinyint(4) NULL DEFAULT NULL COMMENT '1.待审核  2.审核通过，3.超时驳回，4.拒绝通过',
  `last_verify_time` datetime(0) NULL DEFAULT NULL,
  `refuse_reason` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '驳回原因',
  PRIMARY KEY (`flow_ins_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 18 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '任务审批流' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_verify_node
-- ----------------------------
DROP TABLE IF EXISTS `t_verify_node`;
CREATE TABLE `t_verify_node`  (
  `node_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '应用审核人员节点',
  `operation_id` bigint(20) NULL DEFAULT NULL COMMENT '用户id',
  `flow_id` bigint(20) NULL DEFAULT NULL COMMENT '应用审核流id',
  `flow_order` tinyint(4) NULL DEFAULT NULL COMMENT '审批顺序',
  PRIMARY KEY (`node_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 16 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '应用审核人员节点表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_verify_node_ins
-- ----------------------------
DROP TABLE IF EXISTS `t_verify_node_ins`;
CREATE TABLE `t_verify_node_ins`  (
  `node_ins_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '任务审核人员节点id',
  `flow_ins_id` bigint(20) NOT NULL COMMENT '任务审核流id',
  `operation_id` bigint(20) NULL DEFAULT NULL COMMENT '审核人员id',
  `ins_flow_order` tinyint(4) NULL DEFAULT NULL COMMENT '审核顺序',
  `next_ins_node` bigint(20) NULL DEFAULT NULL COMMENT '下一任务审核人员节点id',
  `is_verify` tinyint(4) NULL DEFAULT NULL COMMENT '是否审核通过 ， 1.通过',
  `verify_time` datetime(0) NULL DEFAULT NULL COMMENT '审核时间',
  PRIMARY KEY (`node_ins_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 51 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '任务审核人员节点表' ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
