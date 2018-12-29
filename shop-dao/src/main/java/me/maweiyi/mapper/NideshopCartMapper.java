package me.maweiyi.mapper;

import me.maweiyi.dao.NideshopCart;

/**
* Created by Mybatis Generator 2018/12/28
*/
public interface NideshopCartMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(NideshopCart record);

    int insertSelective(NideshopCart record);

    NideshopCart selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(NideshopCart record);

    int updateByPrimaryKey(NideshopCart record);
}