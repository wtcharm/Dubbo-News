DROP DATABASE mldn ;
CREATE DATABASE mldn CHARACTER SET UTF8 ;
USE mldn ;
-- 创建数据表
CREATE TABLE news(
	nid			BIGINT AUTO_INCREMENT ,
	title		VARCHAR(50) ,
	note		TEXT ,
	photo		VARCHAR(50) ,
	CONSTRAINT pk_nid PRIMARY KEY(nid)
) ;

-- 提交事务
COMMIT ;

