package me.maweiyi.mapper;

import me.maweiyi.dao.NideshopAdmin;

/**
* Created by Mybatis Generator 2018/12/28
*/
public interface NideshopAdminMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(NideshopAdmin record);

    int insertSelective(NideshopAdmin record);

    NideshopAdmin selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(NideshopAdmin record);

    int updateByPrimaryKey(NideshopAdmin record);
}