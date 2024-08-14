# 苍穹外卖

本项目是使用 Spring Boot 框架开发的一个在线外卖订购系统。

## 技术栈

- 后端框架
  - SpringBoot (2.7.3)
  - mybatis
- 数据库
  - MySql
  - Redis
- 前端框架
  - Vue
  - Uniapp
  - ElementUI
- 前后端通信
  - RESTful API

## Windows 开发环境搭建

1. 安装 Java JDK 17 并配置环境变量
2. 安装 MySQL、Redis 数据库并创建相应数据库

   - 创建 MySQL 数据库与表: 运行 [sky.sql](sky.sql)

3. 安装 Maven 构建工具

4. 克隆项目到本地 `git clone https://github.com/Sonder-MX/sky-take-out.git `
5. 修改配置文件 [application.yml](./sky-server/src/main/resources/application.yml)

   ```yml
   spring:
     datasource:
       url: jdbc:mysql://url
       username: root
       password: 数据库密码
     data:
       redis:
         password: redis数据库密码
   ```
   
6. 运行项目
