CREATE DATABASE mytest;

USE mytest;

CREATE TABLE `news` (
  `id` int(11) NOT NULL auto_increment,
  `title` varchar(200) NOT NULL,
  `content` mediumtext NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


INSERT INTO `news` VALUES (1, 'title1', 'content1');
INSERT INTO `news` VALUES (2, 'title2', 'content2');
INSERT INTO `news` VALUES (3, 'title3', 'content3');
INSERT INTO `news` VALUES (4, 'title4', 'content4');
INSERT INTO `news` VALUES (5, 'title5', 'content5');