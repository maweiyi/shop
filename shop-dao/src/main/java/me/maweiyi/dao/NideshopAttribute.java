package me.maweiyi.dao;

import lombok.Data;

/**
* Created by Mybatis Generator 2018/12/28
*/
@Data
public class NideshopAttribute {
    private Integer id;

    private Integer attributeCategoryId;

    private String name;

    private Boolean inputType;

    private Integer sortOrder;

    private String values;
}