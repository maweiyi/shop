package me.maweiyi.mapper;

import me.maweiyi.dao.NideshopGoods;

/**
* Created by Mybatis Generator 2018/12/28
*/
public interface NideshopGoodsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(NideshopGoods record);

    int insertSelective(NideshopGoods record);

    NideshopGoods selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(NideshopGoods record);

    int updateByPrimaryKeyWithBLOBs(NideshopGoods record);

    int updateByPrimaryKey(NideshopGoods record);
}