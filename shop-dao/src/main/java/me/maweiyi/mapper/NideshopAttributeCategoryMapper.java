package me.maweiyi.mapper;

import me.maweiyi.dao.NideshopAttributeCategory;

/**
* Created by Mybatis Generator 2018/12/28
*/
public interface NideshopAttributeCategoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(NideshopAttributeCategory record);

    int insertSelective(NideshopAttributeCategory record);

    NideshopAttributeCategory selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(NideshopAttributeCategory record);

    int updateByPrimaryKey(NideshopAttributeCategory record);
}