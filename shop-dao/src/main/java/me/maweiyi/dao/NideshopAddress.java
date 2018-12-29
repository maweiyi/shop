package me.maweiyi.dao;

import lombok.Data;

/**
* Created by Mybatis Generator 2018/12/28
*/
@Data
public class NideshopAddress {
    private Integer id;

    private String name;

    private String userId;

    private String address;

    private String mobile;

    private Boolean isDefault;

    private String addressDetail;
}