package me.maweiyi.mapper;

import me.maweiyi.dao.NideshopBrand;

/**
* Created by Mybatis Generator 2018/12/28
*/
public interface NideshopBrandMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(NideshopBrand record);

    int insertSelective(NideshopBrand record);

    NideshopBrand selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(NideshopBrand record);

    int updateByPrimaryKey(NideshopBrand record);
}