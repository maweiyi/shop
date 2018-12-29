package me.maweiyi.mapper;

import me.maweiyi.dao.NideshopAd;

/**
* Created by Mybatis Generator 2018/12/28
*/
public interface NideshopAdMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(NideshopAd record);

    int insertSelective(NideshopAd record);

    NideshopAd selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(NideshopAd record);

    int updateByPrimaryKeyWithBLOBs(NideshopAd record);

    int updateByPrimaryKey(NideshopAd record);
}