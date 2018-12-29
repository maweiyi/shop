package me.maweiyi.mapper;

import me.maweiyi.dao.NideshopAdPosition;

/**
* Created by Mybatis Generator 2018/12/28
*/
public interface NideshopAdPositionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(NideshopAdPosition record);

    int insertSelective(NideshopAdPosition record);

    NideshopAdPosition selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(NideshopAdPosition record);

    int updateByPrimaryKey(NideshopAdPosition record);
}