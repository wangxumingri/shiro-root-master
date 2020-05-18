drop table if exists core_users;

/*==============================================================*/
/* Table: core_users                                            */
/*==============================================================*/
create table core_users
(
    uid              	 bigint(20) not null auto_increment,
    name                 varchar(120),
    loginId              varchar(100),
    password             varchar(120),
    status               char(1) comment '用户状态',
    loginSuccessCount    int(11) comment '登录成功总次数',
    lastLoginSuccessTime timestamp comment '最后一次成功登录时间',
    lastLoginFailureTime timestamp comment '最后一次失败登录时间',
    lastLoginIP          varchar(40) comment '最后一次登录IP地址',
    createDate           datetime,
    lastUpdateDate       datetime,
    firstLogin           smallint(6) comment '初次登录标识',
    loginFailureCount    smallint(6) comment '连续登录失败次数',
    createUser           varchar(100),
    lastUpdateUser       varchar(100),
    appId                varchar(30) comment '应用id',
    primary key (uid)
);

CREATE TABLE `user` (
                        `id` bigint(20) NOT NULL AUTO_INCREMENT,
                        `username` varchar(16) DEFAULT NULL,
                        `password` varchar(32) DEFAULT NULL,
                        `nickName` varchar(16) DEFAULT NULL,
                        `phone` varchar(16) DEFAULT NULL,
                        `email` varchar(32) DEFAULT NULL,
                        `loginTime` datetime DEFAULT NULL,
                        `failCount` tinyint(3) unsigned DEFAULT NULL,
                        PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8