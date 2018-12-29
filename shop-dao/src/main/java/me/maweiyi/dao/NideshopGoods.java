package me.maweiyi.dao;

import java.math.BigDecimal;
import lombok.Data;

/**
* Created by Mybatis Generator 2018/12/28
*/
@Data
public class NideshopGoods {
    private Integer id;

    private Integer categoryId;

    private String goodsSn;

    private String name;

    private Integer brandId;

    private Integer goodsNumber;

    private String keywords;

    private String goodsBrief;

    private Boolean isOnSale;

    private Integer addTime;

    private Integer sortOrder;

    private Boolean isDelete;

    private Integer attributeCategory;

    private BigDecimal counterPrice;

    private BigDecimal extraPrice;

    private Boolean isNew;

    private String goodsUnit;

    private String primaryPicUrl;

    private String listPicUrl;

    private BigDecimal retailPrice;

    private Integer sellVolume;

    private Integer primaryProductId;

    private BigDecimal unitPrice;

    private String promotionDesc;

    private String promotionTag;

    private BigDecimal appExclusivePrice;

    private Boolean isAppExclusive;

    private Boolean isLimited;

    private Boolean isHot;

    private String goodsDesc;
}