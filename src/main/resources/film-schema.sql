DROP TABLE IF EXISTS `film` CASCADE;


CREATE TABLE `film` (
`ID` int(16) NOT NULL auto_increment,
`title` VARCHAR(20) NOT NULL,
`rating` decimal(1,1) NOT NULL,
`yearofrelease` integer(20) NOT NULL,
`image` varchar(20) NOT NULL,
`lengthoffilm` varchar(20) NOT NULL,
PRIMARY KEY (ID));