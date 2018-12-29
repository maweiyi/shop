package me.maweiyi.dao;

import lombok.Data;

/**
* Created by Mybatis Generator 2018/12/28
*/
@Data
public class NideshopAddressCopy {
    private Integer id;

    private String name;

    private Integer userId;

    private String address;

    private String mobile;

    private Boolean isDefault;

    private String addressDetail;
}