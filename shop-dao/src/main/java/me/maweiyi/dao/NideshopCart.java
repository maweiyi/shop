package me.maweiyi.dao;

import java.math.BigDecimal;
import lombok.Data;

/**
* Created by Mybatis Generator 2018/12/28
*/
@Data
public class NideshopCart {
    private Integer id;

    private String userId;

    private Integer goodsId;

    private String goodsName;

    private BigDecimal retailPrice;

    private Integer number;

    private String listPicUrl;
}