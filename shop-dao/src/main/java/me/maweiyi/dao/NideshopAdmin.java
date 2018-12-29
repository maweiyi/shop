package me.maweiyi.dao;

import lombok.Data;

/**
* Created by Mybatis Generator 2018/12/28
*/
@Data
public class NideshopAdmin {
    private Integer id;

    private String username;

    private String password;

    private String passwordSalt;

    private String lastLoginIp;

    private Integer lastLoginTime;

    private Integer addTime;

    private Integer updateTime;

    private String avatar;

    private Integer adminRoleId;
}