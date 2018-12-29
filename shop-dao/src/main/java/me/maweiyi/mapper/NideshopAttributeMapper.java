package me.maweiyi.mapper;

import me.maweiyi.dao.NideshopAttribute;

/**
* Created by Mybatis Generator 2018/12/28
*/
public interface NideshopAttributeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(NideshopAttribute record);

    int insertSelective(NideshopAttribute record);

    NideshopAttribute selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(NideshopAttribute record);

    int updateByPrimaryKeyWithBLOBs(NideshopAttribute record);

    int updateByPrimaryKey(NideshopAttribute record);
}