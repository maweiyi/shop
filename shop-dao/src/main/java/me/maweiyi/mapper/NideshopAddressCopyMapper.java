package me.maweiyi.mapper;

import me.maweiyi.dao.NideshopAddressCopy;

/**
* Created by Mybatis Generator 2018/12/28
*/
public interface NideshopAddressCopyMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(NideshopAddressCopy record);

    int insertSelective(NideshopAddressCopy record);

    NideshopAddressCopy selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(NideshopAddressCopy record);

    int updateByPrimaryKey(NideshopAddressCopy record);
}