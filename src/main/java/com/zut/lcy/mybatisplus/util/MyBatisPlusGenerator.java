package com.zut.lcy.mybatisplus.util;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

import java.sql.SQLException;

public class MyBatisPlusGenerator {
    
    public static void main(String[] args) throws SQLException {
        
        GlobalConfig config = new GlobalConfig();
        
        config.setActiveRecord(true) // 是否支持AR模式
                .setAuthor("刘朝阳") // 作者
                .setOutputDir("D:\\SoftWare") // 生成路径
                .setFileOverride(true)  // 文件覆盖
                .setIdType(IdType.AUTO) // 主键策略
                .setServiceName("%sService")  // 设置生成的service接口的名字的首字母是否为I
                // IEmployeeService
                .setBaseResultMap(true)//生成基本的resultMap
                .setBaseColumnList(true);//生成基本的SQL片段
        
        //2. 数据源配置
        DataSourceConfig dsConfig = new DataSourceConfig();
        dsConfig.setDbType(DbType.MYSQL)  // 设置数据库类型
                .setDriverName("com.mysql.jdbc.Driver")
                .setUrl("jdbc:mysql://localhost:3306/exam?useSSL=false&useUnicode=true&characterEncoding=utf-8" +
                        "&allowMultiQueries=true&serverTimezone=UTC")
                .setUsername("root")
                .setPassword("root");
        
        //3. 策略配置globalConfiguration中
        StrategyConfig stConfig = new StrategyConfig();
        stConfig.setCapitalMode(true)
                .setNaming(NamingStrategy.underline_to_camel) // 数据库表映射到实体的命名策略
        ;  // 生成的表
        
        //4. 包名策略配置
        PackageConfig pkConfig = new PackageConfig();
        pkConfig.setParent("com.zut.lcy.mybatisplus")
                .setMapper("mapper")//dao
                .setService("service")//servcie
                .setController("controller")//controller
                .setEntity("entity")
                .setXml("mapper");//mapper.xml
        
        //5. 整合配置
        AutoGenerator ag = new AutoGenerator();
        ag.setGlobalConfig(config)
                .setDataSource(dsConfig)
                .setStrategy(stConfig)
                .setPackageInfo(pkConfig);
        ag.execute();
    }
}

//本项目中使用的sqk文件


///*
// Navicat Premium Data Transfer
//
// Source Server         : localhost
// Source Server Type    : MySQL
// Source Server Version : 50727
// Source Host           : localhost:3306
// Source Schema         : exam
//
// Target Server Type    : MySQL
// Target Server Version : 50727
// File Encoding         : 65001
//
// Date: 17/12/2019 11:52:43
//*/
//
//    SET NAMES utf8mb4;
//        SET FOREIGN_KEY_CHECKS = 0;
//
//        -- ----------------------------
//        -- Table structure for student
//        -- ----------------------------
//        DROP TABLE IF EXISTS `student`;
//        CREATE TABLE `student`  (
//        `id` int(11) NOT NULL AUTO_INCREMENT,
//        `s_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
//        `s_age` int(11) NULL DEFAULT NULL,
//        `s_gender` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
//        `s_address` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
//        `s_education` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
//        `s_major` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
//        PRIMARY KEY (`id`) USING BTREE
//        ) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;
//
//        -- ----------------------------
//        -- Table structure for user
//        -- ----------------------------
//        DROP TABLE IF EXISTS `user`;
//        CREATE TABLE `user`  (
//        `username` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
//        `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
//        PRIMARY KEY (`username`) USING BTREE
//        ) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;
//
//        SET FOREIGN_KEY_CHECKS = 1;

