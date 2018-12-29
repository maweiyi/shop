package me.maweiyi.dao;

import lombok.Data;

/**
* Created by Mybatis Generator 2018/12/28
*/
@Data
public class NideshopAd {
    private Integer id;

    private Integer adPositionId;

    private Integer mediaType;

    private String name;

    private String link;

    private String content;

    private Integer endTime;

    private Integer enabled;

    private String imageUrl;
}