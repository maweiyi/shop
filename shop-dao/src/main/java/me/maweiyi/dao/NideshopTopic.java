package me.maweiyi.dao;

import java.math.BigDecimal;
import lombok.Data;

/**
* Created by Mybatis Generator 2018/12/28
*/
@Data
public class NideshopTopic {
    private Integer id;

    private String title;

    private String avatar;

    private String itemPicUrl;

    private String subtitle;

    private Integer topicCategoryId;

    private BigDecimal priceInfo;

    private String readCount;

    private String scenePicUrl;

    private Integer topicTemplateId;

    private Integer topicTagId;

    private Integer sortOrder;

    private Boolean isShow;

    private String content;
}