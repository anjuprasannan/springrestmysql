CREATE DATABASE work;

USE work;

CREATE TABLE video_details (
  video_id INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  title VARCHAR(500) NOT NULL,
  category VARCHAR(5000) NOT NULL,
  rating INT(6)
);

describe video_details;

insert into video_details (title,category,rating) values("test1","entertainment",4);
insert into video_details (title,category,rating) values("test2","education",3);
insert into video_details (title,category,rating) values("test3","gaming",5);
insert into video_details (title,category,rating) values("test4","comedy",1);

select * from video_details;
1	test1	entertainment	4
2	test2	education	3
3	test3	gaming	5
4	test4	comedy	1

--java.sql.SQLException: Unable to load authentication plugin 'caching_sha2_password'.
--Starting with MySQL 8.0.4, they have changed the default authentication plugin for MySQL server from mysql_native_password to caching_sha2_password.
--ALTER USER 'root'@'localhost' IDENTIFIED WITH mysql_native_password BY 'Work@12345';