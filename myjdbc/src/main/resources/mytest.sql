use eds;
drop table edstesttable;

CREATE TABLE if not exists `edstesttable`  (
  `keyme` varchar(64) NOT NULL,
  `value` varchar(1024) NOT NULL,
  PRIMARY KEY (`keyme`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

insert into edstesttable values ("aaxa", "bbb"), ("ccc", "dxdd");
