SET SESSION FOREIGN_KEY_CHECKS=0;

/* Drop Tables */

DROP TABLE IF EXISTS quiz;
DROP TABLE IF EXISTS user;




/* Create Tables */

CREATE TABLE quiz
(
	-- クイズID
	-- 主キー
	id int NOT NULL AUTO_INCREMENT COMMENT 'クイズID
主キー',
	-- クイズID
	-- 主キー
	user_id int NOT NULL COMMENT 'クイズID
主キー',
	PRIMARY KEY (id)
);


CREATE TABLE user
(
	-- クイズID
	-- 主キー
	id int NOT NULL AUTO_INCREMENT COMMENT 'クイズID
主キー',
	-- アカウント名
	account varchar(32) NOT NULL COMMENT 'アカウント名',
	name varchar(64) NOT NULL,
	-- パスワード
	password varchar(256) NOT NULL COMMENT 'パスワード',
	-- パスワードのハッシュ化
	salt varchar(64) NOT NULL COMMENT 'パスワードのハッシュ化',
	-- 管理者 true
	-- 一般ユーザーfalse
	is_admin boolean NOT NULL COMMENT '管理者 true
一般ユーザーfalse',
	PRIMARY KEY (id),
	UNIQUE (account)
);



/* Create Foreign Keys */

ALTER TABLE quiz
	ADD FOREIGN KEY (user_id)
	REFERENCES user (id)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;



