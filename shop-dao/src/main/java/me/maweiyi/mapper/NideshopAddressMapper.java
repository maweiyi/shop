package me.maweiyi.mapper;

import me.maweiyi.dao.NideshopAddress;

/**
* Created by Mybatis Generator 2018/12/28
*/
public interface NideshopAddressMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(NideshopAddress record);

    int insertSelective(NideshopAddress record);

    NideshopAddress selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(NideshopAddress record);

    int updateByPrimaryKey(NideshopAddress record);
}