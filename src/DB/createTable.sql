create database schools;
use schools;


create table schools.college(
	id int primary key AUTO_INCREMENT,
	name varchar(150) not null,
	street varchar(100),
	city varchar(30),
	state char(2),
	zip char(5),
	lat decimal(11,8),
	lng decimal(11,8),
	place_id varchar(120)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8;



create table schools.houseType(
	id tinyint primary key AUTO_INCREMENT,
	type varchar(50)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8;

drop table if exists schools.house;
create table schools.house(
	source_id bigint,
	id bigint primary key AUTO_INCREMENT,
	street varchar(100),
	city varchar(30),
	state char(2),
	zip char(5),
	lat decimal(11,8),
	lng decimal(11,8),
	place_id varchar(120),
	type_id tinyint,
	bath float(3,1),
	bed tinyint,
	foreign key house_fk(type_id) references houseType(id) ON UPDATE CASCADE ON DELETE CASCADE,
	UNIQUE KEY unique_ix_house (street,city,state,zip)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8;

/*
create table schools.company(
	id int primary key AUTO_INCREMENT,
	name varchar(100),
	street varchar(100),
	city varchar(30),
	state char(2),
	zip char(5),
	phone char(12),
	email varchar(30)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8;
*/

drop table if exists schools.user;
create table schools.user(
	source_id bigint,
	id bigint primary key AUTO_INCREMENT,
	name varchar(100),
	fname varchar(20),
	lname varchar(20),
	phone char(13),
	email varchar(30),
	qq bigint,
	weichat varchar(100),
	type tinyint, #0 for landlord 1 for broker 3 renter
	college_id int,
	company varchar(100),
	foreign key user_fk_1 (college_id) references college(id) ON UPDATE CASCADE ON DELETE CASCADE,
	UNIQUE KEY unique_ix_user_email (email)
	#UNIQUE KEY unique_ix_user_name (name)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8;

drop table if exists schools.distance;
create table schools.distance(
	id bigint primary key AUTO_INCREMENT,
	college_id int,
	house_id bigint,
	distance int,
	foreign key distance_fk_1 (college_id) references college(id) ON UPDATE CASCADE ON DELETE CASCADE,
	foreign key distance_fk_2 (house_id) references house(id) ON UPDATE CASCADE ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8;

LOAD DATA INFILE 'C://project//SchoolHouse//distance_detail.txt' INTO TABLE distance 
  FIELDS TERMINATED BY '||' 
 ;

insert into college (name,street,city,state,zip,lat,lng,place_id) select name,street,city,state,zip,lat,lng,place_id from college2;

drop table if exists schools.post;
create table schools.post(
	id bigint primary key AUTO_INCREMENT,
	house_id bigint,
	user_id bigint,
	summary text,
	forRent tinyint, #1 yes 0 forSale
	status tinyint, #1 active 0 inactive
	int price;
	foreign key post_fk_1 (house_id) references house(id) ON UPDATE CASCADE ON DELETE CASCADE,
	foreign key post_fk_2 (user_id) references user(id) ON UPDATE CASCADE ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8;


create table schools.findhouse(
	id bigint primary key AUTO_INCREMENT,
	college_id int,
	user_id bigint,
	house_type tinyint,
	bed tinyint,
	bath float(3,1),
	summary text,
	status tinyint, --0 inactive 1 active
	foreign key findhouse_fk_1 (college_id) references college(id) ON UPDATE CASCADE ON DELETE CASCADE,
	foreign key findhouse_fk_2 (user_id) references user(id) ON UPDATE CASCADE ON DELETE CASCADE,
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8;




LOAD DATA INFILE 'C://project//SchoolHouse//school.sql' INTO TABLE college 
  FIELDS TERMINATED BY '||' 
  (name,street,city,state,zip,lat,lng,place_id);

insert into college (name,street,city,state,zip,lat,lng,place_id) select name,street,city,state,zip,lat,lng,place_id from college2;



drop table if exists schools.tmp_homeDetails;
create table schools.tmp_homeDetails(
	source_id bigint,
	street varchar(100),
	city varchar(30),
	state char(2),
	zip char(5),
	summary text,
	contact varchar(100),
	company varchar(100),
	phone varchar(20),
	bath float(2,1),
	bed tinyint,
	price int,
	type varchar(50),
	forRent tinyint,
	lat decimal(11,8),
	lng decimal(11,8),
	place_id varchar(120)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8;


alter table tmp_homedetails add column lat decimal(11,8);
alter table tmp_homedetails add column lng decimal(11,8);
alter table tmp_homedetails add column place_id varchar(120);

LOAD DATA INFILE 'C://project//SchoolHouse//homeDetails_18301_detail.txt' INTO TABLE tmp_homeDetails 
  FIELDS TERMINATED BY '||' 
  (source_id,street,city,state,zip,summary,contact,company,phone,bath,bed,price,type,forRent)
;
	