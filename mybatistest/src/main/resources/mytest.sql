use eds;

drop table if exists VIID ;
create table if not exists VIID
(
/*必填*/SBBM                 integer not null auto_increment comment '设备编码',
/*必填*/SBMC                 varchar(128) not null comment '设备名称',
/*必填*/SBCS                 char(2) not null  comment '设备厂商',
/*必填*/XZQY                 char(8) not null comment '行政区域',

/*必填*/JD                   double(10, 6) not null comment '经度',
/*必填*/WD                   double(10, 6) not null comment '纬度',
        idJSFW               smallint not null  comment '监视方位',
/*必填*/AZSJ                 datetime     not null   default '1984-08-15 00:00:00'    comment '安装时间',
/*必填*/LXBCTS               int not null  default 0 comment '录像保存天数',
/*必填*/SFSH                 int not null default 0 comment '是否审核',
        updatetime           datetime default '1984-08-15 00:00:00' comment '更新时间', /*now()*/
        fromwhere            char(10) not null default 'other' comment '数据来源',
   primary key (SBBM)
);


drop table if exists  tblJSFW;
create table  if not exists tblJSFW
(
	id smallint not null auto_increment comment '字典类型编码',
	fwname varchar(50) not null comment '字典类型名称',
	primary key (id)
);

insert into tblJSFW(fwname) values("chaonan"), ("chaobei"),("dongbei");