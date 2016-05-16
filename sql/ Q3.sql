-- データベース作成
drop database if exists Q3;
create database Q3;
use Q3;

create table user(
	id int not null auto_increment,
	post varchar(10) unique,
	tel int unique,
	email varchar(100) unique,
	primary key(id)
);