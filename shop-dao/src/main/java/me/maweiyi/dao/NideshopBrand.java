package me.maweiyi.dao;

import java.math.BigDecimal;
import lombok.Data;

/**
* Created by Mybatis Generator 2018/12/28
*/
@Data
public class NideshopBrand {
    private Integer id;

    private String name;

    private String listPicUrl;

    private String simpleDesc;

    private String picUrl;

    private Integer sortOrder;

    private Boolean isShow;

    private BigDecimal floorPrice;

    private String appListPicUrl;

    private Boolean isNew;

    private String newPicUrl;

    private Integer newSortOrder;
}